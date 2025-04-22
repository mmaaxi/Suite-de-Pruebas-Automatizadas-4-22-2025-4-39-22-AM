package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc10Page;
import static org.junit.Assert.assertTrue;

public class tc10Steps {

    tc10Page page = new tc10Page();

    @Given("el sistema está preparado para la prueba de carga")
    public void prepararSistema() {
        page.prepararSistema();
    }

    @When("ejecuto 1000 solicitudes simultáneas")
    public void ejecutarSolicitudesSimultaneas() {
        page.ejecutarSolicitudesSimultaneas();
    }

    @Then("el sistema responde dentro de los tiempos establecidos sin caídas")
    public void verificarRespuestas() {
        assertTrue(page.verificarRespuestas());
    }
}