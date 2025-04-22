package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc5Page {
  WebDriver driver;

  By nameField = By.id("name");
  By descriptionField = By.id("description");
  By submitButton = By.id("submit");
  By mainViewList = By.id("recordList");

  public tc5Page(WebDriver driver) {
    this.driver = driver;
  }

  public void navigateToCreationPage() {
    driver.get("http://example.com/createRecord");
  }

  public void enterRecordDetails(String name, String description) {
    driver.findElement(nameField).sendKeys(name);
    driver.findElement(descriptionField).sendKeys(description);
  }

  public void submitForm() {
    driver.findElement(submitButton).click();
  }

  public boolean isRecordListed(String name) {
    return driver.findElement(mainViewList).getText().contains(name);
  }
}