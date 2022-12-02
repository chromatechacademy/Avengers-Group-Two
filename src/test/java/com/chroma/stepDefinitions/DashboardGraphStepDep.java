package com.chroma.stepDefinitions;

import org.testng.Assert;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.RealEstateLoginStepsImpl;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class DashboardGraphStepDep extends PageInitializer {

    


@When("Admin user clicks on button overview")
public void admin_user_clicks_on_button_overview() {
    CommonUtils.sleep(5000);
    dashboardGraphPage.overviewRadioBtn.click();
    CucumberLogUtils.logExtentScreenshot();
    CucumberLogUtils.logScreenShot();
    
}
@And("the graph displays with the header text Properties Overview")
public void the_graph_displays_with_the_header_text_Properties_Overview() {
    dashboardGraphPage.propertiesOverview.isDisplayed();
    CucumberLogUtils.logExtentScreenshot();
    CucumberLogUtils.logScreenShot();
}

@And("Admin clicks on button Agents Graph")
public void admin_clicks_on_button_Agents_Graph() {
    dashboardGraphPage.agentGraphRadioBtn.click();
    CucumberLogUtils.logExtentScreenshot();
    CucumberLogUtils.logScreenShot();
}


@Then("graph displays with header text Reserved by Agents")
public void graph_displays_with_header_text_Reserved_by_Agents() {
        dashboardGraphPage.reserveByAgentsText.isDisplayed();
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
 

}
}









    

