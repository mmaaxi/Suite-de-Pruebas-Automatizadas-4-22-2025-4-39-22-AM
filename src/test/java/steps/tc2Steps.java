package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.Tc2Page;
import static org.junit.Assert.assertTrue;

public class Tc2Steps {

    WebDriver driver;
    Tc2Page loginPage;

    public Tc2Steps() {
        this.driver = Hooks.driver;
        loginPage = PageFactory.initElements(driver, Tc2Page.class);
    }

    @Given("el usuario está en la página de login")
    public void el_usuario_está_en_la_página_de_login() {
        driver.get("http://ejemplo.com/login");
    }

    @When("ingresa credenciales válidas")
    public void ingresa_credenciales_válidas() {
        loginPage.enterUsername("usuario_valido");
        loginPage.enterPassword("contraseña_valida");
        loginPage.clickLoginButton();
    }

    @Then("el usuario es autenticado y redirigido al dashboard")
    public void el_usuario_es_autenticado_y_redirigido_al_dashboard() {
        assertTrue(loginPage.isDashboardDisplayed());
    }
}