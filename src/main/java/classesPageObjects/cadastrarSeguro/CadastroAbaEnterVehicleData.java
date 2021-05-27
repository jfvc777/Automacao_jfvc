package classesPageObjects.cadastrarSeguro;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Juan Castillo
 * @since 26/05/2021
 */
public class CadastroAbaEnterVehicleData extends CadastrarSeguroPO {
    /******************Aba Enter Vehicle Data*********************/
    @FindBy(xpath = "//a[@id='entervehicledata']")
    private WebElement lblAbaEnterVehicle;
    @FindBy(xpath = "//select[@id='make']")
    private WebElement cmbMake;
    @FindBy(xpath = "//select[@id='model']")
    private WebElement cmbModel;
    @FindBy(xpath = "//input[@id='cylindercapacity']")
    private WebElement cmpCylinder;
    @FindBy(xpath = "//input[@id='engineperformance']")
    private WebElement cmpEngineer;
    @FindBy(xpath = "//input[@id='dateofmanufacture']")
    private WebElement cmpDatemanu;
    @FindBy(xpath = "//select[@id='numberofseats']")
    private WebElement cmbNumberSeats1;
    @FindBy(xpath = "//select[@id='numberofseatsmotorcycle']")
    private WebElement cmbNumberSeats2;
    @FindBy(xpath = "//select[@id='fuel']")
    private WebElement cmbFuel;
    @FindBy(xpath = "//input[@id='payload']")
    private WebElement cmpPayload;
    @FindBy(xpath = "//input[@id='totalweight']")
    private WebElement cmpTotalWeight;
    @FindBy(xpath = "//input[@id='listprice']")
    private WebElement cmpListPrice;
    @FindBy(xpath = "//input[@id='licenseplatenumber']")
    private WebElement cmpLicensePlateNumber;
    @FindBy(xpath = "//input[@id='annualmileage']")
    private WebElement cmpAnualMil;
    @FindBy(xpath = "//button[@id='nextenterinsurantdata']")
    private WebElement btnNextEnterVehicule;

    protected String sltOpcao = "//body/div[@id='site-content']/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[1]/div[7]/p[1]/label[%s]";

    private WebElement selecaoOpcaoRight(String opcao) {
        String formatar = opcao.toLowerCase();
        switch (formatar) {
            case "yes":
                sltOpcao = String.format(sltOpcao, "1");
                break;
            case "no":
                sltOpcao = String.format(sltOpcao, "2");
                break;
        }
        return stringToWebElement(sltOpcao);
    }

    public CadastroAbaEnterVehicleData(){
        carregarPageFactory();
    }

    public void clicarOpcaoRight(String opcao) {
        elementExist(selecaoOpcaoRight(opcao));
        selecaoOpcaoRight(opcao).click();
    }

    public void selecionarMake(String param) {
        clicarCombo(cmbMake, param);
    }

    public void selecionarModel(String param) {
        clicarCombo(cmbModel, param);
    }

    public void preencherEngine(String param) {
        elementExist(cmpEngineer);
        this.cmpEngineer.sendKeys(param);
    }

    public void preencherCylinder(String param) {
        elementExist(cmpCylinder);
        this.cmpCylinder.sendKeys(param);
    }

    public void preencherDateManuFacture(String param) {
        elementExist(cmpDatemanu);
        param = formataData(param);
        this.cmpDatemanu.sendKeys(param);
    }

    public void selecionarNumberSeats1(String param) {
        clicarCombo(cmbNumberSeats1, param);
    }

    public void selecionarNumberSeats2(String param) {
        clicarCombo(cmbNumberSeats2, param);
    }

    public void selecionarFuelType(String param) {
        clicarCombo(cmbFuel, param);
    }

    public void preencherPayload(String param) {
        elementExist(cmpPayload);
        this.cmpPayload.sendKeys(param);
    }

    public void preencherTotalWeight(String param) {
        elementExist(cmpTotalWeight);
        this.cmpTotalWeight.sendKeys(param);
    }

    public void preencherListPrice(String param) {
        elementExist(cmpListPrice);
        this.cmpListPrice.sendKeys(param);
    }

    public void preencherLicensePlate(String param) {
        elementExist(cmpLicensePlateNumber);
        this.cmpLicensePlateNumber.sendKeys(param);
    }

    public void preencherAnualMill(String param) {
        elementExist(cmpAnualMil);
        this.cmpAnualMil.sendKeys(param);
    }

    public CadastroAbaEnterInsurantData selecionarBtnNext() {
        elementExist(btnNextEnterVehicule);
        this.btnNextEnterVehicule.click();
        return new CadastroAbaEnterInsurantData();
    }

}