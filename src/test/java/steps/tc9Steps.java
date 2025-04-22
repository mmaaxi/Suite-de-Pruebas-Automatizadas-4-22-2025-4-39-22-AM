package steps;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc9Page;
import org.junit.Assert;

public class tc9Steps {
    WebDriver driver;
    tc9Page page;

    @Given("El usuario está en la página del formulario")
    public void el_usuario_esta_en_la_pagina_del_formulario() {
        driver = hooks.driver;
        page = new tc9Page(driver);
        page.navigateToFormPage();
    }

    @When("El usuario intenta enviar el formulario sin completar campos obligatorios")
    public void el_usuario_intenta_enviar_el_formulario_sin_completar_campos_obligatorios() {
        page.submitForm();
    }

    @Then("El sistema muestra mensajes de error indicando los campos vacíos")
    public void el_sistema_muestra_mensajes_de_error_indicando_los_campos_vacios() {
        Assert.assertTrue("No se muestran mensajes de error", page.areErrorMessagesDisplayed());
    }
}