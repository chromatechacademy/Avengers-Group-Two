package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class HrModPage {

    /** Web element for Staff Directory */
    @FindBy(xpath = "//li[6]//ul[1]//li[1]//a[1]")
    public WebElement staffDirectoryTab;

    /** Web element for Staff Attendance */
    @FindBy(xpath = "//li[6]//ul[1]//li[2]//a[1]")
    public WebElement staffAttendanceTab;

    /** Web element for Payroll */
    @FindBy(xpath = "//a[normalize-space()='Payroll']")
    public WebElement payrollTab;

    /** Wem element for Approve Leave Request */
    @FindBy(xpath = "//a[normalize-space()='Approve Leave Request']")
    public WebElement approveLeaveRequestTab;

    /** Web element for Apply Leave */
    @FindBy(xpath = "//a[normalize-space()='Apply Leave']")
    public WebElement applyLeaveTab;

    /** Web element for Leave Type */
    @FindBy(xpath = "//a[normalize-space()='Leave Type']")
    public WebElement leaveTypeTab;

    /** Web elment for Teacher Rating */
    @FindBy(xpath = "//a[normalize-space()='Teachers Rating']")
    public WebElement teacherRatingTab;

    /** Web element for Depatment */
    @FindBy(xpath = "//a[normalize-space()='Department']")
    public WebElement departmentTab;

    // * Web element for Designation */
    @FindBy(xpath = "//a[normalize-space()='Designation']")
    public WebElement designationTab;

    public HrModPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}