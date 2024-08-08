package com.testing.tests;

import com.testing.pageObject.SamplePage;
import com.testing.utils.DriverManager;
import com.testing.constants.Constant;
//import com.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class SampleTest {

    private WebDriver driver;
    public SamplePage  samplePage;

    @BeforeClass
    public void setup()
    {
        driver = DriverManager.getDriver();
        driver.get(Constant.Base_URL);
    }
@AfterClass
    public void tearDown()
    {if(driver!=null)
    {
        driver.quit();
    }
    }
@Test
    public void testGoogleSearch()
    {
        samplePage=new SamplePage(driver);
        samplePage.searchFor("Selenium");
        Assert.assertEquals(driver.getTitle(),"Selenium - Google Search");
       
    }

}
