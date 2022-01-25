package co.com.test.definitions;

import co.com.test.models.CrearUsuarioData;
import co.com.test.steps.AdministrarHospitalSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class AdministrarHospitalDefinition {

    @Steps
    AdministrarHospitalSteps administrarHospitalSteps;

    @Given("^que el usuario quiere registrar un doctor$")
    public void queElUsuarioQuiereRegistrarUnDoctor() {
        administrarHospitalSteps.abrirPagina();
    }

    @When("^ingresa los datos solicitados$")
    public void ingresaLosDatosSolicitados(List<CrearUsuarioData> crearUsuarioData) {
        administrarHospitalSteps.agregarUsuario(crearUsuarioData);
    }

    @Then("^el verifica el mensaje (.*)$")
    public void elVerificaElMensajeDatosGuardadosCorrectamemte(String mensaje) {
        administrarHospitalSteps.verificarMensaje(mensaje);
    }

}
