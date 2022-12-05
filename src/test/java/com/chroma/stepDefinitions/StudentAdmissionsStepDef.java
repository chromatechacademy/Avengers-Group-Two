package com.chroma.stepDefinitions;

import org.testng.Assert;
import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.StudentAdmissionsStepImpl;
import com.chroma.utils.CucumberLogUtils;
import cucumber.api.java.en.Then;

public class StudentAdmissionsStepDef extends PageInitializer {

    @Then("user clicks {string}")
    public void user_clicks(String studentInformation) {
        studentAdmissionsPage.studentInformationButton.click();
    }

    @Then("clicks {string}")
    public void clicks(String studentAdmission) {
        studentAdmissionsPage.studentAdmissionButton.click();
    }

    @Then("Student Admission page displays")
    public void student_Admission_page_displays() {
        boolean isStudentAdmissionPageDisplayed = studentAdmissionsPage.studentAdmissionsPageDisplays.isDisplayed();
        Assert.assertTrue(isStudentAdmissionPageDisplayed);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @Then("user enters student credentials {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void user_enters_student_credentials(String admissionNo, String rollNum, String classSelection,
            String sectionSelection, String firstName, String lastName, String genderSelection, String dateOfBirth,
            String categorySelection, String email, String bloodGroupSelection,
            String mobileNum, String height, String weight, String fatherName, String fatherPhone,
            String fatherOccupation, String motherName, String motherOccupation,
            String gaurdian, String gaurdianEmail, String guardianAddress) {

        StudentAdmissionsStepImpl.studentAdmissionsCredentials(admissionNo, rollNum, classSelection, sectionSelection,
                firstName, lastName, genderSelection, dateOfBirth, categorySelection, email, bloodGroupSelection,
                mobileNum, height, weight, fatherName, fatherPhone, fatherOccupation, motherName, motherOccupation,
                gaurdian, gaurdianEmail, guardianAddress);
    }

    @Then("clicks on {string}")
    public void clicks_on(String studentDetails) {
        studentAdmissionsPage.studentDetailsButton.click();
    }

    @Then("user selects {string}, selects {string}, enters {string}")
    public void user_selects_selects_enters(String classSelection, String sectionSelection, String firstName) {
        StudentAdmissionsStepImpl.studentDetailsPage(classSelection, sectionSelection, firstName);
        studentAdmissionsPage.searchButton.click();
    }

    @Then("Select Criteria page displays and student is viewed")
    public void select_Criteria_page_displays_and_student_is_viewed() {
        boolean isSelectCriteriaPageDisplayed = studentAdmissionsPage.selectCriteriaPageDisplays.isDisplayed();
        Assert.assertTrue(isSelectCriteriaPageDisplayed);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @Then("navigates to {string}")
    public void navigates_to(String string) {
        studentAdmissionsPage.bulkDeleteButton.click();
    }

    @Then("user selects {string}, selects {string}")
    public void user_selects_selects(String classSelection, String sectionSelection) {
        StudentAdmissionsStepImpl.bulkDeletePage(classSelection, sectionSelection);
        studentAdmissionsPage.searchButtonBulkDeletePage.click();
    }

    @Then("user can delete student")
    public void user_can_delete_student() throws InterruptedException {
        studentAdmissionsPage.clickStudentCheckbox.click();
        studentAdmissionsPage.clickDeleteButton.click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

}
