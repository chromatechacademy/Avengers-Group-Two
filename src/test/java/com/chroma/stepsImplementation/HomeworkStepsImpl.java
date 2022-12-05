package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;

import com.chroma.utils.CucumberLogUtils;

public class HomeworkStepsImpl extends PageInitializer{

    /**
     * Use this method to check if "Add Homework" is visible in the dropdown menu under "Homework"
     * 
     */
    public static void realEstateLoginCredentials(String username, String password) {
        realEstateLoginPage.realEstateUsernameTextBox.sendKeys(username);
        realEstateLoginPage.realEstatePasswordTextBox.sendKeys(password);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
        realEstateLoginPage.realEstateLoginButton.click();
    }
}
