package stepdefinition.SistemaLeilao;

import classesPageObjects.cadastrarLeilao.LeilaoPO;
import classesPageObjects.cadastrarUsuario.CadastroPO;
import classesPageObjects.login.LoginPO;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

import java.io.IOException;

/**
 * @author Juan Castillo
 * @since 24/06/2021
 */
public class StepsSistemaLeilao {

    LeilaoPO leilaoPO;
    LoginPO loginPO;
    CadastroPO cadastroPO;
    public String valueBID;

    @Dado("que estamos acessando ao aplicativo web de Leilao")
    public void queEstamosAcessandoAoAplicativoWebDeLeilao() throws IOException {
        loginPO = new LoginPO();
        loginPO.logarSite();
    }

    @Quando("estou na Pagina de Login")
    public void estouNaPaginaDeLogin() {
        loginPO.validarLogin();
    }

    @E("seleciono no link Sign UP")
    public void selecionoNoLinkSignUP() {
        loginPO.selecionarSignUp();
    }

    @E("preencho no campo Name o valor {string}")
    public void preenchoNoCampoNameOValor(String param) {
        cadastroPO.preencherName(param);
    }

    @Entao("sou direcionado na pagina de Cadastro novo usuario")
    public void souDirecionadoNaPaginaDeCadastroNovoUsuario() {
        cadastroPO = new CadastroPO();
        cadastroPO.validarSiteCadastro();
    }

    @E("preencho no campo UserName o valor {string}")
    public void preenchoNoCampoUserNameOValor(String param) {
        cadastroPO.preencherUserName(param);
    }

    @E("preencho no campo PassWord o valor {string}")
    public void preenchoNoCampoPassWordOValor(String param) {
        cadastroPO.preencherPass(param);
    }

    @E("preencho no campo Email o valor {string}")
    public void preenchoNoCampoEmailOValor(String param) {
        cadastroPO.preencherEmail(param);
    }

    @E("preencho no campo CPF um valor gerado automaticamente")
    public void preenchoNoCampoCPFUmValorGeradoAutomaticamente() {
        cadastroPO.preencherCPF();
    }

    @E("no campo Administrador seleciono {string}")
    public void noCampoAdministradorSeleciono(String param) {
        cadastroPO.clicarAdmin(param);
    }

    @E("clico no botao Sing UP")
    public void clicoNoBotaoSingUP() {
        cadastroPO.clicarSignUP();
    }

    @Entao("sou direcionado para o Home do aplicativo")
    public void souDirecionadoParaOHomeDoAplicativo() {
        leilaoPO = new LeilaoPO();
        leilaoPO.validarLeilaoHome();
    }


    @E("preencho o usuario {string}")
    public void preenchoOUsuario(String param) {
        loginPO = new LoginPO();
        loginPO.preencherUserName(param);
    }

    @E("preencho o password {string}")
    public void preenchoOPassword(String param) {
        loginPO.preencherPassWord(param);
    }

    @E("clico no botao Login")
    public void clicoNoBotaoLogin() {
        loginPO.selecionarLogin();
    }

    @Entao("se mostra o mensagem {string}")
    public void seMostraOMensagem(String param) {
        loginPO.validarErro(param);
    }

    @E("clico no enlace Sign Out")
    public void clicoNoEnlaceSignOut() {
        leilaoPO = new LeilaoPO();
        leilaoPO.clicarSignOut();
    }

    @E("clico no link Create Auction")
    public void clicoNoLinkCreateAuction() {
        leilaoPO.clicarCreateAuction();
    }

    @Entao("sou direcionado na pagina {string}")
    public void souDirecionadoNaPagina(String param) {
        leilaoPO.validarCreationLeilaoHome(param);
    }

    @E("preencho o nome de Leilao {string}")
    public void preenchoONomeDeLeilao(String param) {
        leilaoPO.preencherNomeLeilao(param);
    }

    @E("preencho o valor inicial {string}")
    public void preenchoOValorInicial(String param) {
        leilaoPO.preencherValueBID(param);
    }

    @E("clico no campo Used Product {string}")
    public void clicoNoCampoUsedProduct(String param) {
        leilaoPO.clicarEsUsado(param);
    }

    @E("clico no botao Sing Up")
    public void clicoNoBotaoSingUp() {
        leilaoPO.clicarSignUP();
    }

    @Entao("valido que {string} exista")
    public void validoQueExista(String param) {
        leilaoPO.validarLeilaoCriado(param);
    }

    @E("clico no leilao {string}")
    public void clicoNoLeilao(String param) {
        leilaoPO.clicarLeilaoCriado(param);
    }

    @E("clico no botao End Auction")
    public void clicoNoBotaoEndAuction() {
        leilaoPO.clicarEndAuction();
    }


    @E("clico em Home")
    public void clicoEmHome() {
        leilaoPO.clicarAutionsHome();
    }

    @Entao("o botao End Auction estara desativado")
    public void oBotaoEndAuctionEstaraDesativado() {
        leilaoPO.validarBotaoEndAutions();
    }


    @E("preencho no valor do BID {string}")
    public void preenchoNoValorDoBID(String param) {
        valueBID = param;
        leilaoPO.preencherValueBID(param);
    }

    @E("clico no botao BID")
    public void clicoNoBotaoBID() {
        leilaoPO.clicarBotaoBID();
    }


    @Entao("valido que o BID esteja criado na tabela BIDS")
    public void validoQueOBIDEstejaCriadoNaTabelaBIDS() {
        leilaoPO.validarBIDCriado(valueBID);
    }
}
