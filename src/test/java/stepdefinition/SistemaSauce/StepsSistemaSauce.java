package stepdefinition.SistemaSauce;

import classesPageObjects.comprarSauce.ComprarPO;
import classesPageObjects.login.LoginPO;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

import java.io.IOException;

/**
 * @author Juan Castillo
 * @since 08/07/2021
 */
public class StepsSistemaSauce {

    LoginPO loginPO;
    ComprarPO comprarPO;

    @Dado("que estamos acessando ao aplicativo web de Sauce")
    public void queEstamosAcessandoAoAplicativoWebDeSauce() throws IOException {
        loginPO = new LoginPO();
        loginPO.logarSite();
    }

    @Quando("estou na Pagina de Login")
    public void estouNaPaginaDeLogin() {
        loginPO.validarLogin();
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

    @Entao("sou direcionado na tela Produto")
    public void souDirecionadoNaTelaProduto() {
        comprarPO = new ComprarPO();
        comprarPO.validarProducts();
    }

    @E("ordeno pelo {string}")
    public void ordenoPelo(String param) {
        comprarPO = new ComprarPO();
        comprarPO.clicarOrdenamento(param);
    }

    @E("selecionamos o produto com o nome {string}")
    public void selecionamosOProdutoComONome(String param) {
        comprarPO.clicarProduto(param);
    }

    @Entao("sou direcionado na tela Detalhe Produto")
    public void souDirecionadoNaTelaDetalheProduto() {
        comprarPO.validarVoltar();
    }

    @E("clico em Adicionar Produto")
    public void clicoEmAdicionarProduto() {
        comprarPO.clicarAdicionarCarrito();
    }

    @E("clico no simbolo do carro de compra")
    public void clicoNoSimboloDoCarroDeCompra() {
        comprarPO.clicarCarro();
    }

    @Entao("sou direcionado na tela Adicionar Compra")
    public void souDirecionadoNaTelaAdicionarCompra() {
        comprarPO.validarAdicionar();
    }

    @E("clico em botao CheckOut")
    public void clicoEmBotaoCheckOut() {
        comprarPO.clicarCheckOut();
    }

    @Entao("sou direcionado na tela CheckOut")
    public void souDirecionadoNaTelaCheckOut() {
        comprarPO.validarCheckOut();
    }

    @E("preencho no campo First Name {string}")
    public void preenchoNoCampoFirstName(String param) {
        comprarPO.preencherFirstName(param);
    }

    @E("preencho no campo Last Name {string}")
    public void preenchoNoCampoLastName(String param) {
        comprarPO.preencherLastName(param);
    }

    @E("preencho no campo ZipCode {string}")
    public void preenchoNoCampoZipCode(String param) {
        comprarPO.preencherZipCode(param);
    }

    @E("clico no botao Continue")
    public void clicoNoBotaoContinue() {
        comprarPO.clicarContinue();
    }

    @Entao("sou direcionado na tela OverView")
    public void souDirecionadoNaTelaOverView() {
        comprarPO.validarOverView();
    }

    @E("clico no botao Finish")
    public void clicoNoBotaoFinish() {
        comprarPO.clicarFinish();
    }


    @Entao("sou direcionado na tela de compra com sucesso")
    public void souDirecionadoNaTelaDeCompraComSucesso() {
        comprarPO.validarComplete();
    }

    @E("selecionamos em Adicionar Produto no produto {string}")
    public void selecionamosEmAdicionarProdutoNoProduto(String param) {
        comprarPO = new ComprarPO();
        comprarPO.clicarProdutoCart(param);
    }

    @Entao("o sistema mostra o mensagem de erro {string}")
    public void oSistemaMostraOMensagemDeErro(String param) {
        comprarPO.validarErro(param);
    }
}
