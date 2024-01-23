package banco.stepdefinitions;

import banco.interactions.IrA;
import banco.tasks.DiligenciarDatos;
import banco.utils.PaginaWeb;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CreacionCuentaStepDefinitions {
    @Dado("^el usuario quiere crear una cuenta en el portal de Cinemark$")
    public void elUsuarioQuiereCrearUnaCuentaEnElPortalDeCinemark(String actor) {
        theActorCalled(actor).wasAbleTo(
                IrA.laPagina(PaginaWeb.CINEMARK.getUrl()));
    }

    @Cuando("^diligencia el formulario de registro$")
    public void diligenciaElFormularioDeRegistro() {
        theActorInTheSpotlight().attemptsTo(DiligenciarDatos.delFormulario().conDatosNuevos());
    }
}
