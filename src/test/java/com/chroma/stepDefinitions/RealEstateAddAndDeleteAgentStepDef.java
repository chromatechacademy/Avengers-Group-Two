package com.chroma.stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.RealEstateAddAndDeleteAgentStepsImpl;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import com.chroma.web.JavascriptUtils;
import com.chroma.web.WebDriverUtils;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RealEstateAddAndDeleteAgentStepDef extends PageInitializer {
    @When("clicks on Agents and clicks on Add Now")
    public void clicks_on_Agents_and_clicks_on_Add_Now() {
        realEstateAgentsDashboardPage.agents.click();
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
        realEstateAgentsPage.addNow.click();
    }

    @When("enters First Name {string}, Last Name {string}, Email {string}, Contact Number {string}, Password {string}, retypes password, clicks Save and clicks Back")
    public void enters_First_Name_Last_Name_Email_Contact_Number_Password_retypes_password_clicks_Save_and_clicks_Back(
            String firstName, String lastName, String email, String contactNumber, String password) {
        RealEstateAddAndDeleteAgentStepsImpl.realEstateStudentInformation(firstName, lastName, email, contactNumber,
                password);
    }

    @When("the user clicks Active on the left")
    public void the_user_clicks_Active_on_the_left() {
        realEstateAgentsPage.activeButton.click();
        JavascriptUtils.scrollIntoView(realEstateAgentsPage.threeDotsButton);
    }

    @Then("the user will see {string} added as an agent")
    public void the_user_will_see_added_as_an_agent(String lolLeedlelee) {
        Boolean doesStudentExist = WebDriverUtils.driver
                .findElement(By.xpath("//td[normalize-space()='lol@league.com']")).isDisplayed();
        Assert.assertTrue(doesStudentExist);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @When("the user clicks on the three dots next to the active student lol Leedlelee and clicks Delete")
    public void the_user_clicks_on_the_three_dots_next_to_the_active_student_lol_Leedlelee_and_clicks_Delete() {
        realEstateAgentsPage.threeDotsButton.click();
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
        realEstateAgentsPage.deleteButton.click();
        CommonUtils.sleep(3000);
    }

    @When("the user clicks on Inactive on the left, clicks on the three dots next to the inactive student lol Leedlelee and clicks Delete Permanently")
    public void the_user_clicks_on_Inactive_on_the_left_clicks_on_the_three_dots_next_to_the_inactive_student_lol_Leedlelee_and_clicks_Delete_Permanently() {
        realEstateAgentsPage.inactiveButton.click();
        JavascriptUtils.scrollIntoView(realEstateAgentsPage.threeDotsButton);
        CommonUtils.sleep(3000);
        realEstateAgentsPage.threeDotsButton.click();
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
        realEstateAgentsPage.deletePermanentlyButton.click();
        realEstateAgentsPage.okButton.click();
    }

    @Then("when the user clicks on All Agents on the left the student {string} will not be shown")
    public void when_the_user_clicks_on_All_Agents_on_the_left_the_student_will_not_be_shown(String lolAtLeagueDotCom) {
        realEstateAgentsPage.allAgentsButton.click();
        List<WebElement> emails = WebDriverUtils.driver.findElements(By.xpath("//td[contains(text(),'.')]"));
        for (WebElement email : emails) {
            String emailValue = email.getText();
            Assert.assertNotEquals(emailValue, lolAtLeagueDotCom);
        }
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }
}
