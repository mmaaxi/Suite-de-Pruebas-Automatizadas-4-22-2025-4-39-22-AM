package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc4Page;
import static org.junit.Assert.assertTrue;

public class tc4Steps {
    private WebDriver driver;
    private tc4Page page;

    public tc4Steps() {
        driver = Hooks.getDriver();
        page = PageFactory.initElements(driver, tc4Page.class);
    }

    @Given("el usuario está en la página principal")
    public void elUsuarioEstaEnLaPaginaPrincipal() {
        driver.get("https://ejemplo.com");
    }

    @When("el usuario selecciona la opción 'Configuración' del menú")
    public void elUsuarioSeleccionaLaOpciónConfiguraciónDelMenú() {
        page.clickConfiguracionMenu();
    }

    @Then("el usuario es dirigido a la página de configuración")
    public void elUsuarioEsDirigidoALaPaginaDeConfiguracion() {
        assertTrue(page.isConfiguracionPageDisplayed());
    }
}