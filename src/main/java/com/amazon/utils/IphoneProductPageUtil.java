package com.amazon.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.amazon.pages.IphoneProductPage;

public class IphoneProductPageUtil extends IphoneProductPage {

    public IphoneProductPageUtil(WebDriver driver) {
        super(driver);
    }

    /**
     * Clicks on the iPhone 13 128GB product from the search results.
     * Assumes the product is visible and clickable.
     */
    public void clickIphone128GBFromResults() {
        driver.findElement(iphone128GBFromResult).click();
    }

    /**
     * Returns the WebElement representing the product title on the product page.
     * Useful for validation/assertion.
     */
    public WebElement getProductTitle() {
        return driver.findElement(productTitle);
    }
    
    /**
     * Validate that the product page opened in a new tab.
     */
   public void validateNewTabOpened() {
       String originalTab = driver.getWindowHandle();
       for (String handle : driver.getWindowHandles()) {
           if (!handle.equals(originalTab)) {
               driver.switchTo().window(handle);
               break;
           }
       }
   }

   /**
    * Clicks on the "Visit the Apple Store" link from the product page.
    */
   public void clickAppleStoreLink() {
       driver.findElement(appleStoreLink).click();
   }
   
   /**
    * Validation for the new tab title.
    */
   public void validateNextTab() {
	   waitForElementVisible(appleStoreLink);
       Assert.assertTrue(driver.getTitle().toLowerCase().contains("iphone 13"));
      
   }
}

