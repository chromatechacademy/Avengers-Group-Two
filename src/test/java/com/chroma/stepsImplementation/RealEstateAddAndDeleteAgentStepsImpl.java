package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;

public class RealEstateAddAndDeleteAgentStepsImpl extends PageInitializer{
    /**
     * Use this method to enter information of the student
     * @param firstName
     * @param lastName
     * @param email
     * @param contactNumber
     * @param password
     * 
     */
    public static void realEstateStudentInformation(String firstName, String lastName, String email, String contactNumber, String password){
        realEstateAgentsPage.firstNameTextbox.sendKeys(firstName);
        realEstateAgentsPage.lastNameTextbox.sendKeys(lastName);
        realEstateAgentsPage.emailTextbox.sendKeys(email);
        realEstateAgentsPage.contactNumberTextbox.sendKeys(contactNumber);
        realEstateAgentsPage.passwordTextbox.sendKeys(password);
        realEstateAgentsPage.retypePasswordTextbox.sendKeys(password);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
        realEstateAgentsPage.saveButton.click();
        realEstateAgentsPage.backButton.click();
    }
}
