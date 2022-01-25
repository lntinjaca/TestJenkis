package co.com.test.steps;

import co.com.test.models.CrearUsuarioData;
import co.com.test.pageobject.AdministrarHospitalPage;
import net.thucydides.core.annotations.Step;

import java.util.List;

public class AdministrarHospitalSteps {

    AdministrarHospitalPage administrarHospitalPage;

    @Step
    public void abrirPagina() {
        administrarHospitalPage.open();
    }

    @Step
    public void agregarUsuario(List<CrearUsuarioData> crearUsuarioData) {
        administrarHospitalPage.registrarDatosUsuario(crearUsuarioData);
    }

    @Step
    public void verificarMensaje(String mensaje) {
        administrarHospitalPage.usuarioCreadoExitosamente (mensaje);
    }
}
