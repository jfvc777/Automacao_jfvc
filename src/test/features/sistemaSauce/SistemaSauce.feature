# language: pt
@SistemaSauce
Funcionalidade: Funcionalidade de compra de Sistema Sauce

  Contexto:
    Dado que estamos acessando ao aplicativo web de Sauce

  @caso_001
  Cenario: Realizar uma compra com sucesso
    Quando estou na Pagina de Login
    E preencho o usuario "performance_glitch_user"
    E preencho o password "secret_sauce"
    E clico no botao Login
    E ordeno pelo "Name (Z to A)"
    E selecionamos o produto com o nome "Sauce Labs Onesie"
    Entao sou direcionado na tela Detalhe Produto
    E clico em Adicionar Produto
    E clico no simbolo do carro de compra
    Entao sou direcionado na tela Adicionar Compra
    E clico em botao CheckOut
    Entao sou direcionado na tela CheckOut
    E preencho no campo First Name "Juan"
    E preencho no campo Last Name "Teste"
    E preencho no campo ZipCode "04615-121"
    E clico no botao Continue
    Entao sou direcionado na tela OverView
    E clico no botao Finish
    Entao sou direcionado na tela de compra com sucesso

  @caso_002
  Cenario: Realizar uma compra sem sucesso
    Quando estou na Pagina de Login
    E preencho o usuario "problem_user"
    E preencho o password "secret_sauce"
    E clico no botao Login
    E selecionamos em Adicionar Produto no produto "Sauce Labs Backpack"
    E clico no simbolo do carro de compra
    Entao sou direcionado na tela Adicionar Compra
    E clico em botao CheckOut
    Entao sou direcionado na tela CheckOut
    E preencho no campo First Name "Juan"
    E preencho no campo Last Name "Teste"
    E preencho no campo ZipCode "04615-121"
    E clico no botao Continue
    Entao o sistema mostra o mensagem de erro "Error: Last Name is required"