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



   







    public StudentAdmissionPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
    
}
