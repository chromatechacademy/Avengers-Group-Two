package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.DisableStudentPage;
import com.chroma.utils.CucumberLogUtils;
import cucumber.api.java.en.Then;

public class DisableStudentFileDef extends PageInitializer {

    @Then("user will select Student Information tab")
    public void user_will_select_Student_Information_tab() {
        disableStudentPage.selectStudentInformation.click();
    }

    @Then("user will click on Student Details")
    public void user_will_click_on_Student_Details() {
        disableStudentPage.selectStudentDetailTab.click();
    }

    @Then("will select {string} on the class drop down")
    public void will_select_on_the_class_drop_down(String classSelection) throws InterruptedException {
        DisableStudentPage.studentDetailsPage(classSelection);
        Thread.sleep(3000);
    }

    @Then("user will click on the search button")
    public void user_will_click_on_the_search_button() {
        disableStudentPage.searchButton.click();
    }

    @Then("user will select Jon Doe")
    public void user_will_select_Jon_Doe() {
        disableStudentPage.jonDoeName.click();
    }

    @Then("user will click the Disable button")
    public void user_will_click_the_Disable_button() {
        disableStudentPage.disableButton.click();
        driver.switchTo().alert().accept();
    }

    @Then("will select {string} on the reason drop down")
    public void will_select_on_the_reason_drop_down(String reasonSelection) throws InterruptedException {
        Thread.sleep(2000);
        DisableStudentPage.reasonPage(reasonSelection);
    }

    @Then("clicks Save button")
    public void clicks_Save_button() {
        disableStudentPage.saveButton.click();
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();

    }
}
