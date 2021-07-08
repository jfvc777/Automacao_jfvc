# language: pt
@SistemaSauce
Funcionalidade: Funcionalidade de compra de Sistema Sauce

  Contexto:
    Dado que estamos acessando ao aplicativo web de Sauce

  @caso_001
  Cenario: Realizar uma compra com sucesso
    Quando estou na Pagina de Login
    E preencho o usuario "user_lizbet"