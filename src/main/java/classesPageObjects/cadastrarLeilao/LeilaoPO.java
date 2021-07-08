package classesPageObjects.cadastrarLeilao;

import classesPageObjects.UtilTestePO;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Juan Castillo
 * @since 23/06/2021
 */
public class LeilaoPO extends UtilTestePO {

    @FindBy(xpath = "//app-header/nav[1]/div[1]/ul[1]/li[1]/a[1]")
    private WebElement btnHome;
    @FindBy(xpath = "//app-header/nav[1]/div[1]/ul[1]/li[2]/a[1]")
    private WebElement btnAuctions;
    @FindBy(xpath = "//h3[contains(text(),'Auctions')]")
    private WebElement lblAuctions;
    @FindBy(xpath = "//a[contains(text(),'Sign Out')]")
    private WebElement btnSignOut;
    @FindBy(xpath = "//a[contains(text(),'Create Auction')]")
    private WebElement btnCreateAuction;
    @FindBy(xpath = "//input[@id='name']")
    private WebElement cmpNomeLeilao;
    @FindBy(xpath = "//input[@id='value']")
    private WebElement cmpValorLeilao;
    @FindBy(xpath = "//input[@id='used']")
    private WebElement chkUsado;
    @FindBy(xpath = "//button[contains(text(),'Sing Up')]")
    private WebElement btnAvancar;
    @FindBy(xpath = "//button[contains(text(),'End Auction')]")
    private WebElement btnEndAuction;
    @FindBy(xpath = "//input[@id='value']")
    private WebElement cmpValorBID;
    @FindBy(xpath = "//button[contains(text(),'Bid')]")
    private WebElement btnBid;
    @FindBy(xpath = "//h3[contains(text(),'Create an Auction')]")
    private WebElement lblCreateAuction;

    protected String linkLeioCriado = "//a[contains(text(),'%s')]";
    protected String lblValueBID = "//td[contains(text(),'%s')]";

    public LeilaoPO() {
        carregarPageFactory();
    }

    public void validarLeilaoHome() {
        elementExist(lblAuctions);
    }

    public void clicarAutionsHome() {
        elementExist(btnAuctions);
        this.btnAuctions.click();
    }

    private WebElement labelBIDCriado(String valueBID) {
        int valueSUM = Integer.parseInt(valueBID);
        valueSUM = valueSUM + 1;
        String valBIDNovo = String.valueOf(valueSUM);
        String lnkBIDCriado = String.format(lblValueBID, valBIDNovo);
        return stringToWebElement(lnkBIDCriado);
    }

    public void validarBIDCriado(String valueBID){
        elementExist(labelBIDCriado(valueBID));
    }


    public void validarBotaoEndAutions() {

        if (btnAuctions.isEnabled()) {
            elementExist(btnEndAuction);
        }
    }

    public void clicarSignUP() {
        elementExist(btnAvancar);
        this.btnAvancar.click();
    }

    public void validarCreationLeilaoHome(String param) {
        String lblParam = lblCreateAuction.getText();
        Assert.assertEquals(lblParam, param);
    }

    public void clicarCreateAuction() {
        elementExist(btnCreateAuction);
        this.btnCreateAuction.click();
    }

    public void preencherNomeLeilao(String param) {
        elementExist(cmpNomeLeilao);
        this.cmpNomeLeilao.sendKeys(param);
    }

    public void preencherValorLeilao(String param) {
        elementExist(cmpValorLeilao);
        this.cmpValorLeilao.sendKeys(param);
    }

    public void clicarEsUsado(String param) {
        String tipoLeilao = param.toLowerCase();

        if (tipoLeilao.equals("sim")) {
            elementExist((chkUsado));
            this.chkUsado.click();
        }
    }

    private WebElement linkLeilao(String leilaoCriado) {
        String lnkLeilao = String.format(linkLeioCriado, leilaoCriado);
        return stringToWebElement(lnkLeilao);
    }

    public void validarLeilaoCriado(String leilaoCriado) {
        String nomeLeilao = linkLeilao(leilaoCriado).getText();
        Assert.assertEquals(nomeLeilao, leilaoCriado);
    }

    public void clicarLeilaoCriado(String linkLeioCriado) {
        elementExist(linkLeilao(linkLeioCriado));
        linkLeilao(linkLeioCriado).click();
    }

    public void clicarSignOut() {
        elementExist(btnSignOut);
        this.btnSignOut.click();
    }

    public void clicarEndAuction() {
        elementExist(btnEndAuction);
        this.btnEndAuction.click();
    }

    public void preencherValueBID(String param) {
        elementExist(cmpValorBID);
        this.cmpValorBID.click();
        this.cmpValorBID.clear();
        this.cmpValorBID.sendKeys(param);
    }

    public void clicarBotaoBID() {
        elementExist(btnBid);
        this.btnBid.click();
    }

    public void clicarAuctions() {
        elementExist(btnAuctions);
        this.btnAuctions.click();
    }


}
