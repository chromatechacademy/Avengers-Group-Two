package com.chroma.stepDefinitions;

import org.openqa.selenium.By;
import org.testng.Assert;
import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.WebDriverUtils;
import cucumber.api.java.en.Then;

public class HrModDef extends PageInitializer {

        @Then("User will click on Human Resource")
        public void user_will_click_on_Human_Resource() {
                WebDriverUtils.driver.findElement(By.xpath("//span[normalize-space()='Human Resource']")).click();
        }

        @Then("user will be able to see links displayed {string}, {string}, {string}, {string}, {string}, {string},{string},{string}")
        public void user_will_be_able_to_see_links_displayed(String staffDirectory, String staffAttendance,
                        String payroll,
                        String approveLeaveRequest,
                        String leaveType, String teachersRating, String department, String designation) {

                boolean isStaffDirectoryDisplayed = hrModPage.staffDirectoryTab.getText()
                                .contentEquals(staffDirectory);
                Assert.assertTrue(isStaffDirectoryDisplayed);
                CucumberLogUtils.logExtentScreenshot();
                CucumberLogUtils.logScreenShot();

                boolean isStaffAttendanceDisplayed = hrModPage.staffAttendanceTab.getText()
                                .contentEquals(staffAttendance);
                Assert.assertTrue(isStaffAttendanceDisplayed);
                CucumberLogUtils.logExtentScreenshot();
                CucumberLogUtils.logScreenShot();

                boolean isPayrollDisplayed = hrModPage.payrollTab.getText()
                                .contentEquals(payroll);
                Assert.assertTrue(isPayrollDisplayed);
                CucumberLogUtils.logExtentScreenshot();
                CucumberLogUtils.logScreenShot();

                boolean isApproveLeaveRequestDisplayed = hrModPage.approveLeaveRequestTab.getText()
                                .contentEquals(approveLeaveRequest);
                Assert.assertTrue(isApproveLeaveRequestDisplayed);
                CucumberLogUtils.logExtentScreenshot();
                CucumberLogUtils.logScreenShot();

                boolean isApplyLeaveDisplayed = hrModPage.applyLeaveTab.getText()
                                .contentEquals(leaveType);
                Assert.assertTrue(isApplyLeaveDisplayed);
                CucumberLogUtils.logExtentScreenshot();
                CucumberLogUtils.logScreenShot();

                boolean isTeacherRatingDisplayed = hrModPage.teacherRatingTab.getText().contentEquals(teachersRating);
                Assert.assertTrue(isTeacherRatingDisplayed);
                CucumberLogUtils.logExtentScreenshot();
                CucumberLogUtils.logScreenShot();

                boolean isDepartmentDisplayed = hrModPage.departmentTab.getText()
                                .contentEquals(department);
                Assert.assertTrue(isDepartmentDisplayed);
                CucumberLogUtils.logExtentScreenshot();
                CucumberLogUtils.logScreenShot();

                boolean isDesignationDisplayed = hrModPage.designationTab.getText().contentEquals(designation);
                Assert.assertTrue(isDesignationDisplayed);
                CucumberLogUtils.logExtentScreenshot();
                CucumberLogUtils.logScreenShot();
                

        }
}
