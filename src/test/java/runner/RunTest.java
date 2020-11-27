package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * @author Juan Castillo
 * @since 18/11/2020
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/features/",
        plugin = {
                "pretty",
                "html:target/cucumber",
                "json:target/cucumber.json"
        }
)

public class RunTest {


}
