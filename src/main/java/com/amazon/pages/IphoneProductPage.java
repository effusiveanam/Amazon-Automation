package com.amazon.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.amazon.base.BasePage;
import com.amazon.constants.Constants;

public class IphoneProductPage extends BasePage {
	
	public IphoneProductPage(WebDriver driver) {
		super(driver);
	}

	 //Result page with IPhone 13 128GB product
    public By iphone128GBFromResult = By.xpath(Constants.IPHONE_128GB_RESULT_XPATH);

    // Product title on product page
    public By productTitle = By.tagName("title");

    // "Visit the Apple Store" link
    public By appleStoreLink = By.linkText(Constants.APPLE_STORE_LINKTEXT);
}
