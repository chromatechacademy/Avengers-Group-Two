package com.chroma.stepDefinitions;

import org.testng.Assert;

import com.chroma.pages.NavigationModPage;
import com.chroma.utils.CucumberLogUtils;

import cucumber.api.java.en.Then;


public class NavigationModDef {
    @Then("user is able to see links displayed {string}, {string}, {string}, {string}, {string}, {string},{string},{string}")
    public void user_is_able_to_see_links_displayed(String studentInformation, String feesCollection, String income,
            String expenses,
            String academics, String humanResource, String homework, String reports) {

        boolean isStudentInformationDisplayed = NavigationModPage.dynamicModule(studentInformation).getText()
                .contentEquals(studentInformation);
               
      Assert.assertTrue(isStudentInformationDisplayed);
                CucumberLogUtils.logExtentScreenshot();
                CucumberLogUtils.logScreenShot();
                
               

          
}

}