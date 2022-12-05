package com.chroma.stepDefinitions;

import org.testng.Assert;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.RealEstateLoginStepsImpl;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.WebDriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RealEstateLoginStepDef extends PageInitializer {
    @Given("a user is on the appropriate login page {string}")
    public void a_user_is_on_the_appropriate_login_page(String website) {
        WebDriverUtils.driver.get(website);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @When("user logs in with correct username {string} and password {string}")
    public void user_logs_in_with_correct_username_and_password(String username, String password) {
        RealEstateLoginStepsImpl.realEstateLoginCredentials(username, password);
    }

    @Then("the real estate dashboard page is displayed")
    public void the_real_estate_dashboard_page_is_displayed() {
        boolean isPropertiesOverviewDisplayed = realEstateLoginPage.realEstateDashboardPageText.isDisplayed();
        Assert.assertTrue(isPropertiesOverviewDisplayed);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }
}
