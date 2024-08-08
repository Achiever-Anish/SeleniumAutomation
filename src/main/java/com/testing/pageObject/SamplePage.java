package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SamplePage {

    WebDriver driver;
    @FindBy(name="q")
    WebElement search;

    public SamplePage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }


    public void searchFor(String query)
    {
        search.sendKeys(query);
        search.submit();;
    }


}
