package hooks;

import classesPageObjects.UtilTestePO;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import org.junit.After;
import org.junit.AfterClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


/**
 * @author Juan Castillo
 * @since 01/12/2020
 */
public class Hook extends UtilTestePO {

//    @AfterStep
//    public void addScreenshot(Scenario scenario){
//
//        final byte[] screenshot = ((TakesScreenshot) getBrowser()).getScreenshotAs(OutputType.BYTES);
//        scenario.attach(screenshot, "image/png", "image");
//
//    }



}
