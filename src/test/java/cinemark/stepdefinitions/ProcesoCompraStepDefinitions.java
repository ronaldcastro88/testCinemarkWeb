package cinemark.stepdefinitions;

import cinemark.exceptions.PortalCinemarkError;
import cinemark.interactions.IrA;
import cinemark.questions.LaCompraExitosa;
import cinemark.tasks.IniciaSesion;
import cinemark.utils.PaginaWeb;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static cinemark.userinterfaces.DashboardPage.*;
import static cinemark.userinterfaces.PrivadoPage.SELECTOR_CIUDAD;
import static cinemark.userinterfaces.PrivadoPage.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static org.hamcrest.Matchers.equalTo;

public class ProcesoCompraStepDefinitions {

    @Dado("^(.*)se encuentra autenticado en el portal de Cinemark$")
    public void elUsuarioSeEncuentraAutenticadoEnElPortalDeCinemark(String actor) {
        theActorCalled(actor).wasAbleTo(
                IrA.laPagina(PaginaWeb.CINEMARK.getUrl()),
                IniciaSesion.enCinemark().conDatosCorrectos());
    }

    @Cuando("^realiza todo el proceso el carrito de compras$")
    public void realizaTodoElProcesoElCarritoDeCompras() {
        theActorInTheSpotlight().attemptsTo(WaitUntil.the(PELICULA, isPresent()).forNoMoreThan(5).seconds(),
                Click.on(SELECTOR_CIUDAD),
                Click.on(SELECTOR_ITEM_BOGOTA),
                WaitUntil.the(PELICULA, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(PELICULA),
                Scroll.to(SELECTOR_HORARIO).andAlignToTop(),
                //WaitUntil.the(SELECTOR_HORARIO, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(SELECTOR_HORARIO),
                Click.on(BOTON_CONFIRMAR_SILLAS),
                WaitUntil.the(MASCARA_CERRAR_MODAL, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(MASCARA_CERRAR_MODAL),
                Scroll.to(SELECTOR_CANTIDAD_SILLAS).andAlignToTop(),
                Click.on(SELECTOR_CANTIDAD_SILLAS),
                Click.on(SELECTOR_CANTIDAD),
                Click.on(BOTON_CONTINUAR),
                Click.on(SELECTOR_SILLA),
                Click.on(BOTON_CONTINUAR),
                Click.on(BOTON_CONFIRMAR_SLLA),
                WaitUntil.the(BOTON_AGREGAR_CARRITO, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(BOTON_AGREGAR_CARRITO),
                Click.on(BOTON_CONTINUAR),
                WaitUntil.the(DESCRIPCION_PELICULA, isVisible()).forNoMoreThan(80).seconds(),
                Click.on(BOTON_CONTINUAR),
                WaitUntil.the(SELECCION_METODO_PAGO, isVisible()).forNoMoreThan(80).seconds(),
                Click.on(CERRAR_MODAL_CINE_CLUB),
                Scroll.to(SELECTOR_TARJETA).andAlignToTop(),
                Click.on(SELECTOR_TARJETA),
                Scroll.to(CAMPO_NUMERO_TARJETA).andAlignToTop(),
                WaitUntil.the(CAMPO_NUMERO_TARJETA, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue("4111111111111111").into(CAMPO_NUMERO_TARJETA),
                Enter.theValue("APPROVED").into(CAMPO_NOMBRE_TARJETA),
                Enter.theValue("777").into(CAMPO_CVV),
                Click.on(SELECTOR_CUOTAS),
                Click.on(SELECTOR_CANTIDAD),
                Click.on(CHECK_TERMINOS_CARRITO),
                Click.on(BOTON_CONTINUAR),
                Click.on(BOTON_ACEPTAR_PAGO)
        );
    }

    @Entonces("^se muestra el QR del tiquete de compra exitosa con el (.*)$")
    public void seMuestraElQRDelTiqueteDeCompraExitosaConElCodigoDeConfirmacion(String mensaje) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(LaCompraExitosa.delTiquete(), equalTo(mensaje))
                .orComplainWith(PortalCinemarkError.class, PortalCinemarkError.COMPRA_NO_REALIZADA));

    }
}
