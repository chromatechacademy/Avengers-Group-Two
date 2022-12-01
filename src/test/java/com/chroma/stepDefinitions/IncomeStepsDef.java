package com.chroma.stepDefinitions;

import org.testng.Assert;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.LoginStepsImpl;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.WebDriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class IncomeStepsDef extends PageInitializer {

    @Given("user is on dashboard page {string}")
    public void user_is_on_dashboard_page(String url) {
        WebDriverUtils.driver.get(url);
    }

    @When("user with valid credentials logs in with username {string} and password {string}")
    public void user_with_valid_credentials_logs_in_with_username_and_password(String username, String password) {
        LoginStepsImpl.loginCredentials(username, password);
    }

    @When("user clicks on Income button")
    public void user_clicks_on_Income_button() throws InterruptedException {
        incomePage.dropDownButton.click();
        Thread.sleep(5000);
    }

    @Then("user should be able to see Income option, Add Income, Search Income, Income Head")
    public void user_should_be_able_to_see_Income_option_Add_Income_Search_Income_Income_Head() {
        boolean isDashboardDisplayed = incomePage.dropDownButton.isDisplayed();
        Assert.assertTrue(isDashboardDisplayed);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }
}
