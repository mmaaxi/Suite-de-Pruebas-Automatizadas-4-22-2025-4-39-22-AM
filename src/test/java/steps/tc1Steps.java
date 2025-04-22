import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertTrue;

public class tc1Steps {
    
    tc1Page page;

    @Given("que la aplicación está instalada")
    public void queLaAplicacionEstaInstalada() {
        page = new tc1Page();
    }

    @When("el usuario inicia la aplicación")
    public void elUsuarioIniciaLaAplicacion() {
        page.iniciarAplicacion();
    }

    @Then("la aplicación se inicia correctamente")
    public void laAplicacionSeIniciaCorrectamente() {
        boolean isLaunched = page.verificarAplicacionIniciada();
        assertTrue("La aplicación no se inició correctamente", isLaunched);
    }
}