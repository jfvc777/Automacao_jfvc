package classesPageObjects.login;

import classesPageObjects.UtilTestePO;
import classesPageObjects.cadastrarLeilao.LeilaoPO;
import classesPageObjects.cadastrarUsuario.CadastroPO;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

/**
 * @author Juan Castillo
 * @since 23/06/2021
 */
public class LoginPO extends UtilTestePO {

    @FindBy(xpath = "//div[@class='input-group-prepend']/span/following::input[@placeholder='username']")
    private WebElement cmpUserName;
    @FindBy(xpath = "//div[@class='input-group-prepend']/span/following::input[@placeholder='password']")
    private WebElement cmpPassWord;
    @FindBy(xpath = "//button[contains(text(),'Login')]")
    private WebElement btnLogin;
    @FindBy(xpath = "//a[contains(text(),'Sign Up')]")
    private WebElement lnkSignUp;
    @FindBy(xpath = "//h3[contains(text(),'Sign In')]")
    private WebElement lblSignIn;
    @FindBy(xpath = "//div[contains(text(),'Login/Password invalid. Try again.')]")
    private WebElement msgErro;

    public LoginPO() {
        carregarPageFactory();
    }

    public void logarSite() throws IOException {
        String urlSite = lerProperties("src/main/resources/param_site", "url_site");
        inicializarBrowser(urlSite);
    }

    public void validarLogin(){
        elementExist(cmpUserName);
    }

    public void validarErro(String param){
        String lblErro = msgErro.getText();
        Assert.assertEquals(param,lblErro);
    }

    public void preencherUserName(String param) {
        elementExist(cmpUserName);
        this.cmpUserName.sendKeys(param);
    }

    public void preencherPassWord(String param) {
        elementExist(cmpPassWord);
        this.cmpPassWord.sendKeys(param);
    }

    public LeilaoPO selecionarLogin() {
        elementExist(btnLogin);
        this.btnLogin.click();
        return new LeilaoPO();
    }

    public CadastroPO selecionarSignUp() {
        elementExist(lnkSignUp);
        this.lnkSignUp.click();
        return new CadastroPO();
    }



}
