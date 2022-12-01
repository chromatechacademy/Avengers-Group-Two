package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chroma.web.WebDriverUtils;

public class StudentInfoPage {

    @FindBy(xpath = "//span[normalize-space()='Student Information']")
    public WebElement studentInfoModule;

    @FindBy(xpath = "//li[1]//ul[1]//li[1]//a[1]")
    public WebElement studentDetails;

    @FindBy(xpath = "//a[normalize-space()='Student Admission']")
    public WebElement studentAdmission;

    @FindBy(xpath = "//a[normalize-space()='Disabled Students']")
    public WebElement disabledStudents;

    @FindBy(xpath = "//a[normalize-space()='Bulk Delete']")
    public WebElement bulkDelete;

    @FindBy(xpath = "//a[normalize-space()='Student Categories']")
    public WebElement studentCategories;

    @FindBy(xpath = "//a[normalize-space()='Student House']")
    public WebElement studentHouses;

    @FindBy(xpath = "//a[normalize-space()='Disable Reason']")
    public WebElement disableReason;

    public StudentInfoPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
    
}
