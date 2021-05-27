package stepdefinition.CadastroSeguroVeiculo;

import classesPageObjects.cadastrarSeguro.*;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

import java.io.IOException;


/**
 * @author Juan Franciso Villarruel Castillo
 * @since 26/05/2021
 */
public class StepsCadastroSeguroVeiculo {

    CadastrarSeguroPO cadastrarSeguroPO;
    CadastroAbaEnterVehicleData cadEnterVehicle;
    CadastroAbaEnterInsurantData cadEnterInsurant;
    CadastroAbaEnterProduct cadEnterProduct;
    CadastroAbaSelectPrice cadSelectPrice;
    CadastroAbaSendQuote cadSendQuote;

    public String nomeAba;

    @Dado("^que estamos acessando ao aplicativo web Tricentis$")
    public void queEstamosAcessandoAoAplicativoWebTricentis() throws IOException {
        cadastrarSeguroPO = new CadastrarSeguroPO();
        cadastrarSeguroPO.logarSite();
    }

    @Quando("^estou na aba \"([^\"]*)\"$")
    public void estouNaAba(String aba) throws Throwable {
        cadastrarSeguroPO.compararAba(aba);
        nomeAba = aba;
    }

    @E("^seleciono no campo Make a marca \"([^\"]*)\"$")
    public void selecionoNoCampoMakeAMarca(String param) throws Throwable {
        cadEnterVehicle = new CadastroAbaEnterVehicleData();
        cadEnterVehicle.selecionarMake(param);
    }

    @E("^seleciono no campo Model o modelo \"([^\"]*)\"$")
    public void selecionoNoCampoModelOModelo(String param) throws Throwable {
        cadEnterVehicle.selecionarModel(param);
    }

    @E("^preencho no campo Cylinder Capacity o valor \"([^\"]*)\"$")
    public void preenchoNoCampoCylinderCapacityOValor(String param) throws Throwable {
        cadEnterVehicle.preencherCylinder(param);
    }

    @E("^preencho no campo Engine Performance o valor \"([^\"]*)\"$")
    public void preenchoNoCampoEnginePerformanceOValor(String param) throws Throwable {
        cadEnterVehicle.preencherEngine(param);
    }

    @E("^preencho no campo Date of Manufacture a data \"([^\"]*)\"$")
    public void preenchoNoCampoDateOfManufactureAData(String param) throws Throwable {
        cadEnterVehicle.preencherDateManuFacture(param);
    }

    @E("^seleciono no campo Number of Seats o numero \"([^\"]*)\"$")
    public void selecionoNoCampoNumberOfSeatsONumero(String param) throws Throwable {
        cadEnterVehicle.selecionarNumberSeats1(param);
    }

    @E("^seleciono no campo Right Hand Drive o valor \"([^\"]*)\"$")
    public void selecionoNoCampoRightHandDriveOValor(String param) throws Throwable {
        cadEnterVehicle.clicarOpcaoRight(param);
    }

    @E("^seleciono no campo Fuel Type o valor \"([^\"]*)\"$")
    public void selecionoNoCampoFuelTypeOValor(String param) throws Throwable {
        cadEnterVehicle.selecionarFuelType(param);
    }

    @E("^preencho no campo Payload o valor \"([^\"]*)\"$")
    public void preenchoNoCampoPayloadOValor(String param) throws Throwable {
        cadEnterVehicle.preencherPayload(param);
    }

    @E("^preencho no campo Total Weight o valor \"([^\"]*)\"$")
    public void preenchoNoCampoTotalWeightOValor(String param) throws Throwable {
        cadEnterVehicle.preencherTotalWeight(param);
    }

    @E("^preencho no campo List Price o valor \"([^\"]*)\"$")
    public void preenchoNoCampoListPriceOValor(String param) throws Throwable {
        cadEnterVehicle.preencherListPrice(param);
    }

    @E("^preencho no campo License Plate Number o valor \"([^\"]*)\"$")
    public void preenchoNoCampoLicensePlateNumberOValor(String param) throws Throwable {
        cadEnterVehicle.preencherLicensePlate(param);
    }

    @E("^preencho no campo Annual Mileage o valor \"([^\"]*)\"$")
    public void preenchoNoCampoAnnualMileageOValor(String param) throws Throwable {
        cadEnterVehicle.preencherAnualMill(param);
    }

    @Entao("^sou direcionado para a aba \"([^\"]*)\"$")
    public void souDirecionadoParaAAba(String aba) throws Throwable {
        cadastrarSeguroPO.compararAba(aba);
        nomeAba = aba;
    }

    @E("^preencho no campo First Name o valor \"([^\"]*)\"$")
    public void preenchoNoCampoFirstNameOValor(String param) throws Throwable {
        cadEnterInsurant = new CadastroAbaEnterInsurantData();
        cadEnterInsurant.preencherFirsName(param);
    }

    @E("^preencho no campo Last Name o valor \"([^\"]*)\"$")
    public void preenchoNoCampoLastNameOValor(String param) throws Throwable {
        cadEnterInsurant.preencherLastName(param);
    }

    @E("^preencho no campo Date of Birth o valor \"([^\"]*)\"$")
    public void preenchoNoCampoDateOfBirthOValor(String param) throws Throwable {
        cadEnterInsurant.preencherDateBirth(param);
    }

    @E("^seleciono no campo Gender o valor \"([^\"]*)\"$")
    public void selecionoNoCampoGenderOValor(String param) throws Throwable {
        cadEnterInsurant.clicarOpcaoGender(param);
    }

    @E("^preencho no campo Street Address o valor \"([^\"]*)\"$")
    public void preenchoNoCampoStreetAddressOValor(String param) throws Throwable {
        cadEnterInsurant.preencherStreet(param);
    }

