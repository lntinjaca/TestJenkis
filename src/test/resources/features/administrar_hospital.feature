Feature: Administracion de un hospital publico
  Como usuario
  Quiero administrar un hospital
  A traves de la aplicación Sistema de Administracion de Hospitales

  @RegistrarDoctor
  Scenario Outline: Registro de un nuevo doctor
    Given que el usuario quiere registrar un doctor
    When ingresa los datos solicitados
      |nombres		        |apellidos		    	|telefono	    	|tipoDocumento				|numeroDocumento|
      |<nombres>	        |<apellidos>			|<telefono>		    |<tipoDocumento>				|<numeroDocumento>|
    Then el verifica el mensaje Datos guardados correctamemte.
    Examples:
      |nombres		      |apellidos			|telefono	    	|tipoDocumento				|numeroDocumento|

      ##@externaldata@./src/test/resources/Datadriven/Datos.xlsx@HojaDatos
   |Angie Daniela         |Castro Blanco		   |3204930004   |Cédula de extrangería		   |39700004|
   |Laura Nataly          |Gomez Cepeda 		   |3204930005   |Cédula de ciudadanía		   |39700005|
   |Rocio Janeth          |Pedraza Ariza 		   |3204930006   |Cédula de extrangería		   |39700006|
