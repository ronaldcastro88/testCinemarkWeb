package cinemark.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static cinemark.userinterfaces.PrivadoPage.BOTON_FINALIZAR;
import static cinemark.userinterfaces.PrivadoPage.QR_EXITOSO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class LaCompraExitosa implements Question<String> {

    public static LaCompraExitosa delTiquete() {
        return new LaCompraExitosa();
    }

    @Override
    @Step("Verifica el QR con la compra exitosa")
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(QR_EXITOSO,isPresent()).forNoMoreThan(80).seconds(),
                Scroll.to(BOTON_FINALIZAR).andAlignToTop(),
                Click.on(BOTON_FINALIZAR));
        return Text.of(QR_EXITOSO).viewedBy(actor).asString();
    }
}
