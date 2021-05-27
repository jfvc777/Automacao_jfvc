package runner;


import classesPageObjects.UtilTestePO;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * @author Juan Castillo
 * @since 18/11/2020
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/features",
        glue = {"stepdefinition", "hooks"},
        tags = ("@cadastro_seguro"),
        plugin = {
                "pretty",
                "html:target/cucumber",
                "json:target/cucumber.json"
        }
)

public class RunTest extends UtilTestePO {



}
