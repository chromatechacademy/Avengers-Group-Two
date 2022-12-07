package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class StudentAdmissionPage {
    // locators for admission boxes
    @FindBy(xpath = "//input[@id='admission_no']")
    public WebElement admissionNoBox;
    @FindBy(xpath = "//input[@id='roll_no']")
    public WebElement rollNoBox;
    @FindBy(xpath = "//input[@id='firstname']")
    public WebElement firstNameBox;
    @FindBy(xpath = "//input[@id='lastname']")
    public WebElement lastNameBox;
    @FindBy(xpath = "//input[@id='custom_fields[students][1]']")
    public WebElement studentMobileNumberBox;
    @FindBy(xpath = "//input[@id='custom_fields[students][2]']")
    public WebElement studentHeightBox;
    @FindBy(xpath = "//input[@id='custom_fields[students][3]']")
    public WebElement studentWeightBox;
    @FindBy(xpath = "//input[@value='father']")
    public WebElement studentGardianIsFather;
    @FindBy(xpath = "//input[@id='guardian_name']")
    public WebElement studentGardianNameBox;
    @FindBy(xpath = "//input[@id='guardian_phone']")
    public WebElement studentGardianPhoneNoBox;
    @FindBy(xpath = "//input[@id='email']")
    public WebElement studentEmailBox;
    //// locator for dropdowns
    @FindBy(xpath = "//input[@id='dob']")
    public WebElement dateOfBirthDropDown;
    @FindBy(xpath = "//select[@id='class_id']")
    public WebElement studentClassDropDown;
    @FindBy(xpath = "(//*[contains(text(),'SDET')])[1]")
    public WebElement classSDET_DropDown;
    @FindBy(xpath = "//select[@id='section_id']")
    public WebElement classSelectioElement;
    @FindBy(xpath = "//*[contains(text(),'Git/GitHub')]")
    public WebElement selectGitDropDown;
    @FindBy(xpath = "//select[@name='gender']")
    public WebElement genderDropDown;
    @FindBy(xpath = "//*[contains(text(),'Male')]")
    public WebElement genderMaleDropDown;
    @FindBy(xpath = "//select[@id='category_id']")
    public WebElement studentCategoryDropD;
    @FindBy(xpath = "//option[@value='54']")
    public WebElement studentCategoryMoeDDown;
    @FindBy(xpath = "//select[@name='blood_group']")
    public WebElement studentBloodGDropDown;
    // locator for photo dragAndDrop
    @FindBy(xpath = "(//input[@id='file'])[1]")
    public WebElement studentPhotoElement;
    // locator for submit btn
    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
    public WebElement save_Btn;
    // locator for Save student info btn
    @FindBy(xpath = "//div[@class='alert alert-success']")
    public WebElement recordSavedText;

    public StudentAdmissionPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

}
