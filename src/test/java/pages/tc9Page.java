package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc9Page {
    WebDriver driver;

    By submitButton = By.id("submit-button");
    By errorMessage = By.cssSelector(".error-message");

    public tc9Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToFormPage() {
        driver.get("https://example.com/form");
    }

    public void submitForm() {
        driver.findElement(submitButton).click();
    }

    public boolean areErrorMessagesDisplayed() {
        return driver.findElements(errorMessage).size() > 0;
    }
}