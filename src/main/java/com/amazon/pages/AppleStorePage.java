package com.amazon.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.amazon.base.BasePage;
import com.amazon.constants.Constants;

public class AppleStorePage extends BasePage {
	
	public AppleStorePage(WebDriver driver) {
		super(driver);
	}

    // Apple Watch dropdown
    public By appleWatchDropdown = By.xpath(Constants.APPLE_WATCH_DROPDOWN);

    // Apple Watch SE (GPS + Cellular) option
    public By appleWatchSEOption = By.xpath(Constants.APPLE_WATCH_SE_CELLULAR_GPS);

    // Apple Watch image
    public By watchImage = By.xpath(Constants.WATCH_IMAGE);

    // Quick Look Hover 
    public By quickLookView = By.xpath(Constants.QUICK_LOOK_VIEW);
    
    //Quick Look Opened Modal
    public By quickLookModalClickedProduct = By.xpath(Constants.QUCIK_LOOK_MODAL);

}
