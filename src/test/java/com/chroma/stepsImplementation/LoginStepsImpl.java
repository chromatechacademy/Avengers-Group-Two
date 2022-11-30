package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;

public class LoginStepsImpl extends PageInitializer {

    /**
     * Use this method to login
     * 
     * @param username
     * @param password
     */
    public static void loginCredentials(String username, String password) {
        loginPage.userNameTextBox.sendKeys(username);
        loginPage.passwordTextBox.sendKeys(password);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
        loginPage.signInButton.click();
    }

}
