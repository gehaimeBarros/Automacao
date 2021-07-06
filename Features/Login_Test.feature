#language: pt
@Login
Funcionalidade: Realizar login com usuario cadastrado

  Contexto: login de acesso
    Dado que estou no aplicativo advantage shopping
    E clico em fazer login

  @Login_Sucesso
  Cenario: Login com sucesso
    Entao login concluído
    