    @E("^seleciono no campo Country o valor \"([^\"]*)\"$")
    public void selecionoNoCampoCountryOValor(String param) throws Throwable {
        cadEnterInsurant.selecionarCountry(param);
    }

    @E("^preencho no campo Zip Code o valor \"([^\"]*)\"$")
    public void preenchoNoCampoZipCodeOValor(String param) throws Throwable {
        cadEnterInsurant.preencherZipCode(param);
    }

    @E("^preencho no campo City o valor \"([^\"]*)\"$")
    public void preenchoNoCampoCityOValor(String param) throws Throwable {
        cadEnterInsurant.preencherCity(param);
    }

    @E("^seleciono no campo Occupation o valor \"([^\"]*)\"$")
    public void selecionoNoCampoOccupationOValor(String param) throws Throwable {
        cadEnterInsurant.selecionarOcupation(param);
    }

    @E("^seleciono no campo Hobbies o valor \"([^\"]*)\"$")
    public void selecionoNoCampoHobbiesOValor(String param) throws Throwable {
        cadEnterInsurant.clicarOpcaoHobies(param);
    }

    @E("^preencho no campo Website o valor \"([^\"]*)\"$")
    public void preenchoNoCampoWebsiteOValor(String param) throws Throwable {
        cadEnterInsurant.preencherWebSite(param);
    }

    @E("^preencho no campo Start Date o valor \"([^\"]*)\"$")
    public void preenchoNoCampoStartDateOValor(String param) throws Throwable {
        cadEnterProduct = new CadastroAbaEnterProduct();
        cadEnterProduct.preencherStartDate(param);
    }

    @E("^seleciono no campo Insurance Sum o valor \"([^\"]*)\"$")
    public void selecionoNoCampoInsuranceSumOValor(String param) throws Throwable {
        cadEnterProduct.selecionarInsurance(param);
    }

    @E("^seleciono no campo Merit Rating o valor \"([^\"]*)\"$")
    public void selecionoNoCampoMeritRatingOValor(String param) throws Throwable {
        cadEnterProduct.selecionarMerit(param);
    }

    @E("^seleciono no campo Damage Insurance o valor \"([^\"]*)\"$")
    public void selecionoNoCampoDamageInsuranceOValor(String param) throws Throwable {
        cadEnterProduct.selecionarDamage(param);
    }

    @E("^seleciono no campo Optional Products o valor \"([^\"]*)\"$")
    public void selecionoNoCampoOptionalProductsOValor(String param) throws Throwable {
        cadEnterProduct.clicarOpctionalProduct(param);
    }

    @E("^seleciono no campo Courtesy Car o valor \"([^\"]*)\"$")
    public void selecionoNoCampoCourtesyCarOValor(String param) throws Throwable {
        cadEnterProduct.selecionarCourtesy(param);
    }

    @E("^seleciono o plano \"([^\"]*)\"$")
    public void selecionoOPlano(String param) throws Throwable {
        cadSelectPrice = new CadastroAbaSelectPrice();
        cadSelectPrice.clicarPlano(param);
    }

    @E("^preencho o email \"([^\"]*)\"$")
    public void preenchoOEmail(String param) throws Throwable {
        cadSendQuote = new CadastroAbaSendQuote();
        cadSendQuote.preencherEmail(param);
    }

    @E("^preencho o numero telefonico \"([^\"]*)\"$")
    public void preenchoONumeroTelefonico(String param) throws Throwable {
        cadSendQuote.preencherPhone(param);
    }

    @E("^preencho o nome de usuario \"([^\"]*)\"$")
    public void preenchoONomeDeUsuario(String param) throws Throwable {
        cadSendQuote.preencherUsername(param);
    }

    @E("^preencho a senha \"([^\"]*)\"$")
    public void preenchoASenha(String param) throws Throwable {
        cadSendQuote.preencherPass(param);
    }

    @E("^preencho a confirmacao da senha \"([^\"]*)\"$")
    public void preenchoAConfirmacaoDaSenha(String param) throws Throwable {
        cadSendQuote.preencherConfPass(param);
    }

    @E("^preencho no campo Comments o comentario \"([^\"]*)\"$")
    public void preenchoNoCampoCommentsOComentario(String param) throws Throwable {
        cadSendQuote.preencherComments(param);
    }

    @Entao("^validamos que o mensagem de confirmacao contem \"([^\"]*)\" e clicar no botao OK$")
    public void validamosQueOMensagemDeConfirmacaoContemEClicarNoBotaoOK(String param) throws Throwable {
        cadSendQuote.mensagemConfirmacao(param);
    }

    @E("^seleciono de novo no campo Number of Seats o numero \"([^\"]*)\"$")
    public void selecionoDeNovoNoCampoNumberOfSeatsONumero(String param) throws Throwable {
        cadEnterVehicle.selecionarNumberSeats2(param);
    }

    @E("^clico no botao Next da aba Enter Vehicle$")
    public void clicoNoBotaoNextDaAbaEnterVehicle() {
        cadEnterVehicle.selecionarBtnNext();

    }

    @E("^clico no botao Next da aba Enter Insurant$")
    public void clicoNoBotaoNextDaAbaEnterInsurant() {
        cadEnterInsurant.selecionarBtnNext();
    }

    @E("^clico no botao Next da aba Enter Product$")
    public void clicoNoBotaoNextDaAbaEnterProduct() {
        cadEnterProduct.selecionarBtnNext();
    }

    @E("^clico no botao Next da aba Select Price$")
    public void clicoNoBotaoNextDaAbaSelectPrice() {
        cadSelectPrice.selecionarBtnNext();
    }

    @E("^clico no botao Next da aba Send Quote$")
    public void clicoNoBotaoNextDaAbaSendQuote() {
        cadSendQuote.clicarBtnNext();
    }
}
