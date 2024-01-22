package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@CucumberOptions(
        features = {"src/test/resources/features/buy_products.feature"}
     //  ,tags = {"@BuyProducts"},
        ,glue = "stepdefinitions"
        ,snippets = SnippetType.CAMELCASE
)
@RunWith(CucumberWithSerenity.class)
public class RunnerSL {
}
