package com.amazon.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import com.amazon.pages.AppleStorePage;

public class AppleStorePageUtil extends AppleStorePage {

    public AppleStorePageUtil(WebDriver driver) {
        super(driver);
    }

    // Click on Apple Watch dropdown
    public void clickAppleWatchDropDown() {
        driver.findElement(appleWatchDropdown).click();
        CommonUtil.sleep(3);
    }

    // Select Apple Watch SE (GPS + Cellular)
    public void selectAppleWatchSE() {
        driver.findElement(appleWatchSEOption).click();
    }

    // Hover over the Apple Watch image
    public void hoverOverWatchImage() {
        WebElement watchElement = driver.findElement(watchImage);
        new Actions(driver).moveToElement(watchElement).perform();
        CommonUtil.sleep(5);
    }

    // Check if Quick Look modal is displayed
    public void validateQuickLookModalIsDisplayed() {
        boolean isQuickLookModalDisplayed = driver.findElement(quickLookView).isDisplayed();
        Assert.assertTrue(isQuickLookModalDisplayed, "Quick Look modal is not displayed");
    }

    // Click on Quick Look modal
    public void clickQuickLookModal() {
        driver.findElement(quickLookView).click();
        CommonUtil.sleep(5);
    }

    // Validate modal opened from Quick Look is for the same product
    public void validateQuickLookNewlyOpenedModalDisplay() {
        boolean isModalCorrect = driver.findElement(quickLookModalClickedProduct).isDisplayed();
        Assert.assertTrue(
            isModalCorrect,
            "Newly opened modal is not related to the same product for which Quick Look is performed"
        );
    }
}
