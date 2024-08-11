package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SamplePage {

    WebDriver driver;

    @FindBy(name="q")
   public WebElement search;

    @FindBy(id="username")
    public  WebElement emailTextBox;

    @FindBy(id="password")
   public WebElement pwdTextBox;

    @FindBy(id="submit")
    public WebElement submitButton;

    @FindBy(id="error")
   public WebElement errorMessage;

    @FindBy(xpath="//*[@id='loop-container']/div/article/div[2]/p[1]/strong")
    public WebElement successMessage;

    @FindBy(xpath="//*[@id='loop-container']/div/article/div[2]/div/div/div/a")
    public WebElement logoutButton;


    public SamplePage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }


}
