package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;

public class RealEstateLoginStepsImpl extends PageInitializer {

    /**
     * Use this method to login to the chroma tech real estate page
     * 
     * @param username
     * @param password
     */
    public static void realEstateLoginCredentials(String username, String password) {
        realEstateLoginPage.realEstateUsernameTextBox.sendKeys(username);
        realEstateLoginPage.realEstatePasswordTextBox.sendKeys(password);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
        realEstateLoginPage.realEstateLoginButton.click();
    }

}