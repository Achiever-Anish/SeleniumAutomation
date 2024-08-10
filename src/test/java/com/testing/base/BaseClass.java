package com.testing.base;

import com.testing.utils.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

    protected WebDriver driver;


    @BeforeClass
    public void setup()
    {
        driver = DriverManager.getDriver();
    }
    @AfterClass
    public void tearDown()
    {
        if(driver!=null) {
            driver.quit();
        }
    }


}
