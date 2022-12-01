package com.chroma.stepDefinitions;

import org.testng.Assert;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.LoginStepsImpl;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.WebDriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InvalidCredsLoginStepDef extends PageInitializer {

    @Given("user is on the CTSMS login page {string}")
    public void user_is_on_the_CTSMS_login_page(String url) {
        WebDriverUtils.driver.get(url);
    }

    @When("user logs in with invalid username {string} and password {string}")
    public void user_logs_in_with_invalid_username_and_password(String username, String password) {
        LoginStepsImpl.loginCredentials(username, password);
    }

    @Then("Invalid Username or Password message displays")
    public void invalid_Username_or_Password_message_displays() {
        boolean invalidLoginCredsDisplayed = loginPage.invalidCredentialsText.isDisplayed();
        Assert.assertTrue(invalidLoginCredsDisplayed);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }
}
