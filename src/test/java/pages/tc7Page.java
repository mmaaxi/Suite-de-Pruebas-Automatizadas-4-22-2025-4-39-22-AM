package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc7Page {

    WebDriver driver;

    public tc7Page(WebDriver driver) {
        this.driver = driver;
    }

    public void clickDeleteButton() {
        driver.findElement(By.id("delete-button-id")).click();  // Example locator
    }

    public boolean isRecordPresent() {
        try {
            return driver.findElement(By.id("record-id")).isDisplayed();  // Example locator
        } catch (Exception e) {
            return false;
        }
    }
}