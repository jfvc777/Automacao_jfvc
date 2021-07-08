package classesPageObjects;

import com.aventstack.extentreports.ExtentReports;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import javax.swing.text.MaskFormatter;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/**
 * @author Juan Castillo
 * @since 26/05/2021
 */
public class UtilTestePO {

    public static WebDriver browser;
    private ArrayList<Integer> listaAleatoria = new ArrayList<Integer>();
    private ArrayList<Integer> listaNumMultiplicados = null;

    public static WebDriver getBrowser() {
        return browser;
    }


    private WebDriver driverBrowser() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        browser = new ChromeDriver();
        return browser;
    }

    public boolean elementExist(WebElement element) {
        try {
            return element.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public WebElement stringToWebElement(String param) {
        return browser.findElement(By.xpath(param));
    }

    private static Properties obterProperties(String nomeArquivo) throws IOException {
        Properties prop = new Properties();
        FileInputStream file = new FileInputStream("./" + nomeArquivo + ".properties");
        prop.load(file);
        return prop;
    }

    public static String lerProperties(String nomeArquivo, String nomeLinha) throws IOException {
        String linha = "";
        Properties prop = obterProperties(nomeArquivo);
        linha = prop.getProperty(nomeLinha);
        return linha;
    }

    public void carregarPageFactory() {
        PageFactory.initElements(browser, this);
    }


    public void inicializarBrowser(String url) {
        WebDriver driver = driverBrowser();
        PageFactory.initElements(driver, this);
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public static void fecharBrowser() {
        getBrowser().quit();
    }

    public String getReportConfigPath() throws IOException {
        String reportConfigPath = lerProperties("param_site", "url_extent");
        if (reportConfigPath != null) return reportConfigPath;
        else
            throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");
    }

    //Para gerar CPF VERIFICADO

    public int geraNumAleatorio() {
        int numero = (int) (Math.random() * 10);
        return numero;
    }

    public ArrayList<Integer> geraCPFParcial() {
        for (int i = 0; i < 9; i++) {
            listaAleatoria.add(geraNumAleatorio());
        }

        return listaAleatoria;
    }

    public ArrayList<Integer> geraPrimeiroDigito() {
        listaNumMultiplicados = new ArrayList<Integer>();
        int primeiroDigito;
        int totalSomatoria = 0;
        int restoDivisao;
        int peso = 10;

        for (int item : listaAleatoria) {
            listaNumMultiplicados.add(item * peso);

            peso--;
        }

        for (int item : listaNumMultiplicados) {
            totalSomatoria += item;
        }

        restoDivisao = (totalSomatoria % 11);

        if (restoDivisao < 2) {
            primeiroDigito = 0;
        } else {
            primeiroDigito = 11 - restoDivisao;
        }

        listaAleatoria.add(primeiroDigito);

        return listaAleatoria;
    }

    public ArrayList<Integer> geraSegundoDigito() {
        listaNumMultiplicados = new ArrayList<Integer>();
        int segundoDigito;
        int totalSomatoria = 0;
        int restoDivisao;
        int peso = 11;

        for (int item : listaAleatoria) {
            listaNumMultiplicados.add(item * peso);

            peso--;
        }

        for (int item : listaNumMultiplicados) {
            totalSomatoria += item;
        }

        restoDivisao = (totalSomatoria % 11);

        if (restoDivisao < 2) {
            segundoDigito = 0;
        } else {
            segundoDigito = 11 - restoDivisao;
        }

        listaAleatoria.add(segundoDigito);

        return listaAleatoria;
    }

    public String geraCPFFinal() {
        geraCPFParcial();
        geraPrimeiroDigito();
        geraSegundoDigito();

        String cpf = "";
        String texto = "";

		for (int item : listaAleatoria) {
            texto += item;
        }

        try {
            MaskFormatter mf = new MaskFormatter("###.###.###-##");
            mf.setValueContainsLiteralCharacters(false);
            cpf = mf.valueToString(texto);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return cpf;
    }


}
