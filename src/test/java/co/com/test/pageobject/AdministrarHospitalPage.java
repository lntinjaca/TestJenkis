package co.com.test.pageobject;

import co.com.test.models.CrearUsuarioData;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static co.com.test.utilidades.Constantes.*;

@DefaultUrl(URL_HOSPITAL)
public class AdministrarHospitalPage extends PageObject {

    // Seleccionar opción Agregar Doctor
    @FindBy (xpath = "//a[@href='addDoctor']")
    WebElementFacade opAddDoctor;

    // Objetos para Agregar Doctor
    @FindBy (id = "name")
    WebElementFacade txtNombres;
    @FindBy (id = "last_name")
    WebElementFacade txtApellidos;
    @FindBy (id = "telephone")
    WebElementFacade txtTelefono;
    @FindBy (id = "identification_type")
    WebElementFacade lstTipoDocumento;
    @FindBy (id = "identification")
    WebElementFacade txtNumeroDocumento;
    @FindBy (xpath = "//a[@onclick='submitForm()']")
    WebElementFacade btnGuardar;
    @FindBy (xpath = "//div[@id='page-wrapper']//p")
    WebElementFacade lblMensajeUsuarioCreado;

    public void registrarDatosUsuario(List<CrearUsuarioData> crearUsuarioData) {
        opAddDoctor.click();
        txtNombres.sendKeys(crearUsuarioData.get(0).getNombres());
        txtApellidos.sendKeys(crearUsuarioData.get(0).getApellidos());
        txtTelefono.sendKeys(String.valueOf(crearUsuarioData.get(0).getTelefono()));
        lstTipoDocumento.select().byVisibleText(crearUsuarioData.get(0).getTipoDocumento());
        txtNumeroDocumento.sendKeys(String.valueOf(crearUsuarioData.get(0).getNumeroDocumento()));
        btnGuardar.click();
    }

    public void usuarioCreadoExitosamente(String mensaje) {
        MatcherAssert.assertThat(mensaje,containsText(lblMensajeUsuarioCreado.getText()));
    }
}
