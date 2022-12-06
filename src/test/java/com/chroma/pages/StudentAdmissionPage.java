package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chroma.web.WebDriverUtils;

public class StudentAdmissionPage {
    @FindBy(xpath = "//input[@id='admission_no']")
    public WebElement admissionNoBox;
    @FindBy(xpath = "//input[@id='roll_no']")
    public WebElement rollNoBox;
    @FindBy(xpath = "//input[@id='firstname']")
    public WebElement firstNameBox;
    @FindBy(xpath = "//input[@id='lastname']")
    public WebElement lastNameBox;
    @FindBy(xpath = "//input[@id='dob']")
    public WebElement dateOfBirthDropDown;
    @FindBy(xpath = "(//input[@id='file'])[1]")
    public WebElement studentPhotoElement;
    @FindBy(xpath = "//input[@id='email']")
    public WebElement studentEmailBox;
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
    
   
    

    
   



   







    public StudentAdmissionPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
    
}
