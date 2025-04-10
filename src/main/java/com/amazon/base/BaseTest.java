package com.amazon.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import com.amazon.constants.Constants;
import org.testng.annotations.AfterClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

//Base test class with WebDriver setup and teardown.

public class BaseTest implements Constants {
    protected WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(AMAZON_HOME_URL);
        
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

