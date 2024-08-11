package com.testing.tests;

import com.testing.base.BaseClass;
import com.testing.pageObject.SamplePage;

import com.testing.constants.Constant;

import org.testng.Assert;
import org.testng.annotations.Test;


public class SampleTest extends BaseClass {

    private SamplePage samplePage;

    @Test(priority = 2)
    public void testcase1()
    {
        samplePage =new SamplePage(driver);

       samplePage.emailTextBox.sendKeys("jhdchss");

       samplePage.pwdTextBox.sendKeys("Password123");

        samplePage.submitButton.click();

        if(samplePage.errorMessage.isDisplayed())
        {
            Assert.assertEquals(samplePage.errorMessage.getText(), "Your username is invalid!");
        }

    }
    @Test(priority = 1)
    public void testcase2() {

        samplePage =new SamplePage(driver);
        samplePage.emailTextBox.sendKeys("student");

        samplePage.pwdTextBox.sendKeys("bdbdjs");

        samplePage.submitButton.click();

        if (samplePage.errorMessage.isDisplayed()) {
            Assert.assertEquals(samplePage.errorMessage.getText(), "Your password is invalid!");
        }
    }
        @Test(priority = -1)
        public void testcase3()
        {

            samplePage =new SamplePage(driver);
            samplePage.emailTextBox.sendKeys("student");

            samplePage.pwdTextBox.sendKeys("Password123");

            samplePage.submitButton.click();

            Assert.assertEquals(driver.getCurrentUrl(), "https://practicetestautomation.com/logged-in-successfully/");

            Assert.assertEquals(samplePage.successMessage.getText(), "Congratulations student. You successfully logged in!");

            if(samplePage.logoutButton.isDisplayed())
            {
                samplePage.logoutButton.click();
            }
        }

    }

