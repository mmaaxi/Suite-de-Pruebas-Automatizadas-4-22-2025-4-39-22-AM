package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc5Page;

public class tc5Steps {
  WebDriver driver;
  tc5Page page;

  @Given("el usuario está en la página de creación de registros")
  public void el_usuario_esta_en_la_pagina_de_creacion_de_registros() {
    page = new tc5Page(driver);
    page.navigateToCreationPage();
  }

  @When("el usuario completa el formulario de creación de registro")
  public void el_usuario_completa_el_formulario_de_creacion_de_registro() {
    page.enterRecordDetails("Sample Name", "Sample Description");
    page.submitForm();
  }

  @Then("el nuevo registro es creado y aparece listado en la vista principal")
  public void el_nuevo_registro_es_creado_y_aparece_listado_en_la_vista_principal() {
    Assert.assertTrue(page.isRecordListed("Sample Name"));
  }
}