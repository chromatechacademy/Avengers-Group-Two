package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;

public class DashboardGraphImpl extends PageInitializer {

    public static void dashboardPage(){

        dashboardGraphPage.overviewRadioBtn.click();
        dashboardGraphPage.agentGraphRadioBtn.click();
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
        realEstateLoginPage.realEstateLoginButton.click();
     }     
}


    

