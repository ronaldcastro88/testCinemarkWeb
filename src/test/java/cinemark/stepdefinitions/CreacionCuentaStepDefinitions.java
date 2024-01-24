package cinemark.stepdefinitions;

import cinemark.exceptions.PortalCinemarkError;
import cinemark.interactions.IrA;
import cinemark.questions.ElTextoExitoso;
import cinemark.tasks.DiligenciarDatos;
import cinemark.utils.PaginaWeb;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class CreacionCuentaStepDefinitions {
    @Dado("^(.*) quiere crear una cuenta en el portal de Cinemark$")
    public void elUsuarioQuiereCrearUnaCuentaEnElPortalDeCinemark(String actor) {
        theActorCalled(actor).wasAbleTo(
                IrA.laPagina(PaginaWeb.CINEMARK.getUrl()));
    }
    @Cuando("^diligencia el formulario de registro$")
    public void diligenciaElFormularioDeRegistro() {
        theActorInTheSpotlight().attemptsTo(DiligenciarDatos.delFormulario().conDatosNuevos());
    }
    @Entonces("^debe mostrar el mensaje (.*)$")
    public void debeMostrarElMensajeExitoso(String mensajeExitoso) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ElTextoExitoso.alFinal(), equalTo(mensajeExitoso))
                .orComplainWith(PortalCinemarkError.class, PortalCinemarkError.FORMULARIO_MAL_DILIGENCIADO));
    }
}
