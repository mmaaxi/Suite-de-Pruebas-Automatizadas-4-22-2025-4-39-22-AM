package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Tc6Page {

    private WebDriver driver;

    private By campo1Locator = By.id("campo1");
    private By campo2Locator = By.id("campo2");
    private By submitButtonLocator = By.id("submit");

    public Tc6Page(WebDriver driver) {
        this.driver = driver;
    }

    public void editarRegistro(String nuevoValor1, String nuevoValor2) {
        WebElement campo1 = driver.findElement(campo1Locator);
        WebElement campo2 = driver.findElement(campo2Locator);
        
        campo1.clear();
        campo1.sendKeys(nuevoValor1);

        campo2.clear();
        campo2.sendKeys(nuevoValor2);
        
        driver.findElement(submitButtonLocator).click();
    }

    public boolean verificarActualizacionExitosa() {
        // Implementar lógica para verificar que los cambios se guardaron correctamente.
        return true;
    }
}