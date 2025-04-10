package com.amazon.tests;

import org.testng.annotations.Test;
import com.amazon.base.BaseTest;
import com.amazon.utils.AppleStorePageUtil;
import com.amazon.utils.BasePageUtil;
import com.amazon.utils.IphoneProductPageUtil;

import io.qameta.allure.Allure;

public class AmazonTest extends BaseTest {

    @Test (description = "Search iPhone 13 and navigate to Apple Store")
    public void testSearchAndBrowseProducts() {

        BasePageUtil basePageUtil = new BasePageUtil(driver);
        IphoneProductPageUtil productPageUtil = new IphoneProductPageUtil(driver);
        AppleStorePageUtil appleStorePageUtil = new AppleStorePageUtil(driver);

        // Step 1: Click Electronics drop down
        Allure.step("Select Electronics from dropdown", () -> {
        	basePageUtil.clickElectronicsDropdown();
        });

        // Step 2: Type "iPhone 13" and validate suggestions
        Allure.step("Type 'IPhone 13' and get dropdown suggestions", () -> {
        basePageUtil.enterProductName();
        basePageUtil.getSuggestions();
        basePageUtil.validateSuggestions();
        });
        
        // Step 3: Type "iPhone 13 128GB" and click on the drop down
        Allure.step("Search for 'IPhone 13 128 GB' and click on the drop down", () -> {
        basePageUtil.typeAndSearchIphone128GBVariant();
        });
        
        // Step 4: Click on the searched product from results and switch to new tab
        Allure.step("Click on the variant 'IPhone 13 128 GB' from Result Page  and switch to new tab", () -> {
        productPageUtil.clickIphone128GBFromResults();
        });
        
        // Step 5: Validate that the product page opened in a new tab
        Allure.step("Click on the product and validate new tab is opened", () -> {
        productPageUtil.validateNewTabOpened();
        productPageUtil.validateNextTab();
        });
        
        // Step 6: Click on "Visit the Apple Store" link
        Allure.step("Click 'Visit the Apple Store' link", () -> {
        productPageUtil.clickAppleStoreLink();
        });
        
        // Step 7: Click on Apple Watch drop down
        Allure.step("Hover over Apple Watch dropdown", () -> {
        appleStorePageUtil.clickAppleWatchDropDown();
        });
        
        // Step 8: Select Apple Watch SE (GPS + Cellular)
        Allure.step("Select Apple Watch SE (GPS + Cellular)", () -> {
        appleStorePageUtil.selectAppleWatchSE();
        });
        
        // Step 9: Hover over Apple Watch image and verify Quick Look is displayed
        Allure.step("Verify Quick look Modal is displayed for Apple Watch", () -> {
        appleStorePageUtil.hoverOverWatchImage();
        appleStorePageUtil.validateQuickLookModalIsDisplayed();
        });
        
        // Step 10: Click Quick Look modal and validate the correct modal is displayed
        Allure.step("Verify Quick Look modal is opened for Apple Watch upon clicking the Quick look", () -> {
        appleStorePageUtil.clickQuickLookModal();
        appleStorePageUtil.validateQuickLookNewlyOpenedModalDisplay();
        });
    }
}
