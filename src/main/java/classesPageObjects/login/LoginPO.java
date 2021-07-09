package classesPageObjects.login;

import classesPageObjects.UtilTestePO;
import classesPageObjects.comprarSauce.ComprarPO;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

/**
 * @author Juan Castillo
 * @since 23/06/2021
 */
public class LoginPO extends UtilTestePO {

    //Login
    @FindBy(xpath = "//h4[contains(text(),'Accepted usernames are:')]")
    private WebElement lblLogin;
    @FindBy(xpath = "//input[@id='user-name']")
    private WebElement cmpUserName;
    @FindBy(xpath = "//input[@id='password']")
    private WebElement cmpPassWord;
    @FindBy(xpath = "//input[@id='login-button']")
    private WebElement btnLogin;

    public LoginPO() {
        carregarPageFactory();
    }

    public void logarSite() throws IOException {
        String urlSite = lerProperties("src/main/resources/param_site", "url_site");
        inicializarBrowser(urlSite);
    }

    public void validarLogin(){
        elementExist(lblLogin);
    }

    public void preencherUserName(String param) {
        elementExist(cmpUserName);
        this.cmpUserName.sendKeys(param);
    }

    public void preencherPassWord(String param) {
        elementExist(cmpPassWord);
        this.cmpPassWord.sendKeys(param);
    }

    public ComprarPO selecionarLogin() {
        elementExist(btnLogin);
        this.btnLogin.click();
        return new ComprarPO();
    }




}
