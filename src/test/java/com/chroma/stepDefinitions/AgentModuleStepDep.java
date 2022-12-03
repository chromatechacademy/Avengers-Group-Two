package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AgentModuleStepDep extends PageInitializer {

    @When("user clicks the text agents from the dashboard")
    public void user_clicks_the_text_agents_from_the_dashboard() {
        agentModulePage.agentsModuleText.click();
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @Then("agents page displays")
    public void agents_page_displays() {
        agentModulePage.agentsdisplay.isDisplayed();
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }
}
