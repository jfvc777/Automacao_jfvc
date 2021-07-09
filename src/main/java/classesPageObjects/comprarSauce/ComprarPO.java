package classesPageObjects.comprarSauce;

import classesPageObjects.UtilTestePO;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

/**
 * @author Juan Castillo
 * @since 08/07/2021
 */
public class ComprarPO extends UtilTestePO {

    @FindBy(xpath = "//span[contains(text(),'Products')]")
    private WebElement lblProducts;
    @FindBy(xpath = "//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[2]/div[2]/span[1]/select[1]")
    private WebElement btnOrdenamento;
    @FindBy(xpath = "//button[@id='back-to-products']")
    private WebElement btnVoltar;
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
    private WebElement btnAdicionar;
    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    private WebElement linkCarro;
    @FindBy(xpath = "//span[contains(text(),'Your Cart')]")
    private WebElement lblYourCart;
    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement btnCheckOut;
    @FindBy(xpath = "//span[contains(text(),'Checkout: Your Information')]")
    private WebElement lnkCheckOut;
    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement cmpFirstName;
    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement cmpLastName;
    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement cmpPostalCode;
    @FindBy(xpath = "//input[@id='continue']")
    private WebElement btnContinue;
    @FindBy(xpath = "//span[contains(text(),'Checkout: Overview')]")
    private WebElement lblOverView;
    @FindBy(xpath = "//button[@id='finish']")
    private WebElement btnFinish;
    @FindBy(xpath = "//h2[contains(text(),'THANK YOU FOR YOUR ORDER')]")
    private WebElement lblComplete;
    @FindBy(xpath = "//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='checkout_info_container']/div[1]/form[1]/div[1]/div[4]/h3[1]")
    private WebElement lblMensagemErro;

    protected String btnProduto = "//div[@class='inventory_item_label']/a/div[contains(text(),'%s')]";
    protected String btnProdCart = "//div[@class='inventory_item_label']/a/div[contains(text(),'Sauce Labs Backpack')]/../../../div[@class='pricebar']/button";
    protected String optValue = "//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[2]/div[2]/span[1]/select[1]/option[@value='%s']";

    public ComprarPO() {
        carregarPageFactory();
    }

    public void validarComplete() {
        elementExist(lblComplete);
    }

    public void validarProducts() {
        elementExist(lblProducts);
    }

    public void validarVoltar() {
        elementExist(btnVoltar);
    }

    public void validarAdicionar() {
        elementExist(lblYourCart);
    }

//    private void clicarCombo(WebElement param, String element) {
//        elementExist(param);
//        Select sltOb = new Select(param);
//        sltOb.selectByVisibleText(element);
//    }
//
//    public void clicarOrdenamento(String param) {
//        clicarCombo(sltOrdenamento, param);
//    }

    private WebElement btnBotaoProdut(String param) {
        String lnkProduct = String.format(btnProduto, param);
        return stringToWebElement(lnkProduct);
    }

    public void clicarProduto(String param) {
        elementExist(btnBotaoProdut(param));
        btnBotaoProdut(param).click();
    }

    public void clicarAdicionarCarrito() {
        elementExist(btnAdicionar);
        btnAdicionar.click();
    }

    public void clicarCarro() {
        elementExist(linkCarro);
        linkCarro.click();
    }

    public void clicarCheckOut() {
        elementExist(btnCheckOut);
        btnCheckOut.click();
    }

    public void validarCheckOut() {
        elementExist(lnkCheckOut);
    }

    public void preencherFirstName(String param) {
        elementExist(cmpFirstName);
        this.cmpFirstName.sendKeys(param);
    }

    public void preencherLastName(String param) {
        elementExist(cmpLastName);
        this.cmpLastName.sendKeys(param);
    }

    public void preencherZipCode(String param) {
        elementExist(cmpPostalCode);
        this.cmpPostalCode.sendKeys(param);
    }

    public void clicarContinue() {
        elementExist(btnContinue);
        this.btnContinue.click();
    }

    public void validarOverView() {
        elementExist(lblOverView);
    }

    public void clicarFinish() {
        elementExist(btnFinish);
        this.btnFinish.click();
    }

    private WebElement btnClicarOrdenamento(String param) {

        String value = "";

        switch (param) {
            case "Name (A to Z)":
                value = "az";
                break;
            case "Name (Z to A)":
                value = "za";
                break;
            case "Price (low to high)":
                value = "lohi";
                break;
            case "Price (high to low)":
                value = "hilo";
                break;
        }

        String lnkOrdenamento = String.format(optValue, value);
        return stringToWebElement(lnkOrdenamento);
    }

    public void clicarOrdenamento(String param) {
        elementExist(btnOrdenamento);
        this.btnOrdenamento.click();
        elementExist(btnClicarOrdenamento(param));
        btnClicarOrdenamento(param).click();
    }


    private WebElement btnBotaoProdutCart(String param) {
        String lnkProduct = String.format(btnProdCart, param);
        return stringToWebElement(lnkProduct);
    }

    public void clicarProdutoCart(String param) {
        elementExist(btnBotaoProdutCart(param));
        btnBotaoProdutCart(param).click();
    }

    private String obterErroMensagem() {
        String msgErro = this.lblMensagemErro.getText();
        return msgErro;
    }

    public void validarErro(String param) {
        Assert.assertEquals(param, obterErroMensagem());
    }


}
