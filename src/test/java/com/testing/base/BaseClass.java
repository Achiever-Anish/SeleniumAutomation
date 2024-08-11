package com.testing.base;

import com.testing.constants.Constant;
import com.testing.utils.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    protected WebDriver driver;


    @BeforeMethod
    public void setup()
    {

        driver = DriverManager.getDriver();

        driver.manage().window().maximize();

        driver.get(Constant.practice_URL);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterMethod
    public void tearDown()
    {
        if(driver!=null) {
            
            driver.quit();

        }
    }


}
