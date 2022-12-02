package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.WebDriverUtils;

public class DashboardPageAcademics extends PageInitializer{

    /*Locator for Academics Module Button */
    @FindBy(xpath = "//*[@id='sibe-box']/ul[2]/li[5]")
    public WebElement academicsModuleButton;

    /*Locator for Class Timetable Button */
    @FindBy(xpath = "(//*[contains(text(),'Class Timetable')])[2]")
    public WebElement classTimetableButton;

    /*Locator for Teachers Timetable Button */
    @FindBy(xpath = "//a[normalize-space()='Teachers Timetable']")
    public WebElement teachersTimetableButton;

    /*Locator for Assign Class Teacher Button */
    @FindBy(xpath = "//a[normalize-space()='Assign Class Teacher']")
    public WebElement assignClassTeacherButton;

    /*Locator for Promote Students Button */
    @FindBy(xpath = "//a[normalize-space()='Promote Students']")
    public WebElement promoteStudentsButton;

    /*Locator for Subject Group Button */
    @FindBy(xpath = "//a[normalize-space()='Subject Group']")
    public WebElement subjectGroupButton;

    /*Locator for Subjects Button */
    @FindBy(xpath = "//a[normalize-space()='Subjects']")
    public WebElement subjectsButton;

    /*Locator for Class Button */
    @FindBy(xpath = "//a[normalize-space()='Class']")
    public WebElement classButton;

    /*Locator for Sections Button */
    @FindBy(xpath = "//a[normalize-space()='Sections']")
    public WebElement sectionsButton;

    public DashboardPageAcademics(){
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
    
}
