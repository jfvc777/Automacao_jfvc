package classesPageObjects.cadastrarUsuario;

import classesPageObjects.UtilTestePO;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Juan Castillo
 * @since 23/06/2021
 */
public class CadastroPO extends UtilTestePO {

    @FindBy(xpath = "//input[@id='name']")
    private WebElement cmpName;
    @FindBy(xpath = "//input[@id='username']")
    private WebElement cmpUserName;
    @FindBy(xpath = "//input[@id='password']")
    private WebElement cmpPass;
    @FindBy(xpath = "//input[@id='email']")
    private WebElement cmpEmail;
    @FindBy(xpath = "//input[@id='cpf']")
    private WebElement cmpCPF;
    @FindBy(xpath = "//input[@id='admin']")
    private WebElement clkAdmin;
    @FindBy(xpath = "//button[contains(text(),'Sing Up')]")
    private WebElement btnSignUp;
    @FindBy(xpath = "//h3[contains(text(),'Sign In')]")
    private WebElement lblSignIn;


    public CadastroPO() {
        carregarPageFactory();
    }

    public void validarSiteCadastro() {
        elementExist(lblSignIn);
    }

    public void preencherName(String param) {
        elementExist(cmpName);
        this.cmpName.sendKeys(param);
    }

    public void preencherPass(String param) {
        elementExist(cmpPass);
        this.cmpPass.sendKeys(param);
    }

    public void preencherUserName(String param) {
        elementExist(cmpUserName);
        this.cmpUserName.sendKeys(param);
    }

    public void preencherEmail(String param) {
        elementExist(cmpEmail);
        this.cmpEmail.sendKeys(param);
    }

    public void preencherCPF() {
        elementExist(cmpCPF);
        this.cmpCPF.sendKeys(geraCPFFinal());
    }

    private void clicarCheckAdmin(String tipoUser) {
        elementExist(clkAdmin);

        String tip = tipoUser.toLowerCase();

        if (tip.equals("sim")) {
            this.clkAdmin.click();
        }

    }

    public void clicarAdmin(String tipoUser) {
        clicarCheckAdmin(tipoUser);
    }

    public void clicarSignUP() {
        elementExist(btnSignUp);
        this.btnSignUp.click();
    }


}
