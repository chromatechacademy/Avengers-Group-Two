package com.chroma.stepDefinitions;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.chroma.pages.HrModPage;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.WebDriverUtils;

import cucumber.api.java.en.Then;

public class HrModDef {

    @Then("User will click on Human Resource")
    public void user_will_click_on_Human_Resource() {
        WebDriverUtils.driver.findElement(By.xpath("//span[normalize-space()='Human Resource']")).click();

    }

     @Then("user will be able to see links displayed {string}, {string}, {string}, {string}, {string}, {string},{string},{string}")
    public void user_will_be_able_to_see_links_displayed(String staffDirectory, String staffAttendance, String payroll,
            String approveLeaveRequest,
            String leaveType, String teachersRating, String department, String designation) {

     boolean isStaffDirectoryDisplayed = HrModPage.dynamicModule1(staffDirectory).getText()
                .contentEquals(staffDirectory);
        Assert.assertTrue(isStaffDirectoryDisplayed);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();

        boolean isStaffAttendanceDisplayed = HrModPage.dynamicModule1(staffAttendance).getText()
                .contentEquals(staffAttendance);
        Assert.assertTrue(isStaffAttendanceDisplayed);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();

        boolean isPayrollDisplayed = HrModPage.dynamicModule2(payroll).getText()
                .contentEquals(payroll);
        Assert.assertTrue(isPayrollDisplayed);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();

        boolean isApproveLeaveRequestDisplayed = HrModPage.dynamicModule2(approveLeaveRequest).getText()
                .contentEquals(approveLeaveRequest);
        Assert.assertTrue(isApproveLeaveRequestDisplayed);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();

        boolean isLeaveTypeDisplayed = HrModPage.dynamicModule2(leaveType).getText()
                .contentEquals(leaveType);
        Assert.assertTrue(isLeaveTypeDisplayed);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();

        boolean isTeachersRatingDisplayed = HrModPage.dynamicModule2(teachersRating).getText()
                .contentEquals(teachersRating);
        Assert.assertTrue(isTeachersRatingDisplayed);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();

        boolean isDepartmentDisplayed = HrModPage.dynamicModule2(department).getText()
                .contentEquals(department);
        Assert.assertTrue(isDepartmentDisplayed);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();

        boolean isDesignationDisplayed = HrModPage.dynamicModule2(designation).getText()
                .contentEquals(designation);
        Assert.assertTrue(isDesignationDisplayed);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();

    }

}
