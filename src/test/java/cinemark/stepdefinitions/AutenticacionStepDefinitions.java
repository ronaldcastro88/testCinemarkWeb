package cinemark.stepdefinitions;

import cinemark.exceptions.PortalCinemarkError;
import cinemark.interactions.IrA;
import cinemark.questions.ElNombreDelUsuario;
import cinemark.tasks.IniciaSesion;
import cinemark.utils.PaginaWeb;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class AutenticacionStepDefinitions {

    @Dado("^(.*) no se encuentra autenticado$")
    public void ronaldNoSeEncuentraAutenticado(String actor) {
        theActorCalled(actor).wasAbleTo(
                IrA.laPagina(PaginaWeb.CINEMARK.getUrl()));
    }

    @Cuando("^el usuario ingresa sus credenciales$")
    public void elUsuarioIngresaSusCredenciales() {
        theActorInTheSpotlight().attemptsTo(IniciaSesion.enCinemark().conDatosCorrectos());
    }


    @Entonces("^debe ver el nombre del usuario (.*) en el dashboard$")
    public void debeVerElNombreDelUsuarioRonaldCastroEnElDashboard(String nombreUsuario) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ElNombreDelUsuario.enElDashboard(), equalTo(nombreUsuario))
                .orComplainWith(PortalCinemarkError.class, PortalCinemarkError.INICIO_DE_SESION_FALLIDO));
    }
}