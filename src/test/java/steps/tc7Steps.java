package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc7Page;

public class tc7Steps {

    WebDriver driver;
    tc7Page page;

    @Given("El usuario está en la página de lista de registros")
    public void el_usuario_esta_en_la_pagina_de_lista_de_registros() {
        driver = new ChromeDriver();
        driver.get("http://example.com/records");
        page = new tc7Page(driver);
    }

    @When("Selecciona la opción de eliminación para un registro")
    public void selecciona_la_opcion_de_eliminacion_para_un_registro() {
        page.clickDeleteButton();
    }

    @Then("El registro es eliminado y ya no aparece en la lista")
    public void el_registro_es_eliminado_y_ya_no_aparece_en_la_lista() {
        Assert.assertFalse("Error: El registro aún aparece en la lista", page.isRecordPresent());
        driver.quit();
    }
}