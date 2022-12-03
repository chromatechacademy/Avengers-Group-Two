package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;

public class AgentsModuleImpl extends PageInitializer {


    public static void dashboardPage(){

        agentModulePage.agentsModuleText.click();
        agentModulePage.agentsdisplay.isDisplayed();
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
        realEstateLoginPage.realEstateLoginButton.click();

    } 

    
}
