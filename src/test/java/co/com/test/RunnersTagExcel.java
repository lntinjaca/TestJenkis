package co.com.test;


import co.com.test.utilidades.DataToFeature;
import cucumber.api.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.util.SystemEnvironmentVariables;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;

import java.io.IOException;

//@RunWith(RunnerPersonalizado.class)
//@RunWith(CucumberWithSerenity.class)
public class RunnersTagExcel {

    @Before
    public void test() throws IOException, InvalidFormatException {
        switch (SystemEnvironmentVariables.createEnvironmentVariables().getProperty("webdriver.driver")) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                break;
            case "ie":
            case "iexplorer":
                WebDriverManager.iedriver().setup();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                break;
            default:
                WebDriverManager.chromedriver().setup();
                break;
        }
        //actualizacion de datos en features
        DataToFeature.overrideFeatureFiles("./src/test/resources/features/administrar_hospital.feature");

    }

    @Test
    public void testRunner() {
        JUnitCore.runClasses(CRunnerPedido.class);
    }

    @RunWith(CucumberWithSerenity.class)
    @CucumberOptions(features = "src/test/resources/features/administrar_hospital.feature",
            tags = { "@RegistrarDoctor"},
            glue = "co.com.test.definitions")

    public class CRunnerPedido {
    }

}

