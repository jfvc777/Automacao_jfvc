package configurationProject;

import classesPageObjects.UtilTestePO;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.sql.Driver;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Juan Castillo
 * @since 18/06/2021
 */
public class ConfigConecctionProject extends UtilTestePO {

    public ExtentReports extent;
    public static ExtentReports scenarioDEF;
    public static ExtentReports features;
    public static String reportLocation = "/target/extent-reports/";

    public String filename = reportLocation + "extentreport.html";

    public ConfigConecctionProject() {

    }


//    public void ExtentReport(){
//        extent = new ExtentReports();
//        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(filename);
//        htmlReporter.config().setTheme(Theme.DARK);
//        htmlReporter.config().setDocumentTitle("Teste URgente");
//        htmlReporter.config().setEncoding("utf-8");
//        htmlReporter.config().setReportName("Test-report");
//        extent.attachReporter(htmlReporter);
//
//    }

    public void ExtentReportScreen() throws IOException {
        File scr = ((TakesScreenshot) getBrowser()).getScreenshotAs(OutputType.FILE);
        Files.copy(scr.toPath(),new File(reportLocation+"screen.png").toPath());
    }

    public void FlushReport(){
        extent.flush();
    }


//    public String getReportConfigPath() throws IOException {
//        String reportConfigPath = lerProperties("src/test/resources/extent", "ReportPath") + lerProperties("src/test/resources/extent", "ReportFile");
//        if(reportConfigPath!= null) return reportConfigPath;
//        else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");
//    }
//
//    public static void writeExtentReport() throws IOException {
//        String reportConfigPath = lerProperties("src/test/resources/extent", "loadXMLConfigPath");
//        Reporter.loadXMLConfig(new File(reportConfigPath));
//    }
//
//    public static void setupExtentLog() throws IOException {
//        ExtentProperties extentProperties = ExtentProperties.INSTANCE;
//        boolean bSetup = Boolean.parseBoolean(lerProperties("src/test/resources/extent", "enableLogger"));
//
////        if (bSetup) {
////            if (lerProperties("src/test/resources/extent", "loggerPath") != null && !lerProperties("src/test/resources/extent", "loggerPath").isEmpty()) {
////                extentProperties.setLoggerPath(lerProperties("src/test/resources/extent", "loggerPath"));
////            } else {
////                extentProperties.setLoggerPath("target/logger/extent-reports/logger");
////            }
////        }
//    }
//
//
//    public static void setExtentReportsPath() throws IOException {
//        ExtentProperties extentProperties = ExtentProperties.INSTANCE;
//        String reportPath = lerProperties("src/test/resources/extent", "ReportPath") + lerProperties("src/test/resources/extent", "ReportFile");
//        extentProperties.setReportPath(reportPath);
//    }
//
//
//    public static void setupExtentReports() throws IOException {
//        String sFileExtentConfigXML = lerProperties("src/test/resources/extent", "loadXMLConfigPath");
//        Reporter.loadXMLConfig(new File(sFileExtentConfigXML));
//        Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
//        Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
//        Reporter.setSystemInfo("OS Name", System.getProperty("os.name"));
//        Reporter.setSystemInfo("OS Version", System.getProperty("os.version"));
//        Reporter.setSystemInfo("User language", System.getProperty("user.language"));
//        Reporter.setSystemInfo("CPU", System.getProperty("cpu"));
//
//        if (lerProperties("src/test/resources/extent", "enableLogger") != null && lerProperties("src/test/resources/extent", "enableLogger").equalsIgnoreCase("true")) {
//            Reporter.setTestRunnerOutput("Logger habilitado!");
//        } else {
//            Reporter.setTestRunnerOutput("Logger deshabilitado!");
//        }
//
//
//    }
//
//    protected void setCucumberLanguage() throws IOException {
//        try {
//            Reporter.getExtentReport().setGherkinDialect(lerProperties("src/test/resources/extent", "Language"));
//        } catch (UnsupportedEncodingException e) {
//            Logger logger = Logger.getLogger("InfoLogging");
//            logger.log(Level.SEVERE, e.getMessage());
//        }
//    }


}
