package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc8Page;

public class tc8Steps {

    WebDriver driver;
    tc8Page page;

    @Given("El usuario está en la página de inicio")
    public void elUsuarioEstaEnLaPaginaDeInicio() {
        driver = new ChromeDriver();
        driver.get("http://example.com");
        page = new tc8Page(driver);
    }

    @When("El usuario ingresa un término de búsqueda válido")
    public void elUsuarioIngresaUnTerminoDeBusquedaValido() {
        page.searchForTerm("término de búsqueda");
    }
    
    @Then("El sistema devuelve resultados que coinciden con el término")
    public void elSistemaDevuelveResultadosQueCoincidenConElTermino() {
        Assert.assertTrue(page.searchResultsAreDisplayed());
        driver.quit();
    }
}