package com.testing.tests;

import com.testing.base.BaseClass;
import com.testing.pageObject.SamplePage;

import com.testing.constants.Constant;

import org.testng.Assert;
import org.testng.annotations.Test;


public class SampleTest extends BaseClass {

    private SamplePage  samplePage;



@Test(priority = 2)
    public void testGoogleSearch()
    {
        driver.get(Constant.Base_URL);
        samplePage=new SamplePage(driver);
        samplePage.searchFor("Selenium");
        Assert.assertEquals(driver.getTitle(),"Selenium - Google Search");
       
    }
    @Test(priority = 1)
    public void testGoogleNegativeSearch()
    {
        driver.get(Constant.Base_URL);
        samplePage=new SamplePage(driver);
        samplePage.searchFor("Anish");
        Assert.assertEquals(driver.getTitle(),"Anish - Google Search");

    }


}
