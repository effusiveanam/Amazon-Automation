package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.amazon.base.BasePage;
import com.amazon.constants.Constants;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    // Electronics drop down
    public By electronicsDropdown = By.xpath(Constants.ELECTRONICS_DROPDOWN);

    // Search box
    public By searchBox = By.id(Constants.SEARCH_BAR_XPATH);

    // Dropdown suggestions
    public By suggestionList = By.xpath(Constants.SUGGESTION_LIST);

    // iPhone 13 128GB variant
    public By iphone128GBLink = By.xpath(Constants.IPHONE_128GB_LINK_XPATH);


}
