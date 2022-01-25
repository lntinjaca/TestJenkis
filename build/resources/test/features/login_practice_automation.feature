@CasosLogin
Feature: Autenticar en la pagina automation practice
  Como usuario
  Quiero acceder en la pagina
  A traves del proceso de autenticacion

  @LoginExitosoAutomationPractice
  Scenario: Realizar autenticacion exitosa en la pagina automation practice
    Given que el usuario quiere acceder a la pagina automation practice
    When digita el usuario y la clave
    |user|password|
    |pruebaregistro128@correo.com|Colombia1234+.,--|
    Then se verifica el mensaje
    |messageWelcome|
    |Hello pruebaregistro128 (not pruebaregistro128? Sign out)|