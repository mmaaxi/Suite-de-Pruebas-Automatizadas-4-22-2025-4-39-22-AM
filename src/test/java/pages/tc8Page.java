package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc8Page {

    WebDriver driver;

    By searchBox = By.id("searchBox");
    By searchButton = By.id("searchButton");
    By resultsContainer = By.id("resultsContainer");

    public tc8Page(WebDriver driver) {
        this.driver = driver;
    }

    public void searchForTerm(String term) {
        WebElement searchField = driver.findElement(searchBox);
        searchField.sendKeys(term);
        driver.findElement(searchButton).click();
    }

    public boolean searchResultsAreDisplayed() {
        return driver.findElement(resultsContainer).isDisplayed();
    }
}