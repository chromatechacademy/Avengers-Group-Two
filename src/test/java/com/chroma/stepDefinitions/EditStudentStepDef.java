package com.chroma.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.EditStudentStepsImpl;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.WebDriverUtils;

public class EditStudentStepDef extends PageInitializer {
    @When("the user clicks on the Student Details tab under the Student Information dropdown menu")
    public void the_user_clicks_on_the_Student_Details_tab_under_the_Student_Information_dropdown_menu() {
        dashboardStudentInformationPage.studentInformationButton.click();
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
        dashboardStudentInformationPage.studentDetailsButton.click();
    }

    @When("selects the name of the {string} in the Class dropdown menu and clicks the search button")
    public void selects_the_name_of_the_in_the_Class_dropdown_menu_and_clicks_the_search_button(String SDET) throws InterruptedException {
        Select classDropdown = new Select(WebDriverUtils.driver.findElement(By.xpath("//select[@name='class_id']")));
        classDropdown.selectByVisibleText(SDET);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
        studentDetailsPage.searchButton.click();
    }

    @When("the user clicks on the Pencil icon for Kobe Bryant")
    public void the_user_clicks_on_the_Pencil_icon_for_Kobe_Bryant() {
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
        studentDetailsPage.editButton.click();
    }

    @When("changes the Email to {string} and clicks the Save button")
    public void changes_the_Email_to_and_clicks_the_Save_button(String email) {
        editStudentPage.emailTextbox.clear();
        editStudentPage.emailTextbox.sendKeys(email);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
        editStudentPage.saveButton.click();
    }

    @Then("the student has been updated")
    public void the_student_has_been_updated() {
        boolean didEditStudentWork = studentDetailsPage.successfulChange.isDisplayed();
        Assert.assertTrue(didEditStudentWork);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @Then("clicks on Kobe Bryant")
    public void clicks_on_Kobe_Bryant() {
        EditStudentStepsImpl.clickOnKobeBryant();
    }

    @Then("the change made can be confirmed")
    public void the_change_made_can_be_confirmed() {
        EditStudentStepsImpl.editStudentCheck();
    }
}
