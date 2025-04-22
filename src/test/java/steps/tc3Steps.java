package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc3Page;

public class tc3Steps {
    WebDriver driver;
    tc3Page page;

    @Given("el usuario está en la página de inicio de sesión")
    public void el_usuario_esta_en_la_pagina_de_inicio_de_sesion() {
        driver = new ChromeDriver();
        driver.get("http://tusitio.com/login");
        page = new tc3Page(driver);
    }

    @When("el usuario ingresa un nombre de usuario {string} y una contraseña {string}")
    public void el_usuario_ingresa_credenciales_invalidas(String username, String password) {
        page.enterUsername(username);
        page.enterPassword(password);
    }

    @When("el usuario hace clic en el botón de inicio de sesión")
    public void el_usuario_hace_clic_en_el_boton_de_inicio_de_sesion() {
        page.clickLoginButton();
    }

    @Then("el sistema muestra un mensaje de error de autenticación")
    public void el_sistema_muestra_un_mensaje_de_error_de_autenticacion() {
        WebElement errorMessage = page.getErrorMessage();
        Assert.assertTrue(errorMessage.isDisplayed());
        driver.quit();
    }
}