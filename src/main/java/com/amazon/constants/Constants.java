package com.amazon.constants;


//Constants for selectors, URLs, etc. Store constant values like locators, URLs
public interface Constants {
	
    public static final String AMAZON_HOME_URL = "https://www.amazon.in/";
    String ELECTRONICS_DROPDOWN = "//a[text()=' Electronics ']";
    String SEARCH_BAR_XPATH = "twotabsearchtextbox";
    String SEARCH_RESULT_XPATH = "//span[contains(text(),'iPhone 13 128GB')]";
    String SUGGESTION_LIST = "//div[@class='s-suggestion-container']//div[@class='s-suggestion s-suggestion-ellipsis-direction'][contains(text(), 'iphone 13')]";
    String IPHONE_128GB_LINK_XPATH = "//div[@aria-label='iphone 13 128gb']//span[@class='s-heavy' and text()='iphone 13 128gb']\n";
    String IPHONE_128GB_RESULT_XPATH = "//span[contains(text(), 'Apple iPhone 13 (128GB) - Starlight')]";
    String APPLE_STORE_LINKTEXT = "Visit the Apple Store";
    String APPLE_WATCH_DROPDOWN = "//a[contains(@href, '/stores/page/') and contains(., 'Apple Watch')]\n";
    String APPLE_WATCH_SE_CELLULAR_GPS = "//a[contains(@href, '/stores/page/') and contains(., 'Apple Watch SE (GPS + Cellular)')]\n";
    String WATCH_IMAGE = "//a[@title=\"Apple Watch SE (2nd Gen, 2023) [GPS + Cellular 40mm] Smartwatch with Starlight Aluminum Case with Starlight Sport Band. Fitness & Sleep Tracker, Crash Detection, Heart Rate Monitor, Retina Display\"]\n";
    String QUICK_LOOK_VIEW = "//*[@id=\"4k2av5ugzs\"]/div/div/div/div/div[1]/button/div";
    String QUCIK_LOOK_MODAL = "//a[@data-testid='product-showcase-title' and contains(@href, 'B0DGJ3WLRJ')]\n";
}
