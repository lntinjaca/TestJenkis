@CasosLogin
Feature: Acceder al aplicativo METIS.
  Como usuario
  Quiero autenticarme en la APP Metis
  A traves de la pagina de acceso a la APP

  @LoginExitoso
  Scenario: Realizar autenticacion exitosa en la APP
    Given que el usuario quiere acceder a la APP
    When el escribe el usuario laura y la clave nataly
    Then el ve el titulo Metis