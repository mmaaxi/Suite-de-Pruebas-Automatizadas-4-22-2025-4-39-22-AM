package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.Tc6Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertTrue;

public class Tc6Steps {

    private WebDriver driver;
    private Tc6Page tc6Page;

    @Given("El usuario está en la página de edición de un registro existente")
    public void el_usuario_esta_en_la_pagina_de_edicion_de_un_registro_existente() {
        driver = new ChromeDriver();
        driver.get("URL_DE_LA_APLICACION/editar");
        tc6Page = new Tc6Page(driver);
    }

    @When("Modifica los datos del formulario de edición")
    public void modifica_los_datos_del_formulario_de_edicion() {
        tc6Page.editarRegistro("Nuevo Valor 1", "Nuevo Valor 2");
    }

    @Then("Los cambios se actualizan correctamente en la base de datos")
    public void los_cambios_se_actualizan_correctamente_en_la_base_de_datos() {
        assertTrue(tc6Page.verificarActualizacionExitosa());
        driver.quit();
    }
}