package runner;


import configurationProject.ConfigConecctionProject;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.runner.RunWith;


/**
 * @author Juan Castillo
 * @since 18/11/2020
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/features",
        glue = {"stepdefinition", "hooks"},
        tags = ("@caso_002"),
        plugin = {
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        monochrome = true
)

public class RunTest extends ConfigConecctionProject {
    @AfterClass
    public static void fechar() {
        fecharBrowser();
    }


}
