package co.com.test;

import cucumber.api.SnippetType;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.util.SystemEnvironmentVariables;

public class RunnerTags {
    @Before
    public void test() {
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
    }

    @Test
    public void testRunner() {
        JUnitCore.runClasses(CRunnerPedido.class);
    }

    @RunWith(CucumberWithSerenity.class)
    @CucumberOptions(
            //features = "src/test/resources/features/login_colorlib.feature",
            features = "src/test/resources/features/administrar_hospital.feature",
            //tags = "@RegistarDoctor",
            tags = "@RegistrarDoctor",
            glue = "co.com.test.definitions",
            snippets = SnippetType.CAMELCASE // Métodos a implementar
    )

    public class CRunnerPedido {
    }

    }