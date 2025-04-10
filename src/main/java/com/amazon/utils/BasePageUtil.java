package com.amazon.utils;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.amazon.pages.HomePage;

public class BasePageUtil extends HomePage {

    public BasePageUtil(WebDriver driver) {
        super(driver);
    }

    // Click on Electronics drop down
    public void clickElectronicsDropdown() {
        driver.findElement(electronicsDropdown).click();
    }

    // Get the search box element
    public WebElement getSearchBox() {
        return driver.findElement(searchBox);
    }

    // Type and search "iPhone 13" in the search box
    public void enterProductName() {
        driver.findElement(searchBox).sendKeys("iPhone 13");
    }

    // Get list of suggestions
    public List<WebElement> getSuggestions() {
    	waitForElementVisible(suggestionList);
        return driver.findElements(suggestionList);
    }

    // Validate all suggestions are related to searched product
    public void validateSuggestions() {
        List<WebElement> suggestions = getSuggestions();
        for (WebElement suggestion : suggestions) {
            Assert.assertTrue(
                suggestion.getText().toLowerCase().contains("iphone 13"),
                "Suggestion not related to iPhone 13"
            );
        }
    }

    // Type and click "iPhone 13 128 GB" from dropdown
    public void typeAndSearchIphone128GBVariant() {
        driver.findElement(searchBox).clear();
        driver.findElement(searchBox).sendKeys("iPhone 13 128 GB");
        waitForElementVisible(iphone128GBLink);
        driver.findElement(iphone128GBLink).click();
    }

    
}
