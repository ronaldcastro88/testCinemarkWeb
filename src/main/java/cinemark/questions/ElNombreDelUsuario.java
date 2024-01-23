package cinemark.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static cinemark.userinterfaces.DashboardPage.NOMBRE_USUARIO_DASHBOARD;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ElNombreDelUsario implements Question<String> {

    public static ElNombreDelUsario enElDashboard() {
        return new ElNombreDelUsario();
    }

    @Override
    @Step("Verifica el nombre del usuario en el dashboard principal")
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(NOMBRE_USUARIO_DASHBOARD,isPresent()).forNoMoreThan(5).seconds());
        return Text.of(NOMBRE_USUARIO_DASHBOARD).viewedBy(actor).asString();
    }
}
