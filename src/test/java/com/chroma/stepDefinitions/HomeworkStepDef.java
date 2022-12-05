package com.chroma.stepDefinitions;

import org.testng.Assert;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomeworkStepDef extends PageInitializer{
    @When("user clicks on the Homework dropdown menu option")
    public void user_clicks_on_the_Homework_dropdown_menu_option() {
        dashboardHomeworkPage.homeworkButton.click();
    }

    @Then("the {string} option is displayed")
    public void the_option_is_displayed(String string) {
        boolean isAddHomeworkDisplayed = dashboardHomeworkPage.addHomeworkText.isDisplayed();
        Assert.assertTrue(isAddHomeworkDisplayed);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }
}
