package cinemark.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/ProcesoCompra.feature",
        glue = {"cinemark/stepdefinitions"},
        tags = {"@ProcesoCompra"},
        snippets = SnippetType.CAMELCASE
)
public class ProcesoCompraRunner {
}