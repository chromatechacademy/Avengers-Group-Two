package com.chroma.stepDefinitions;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.StudentAdmissionsPage;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.WebDriverUtils;

import cucumber.api.java.en.Then;

public class StudentAdmissionsStepDef extends PageInitializer {

    @Then("user clicks {string}")
    public void user_clicks(String studentInformation) {
        StudentAdmissionsPage.dynamicModule(studentInformation).click();
    }

    @Then("clicks {string}")
    public void clicks(String studentAdmission) {
        StudentAdmissionsPage.dynamicModuleList(studentAdmission).click();
    }

    @Then("Student Admission page displays")
    public void student_Admission_page_displays() {
        boolean isStudentAdmissionPageDisplayed = studentAdmissionsPage.studentAdmissionsPageDisplays.isDisplayed();
        Assert.assertTrue(isStudentAdmissionPageDisplayed);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();

    }

    @Then("user enters student's credentials {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string},{string},{string}, {string}, {string},{string}, {string}, {string}, {string}, {string}")
    public void user_enters_student_s_credentials(
            String admissionNo, String rollNum, String classSelection, String sectionSelection, String firstName,
            String lastName,
            String genderSelection, String dateOfBirth, String categorySelection, String email,
            String bloodGroupSelection, String mobileNum,
            String height, String weight, String fatherName, String fatherPhone, String fatherOccupation,
            String motherName,
            String motherOccupation, String gaurdian, String gaurdianEmail, String guardianAddress) {

        studentAdmissionsPage.admissionNumber.sendKeys("20172021");
        studentAdmissionsPage.rollNumber.sendKeys("1");
        studentAdmissionsPage.enterFirstName.sendKeys("Shine");
        studentAdmissionsPage.enterLastName.sendKeys("Bright");
        studentAdmissionsPage.enterDOB.sendKeys("08/22/1989");
        studentAdmissionsPage.emailAddress.sendKeys("studentchroma@gmail.com");
        studentAdmissionsPage.phoneNumber.sendKeys("1234567890");
        studentAdmissionsPage.enterHeight.sendKeys("5'5");
        studentAdmissionsPage.enterWeight.sendKeys("120");
        studentAdmissionsPage.enterFatherName.sendKeys("Abraham");
        studentAdmissionsPage.enterFatherNumber.sendKeys("1234567890");
        studentAdmissionsPage.enterFatherJob.sendKeys("President");
        studentAdmissionsPage.enterMotherName.sendKeys("Aretha");
        studentAdmissionsPage.enterMotherJob.sendKeys("Singer");
        studentAdmissionsPage.enterGaurdianEmail.sendKeys("studentchroma@gmail.com");
        studentAdmissionsPage.enterGaurdianAddress.sendKeys("CandyLane drive");
        
        studentAdmissionsPage.saveButton.click();
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();

    }

}
