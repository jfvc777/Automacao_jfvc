# language: pt
@SistemaLeilao
Funcionalidade: Cadastro de novo usuario e cadastro de novos leilaos no aplicativo

  Contexto:
    Dado que estamos acessando ao aplicativo web de Leilao

  @cadastroUsuario
  Esquema do Cenario: Cenario: Cadastro de novo usuario
    Quando estou na Pagina de Login
    E seleciono no link Sign UP
    Entao sou direcionado na pagina de Cadastro novo usuario
    E preencho no campo Name o valor "<name>"
    E preencho no campo UserName o valor "<user>"
    E preencho no campo PassWord o valor "<pass>"
    E preencho no campo Email o valor "<email>"
    E preencho no campo CPF um valor gerado automaticamente
    E no campo Administrador seleciono "<admin>"
    E clico no botao Sing UP
    Entao sou direcionado para o Home do aplicativo
    Exemplos:
      | name   | user        | pass      | email              | admin |
      | Lizbet | user_lizbet | 123456789 | lizbet12@gmail.com | nao   |
      | Thiago | user_thiago | 987654321 | thiago1@gmail.com  | sim   |

  @loginUsuario01
  Cenario: Logar com usuario nao registrado
    Quando estou na Pagina de Login
    E preencho o usuario "testeDemo0122"
    E preencho o password "12e"
    E clico no botao Login
    Entao se mostra o mensagem "Login/Password invalid. Try again."

  @loginUsuario02
  Cenario: Logar com usuario registrado
    Quando estou na Pagina de Login
    E preencho o usuario "user_lizbet"
    E preencho o password "123456789"
    E clico no botao Login
    Entao sou direcionado para o Home do aplicativo

  @logOutUsuario
  Cenario: Deslogar do aplicativo
    Quando estou na Pagina de Login
    E preencho o usuario "user_thiago"
    E preencho o password "987654321"
    E clico no botao Login
    E sou direcionado para o Home do aplicativo
    E clico no enlace Sign Out
    Entao estou na Pagina de Login

  @criarLeilao
  Esquema do Cenario: Criar leilao com usuario administrador
    Quando estou na Pagina de Login
    E preencho o usuario "user_thiago"
    E preencho o password "987654321"
    E clico no botao Login
    E sou direcionado para o Home do aplicativo
    E clico no link Create Auction
    Entao sou direcionado na pagina "Create an Auction"
    E preencho o nome de Leilao "<nomeLeilao>"
    E preencho o valor inicial "<valorLeilao>"
    E clico no campo Used Product "<product>"
    E clico no botao Sing Up
    E sou direcionado para o Home do aplicativo
    Entao valido que "<nomeLeilao>" exista
    Exemplos:
      | nomeLeilao | valorLeilao | product |
      | Teste 001  | 1           | nao     |
      | Teste 002  | 2           | sim     |

  @adicionarNovoBID
  Cenario: Adicionar novo BID
    Quando estou na Pagina de Login
    E preencho o usuario "user_thiago"
    E preencho o password "987654321"
    E clico no botao Login
    Entao sou direcionado para o Home do aplicativo
    E clico no leilao "Teste 001"
    E preencho no valor do BID "5"
    E clico no botao BID
    Entao valido que o BID esteja criado na tabela BIDS

  @desativarLeilaoCriado
  Cenario: Desativar Leilao criado
    Quando estou na Pagina de Login
    E preencho o usuario "user_thiago"
    E preencho o password "987654321"
    E clico no botao Login
    Entao sou direcionado para o Home do aplicativo
    E clico no leilao "Teste 001"
    E clico no botao End Auction
    E clico em Home
    E clico no leilao "Teste 001"
    Entao o botao End Auction estara desativado

