package com.chroma.stepDefinitions;

import org.testng.Assert;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;


public class StudentInfoStepDef extends PageInitializer{ 

    @And("a user clicks on Student Information module")
    public void a_user_clicks_on_Student_Information_module() throws InterruptedException {
    Thread.sleep(3000);
    studentInfoPage.studentInfoModule.click();

}

    @Then("the following modules display Student Details, Student Admission, Disabled Students, Bulk Delete, Student Categories, Student House, Disable Reason")
    public void the_following_modules_display_Student_Details_Student_Admission_Disabled_Students_Bulk_Delete_Student_Categories_Student_House_Disable_Reason() {
    boolean isDashboardDisplayed = studentInfoPage.studentInfoModule.isDisplayed();
    Assert.assertTrue(isDashboardDisplayed);
    CucumberLogUtils.logExtentScreenshot();
    CucumberLogUtils.logScreenShot();
}


}

