package com.chroma.commonMethods;

import com.chroma.appsCommon.PageInitializer;

public class LoginSteps extends PageInitializer{

    public static void loginCredentials(String username, String password){

        loginPage.userNameTextBox.sendKeys(username);
        loginPage.passwordTextBox.sendKeys(password);
        loginPage.signInButton.click();

    }   
    
}
