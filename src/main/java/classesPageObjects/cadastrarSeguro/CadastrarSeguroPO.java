package classesPageObjects.cadastrarSeguro;

import classesPageObjects.UtilTestePO;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

/**
 * @author Juan Castillo
 * @since 25/05/2021
 */
public class CadastrarSeguroPO extends UtilTestePO {

    /******************Aba Enter Vehicle Data*********************/
    @FindBy(xpath = "//a[@id='entervehicledata']")
    private WebElement lblAbaEnterVehicle;
    @FindBy(xpath = "//button[@id='nextenterinsurantdata']")
    private WebElement btnNextEnterVehicule;
    /******************Aba Enter Insurant Data*********************/
    @FindBy(xpath = "//a[@id='enterinsurantdata']")
    private WebElement lblAbaEnterInsurance;
    @FindBy(xpath = "//button[@id='nextenterproductdata']")
    private WebElement btnNextEnterProduct;
    /******************Aba Enter Product Data*********************/
    @FindBy(xpath = "//a[@id='enterproductdata']")
    private WebElement lblAbaProduct;
    /******************Aba Select Price Option*********************/
    @FindBy(xpath = "//a[@id='selectpriceoption']")
    private WebElement lblAbaSelectPrice;
    /******************Aba Select Send Quote*********************/
    @FindBy(xpath = "//a[@id='sendquote']")
    private WebElement lblAbaSendQuote;

    public void logarSite() throws IOException {
        String urlSite = lerProperties("src/main/resources/param_site", "url_site");
        inicializarBrowser(urlSite);
    }

    private String escolherAbaValidacao(String aba) {
        String abaSelecionada = "";
        String[] parsearAba = new String[0];

        switch (aba) {
            case "Enter Vehicle Data":
                abaSelecionada = this.lblAbaEnterVehicle.getText();
                break;
            case "Enter Insurant Data":
                abaSelecionada = this.lblAbaEnterInsurance.getText();
                break;
            case "Enter Product Data":
                abaSelecionada = this.lblAbaProduct.getText();
                break;
            case "Select Price Option":
                abaSelecionada = this.lblAbaSelectPrice.getText();
                break;
            case "Send Quote":
                abaSelecionada = this.lblAbaSendQuote.getText();
                break;
        }

        parsearAba = abaSelecionada.split("\n");
        abaSelecionada = parsearAba[0];

        return abaSelecionada;
    }

    public void compararAba(String aba) {
        String comparacaoAba = escolherAbaValidacao(aba);
        Assert.assertEquals(aba, comparacaoAba);
    }

    public String formataData(String param) {
        String formato = param;
        String[] formatoParse = new String[0];
        formatoParse = param.split("/");

        if (Integer.parseInt(formatoParse[0]) > 12) {
            formato = formatoParse[1] + "/" + formatoParse[0] + "/" + formatoParse[2];
        }

        return formato;
    }

    public void clicarCombo(WebElement param, String element) {
        elementExist(param);
        Select sltOb = new Select(param);
        sltOb.selectByVisibleText(element);
    }

}
