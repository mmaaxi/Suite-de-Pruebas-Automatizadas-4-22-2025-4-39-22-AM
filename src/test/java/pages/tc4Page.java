package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tc4Page {
    private WebDriver driver;

    @FindBy(id = "menuConfiguracion")
    private WebElement menuConfiguracion;

    @FindBy(id = "paginaConfiguracion")
    private WebElement paginaConfiguracion;

    public tc4Page(WebDriver driver) {
        this.driver = driver;
    }

    public void clickConfiguracionMenu() {
        menuConfiguracion.click();
    }

    public boolean isConfiguracionPageDisplayed() {
        return paginaConfiguracion.isDisplayed();
    }
}