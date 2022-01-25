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
      ##|Rocio Janeth 	  |Torres Cendales	    |3204930000	    	|Cédula de ciudadanía		|39700000|
      ##|Angie Daniela      |Castro Blanco		|3204930001	    	|Cédula de extrangería		|39700001|
      ##|Laura Nataly       |Gomez Cepeda 		|3204930002	    	|Cédula de ciudadanía		|39700002|
      ##|Rocio Janeth       |Pedraza Ariza 		|3204930003	    	|Cédula de extrangería		|39700003|