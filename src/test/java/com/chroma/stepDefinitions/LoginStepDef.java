package com.chroma.stepDefinitions;

import org.testng.Assert;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.commonMethods.LoginSteps;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.WebDriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef extends PageInitializer {

    @Given("a user is on the CTSMS login page {string}")
    public void a_user_is_on_the_CTSMS_login_page(String url) {

        WebDriverUtils.driver.get(url);

    }

    @When("user logs in with username {string} and password {string}")
    public void user_logs_in_with_username_and_password(String username, String password) {
        LoginSteps.loginCredentials(username, password);
    
    }

    @Then("the home page is displayed")
    public void the_home_page_is_displayed() {

        
        boolean isChromaTechDisplayed = loginPage.homePageText.isDisplayed();
        Assert.assertTrue(isChromaTechDisplayed);
        //driver.switchTo().alert().accept();
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

}