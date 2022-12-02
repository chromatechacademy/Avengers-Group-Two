package com.chroma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chroma.web.WebDriverUtils;

public class StudentAdmissionsPage {

    /* Student Admissions Page Text */ 
    @FindBy(xpath = "//h4[contains(text(),'Student Admission')]")
    public WebElement studentAdmissionsPageDisplays;

    /* Dynamic xpath for module button  */
    public static WebElement dynamicModule(String moduleButton) {
        return WebDriverUtils.driver.findElement(By.xpath("//span[contains(text(),'" + moduleButton + "')]"));
    }

    /* Dynamic xpath for buttons under module */
    public static WebElement dynamicModuleList(String subModuleButton) {
        return WebDriverUtils.driver.findElement(By.xpath("//a[contains(text(),'" + subModuleButton + "')]"));
    }


    @FindBy(xpath = "//input[@id='admission_no']")
    public WebElement admissionNumber;

    @FindBy(xpath = "//input[@id='roll_no']")
    public WebElement rollNumber;
    
    // @FindBy(xpath = "//h4[contains(text(),'Student Admission')]")
    // public WebElement classSection;

    // @FindBy(xpath = "//h4[contains(text(),'Student Admission')]")
    // public WebElement sectionDropdown;

    @FindBy(xpath = "//input[@id='firstname']")
    public WebElement enterFirstName;

    @FindBy(xpath = "//input[@id='lastname']")
    public WebElement enterLastName;

    // @FindBy(xpath = "//h4[contains(text(),'Student Admission')]")
    // public WebElement selectGender;

    @FindBy(xpath = "//input[@id='dob']")
    public WebElement enterDOB;

    // @FindBy(xpath = "//h4[contains(text(),'Student Admission')]")
    // public WebElement selectCategory;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailAddress;

    // @FindBy(xpath = "//h4[contains(text(),'Student Admission')]")
    // public WebElement selectBlood;

    @FindBy(xpath = "(//input[@name='custom_fields[students][1]'])[1]")
    public WebElement phoneNumber;

    @FindBy(xpath = "(//input[@name='custom_fields[students][2]'])[1]")
    public WebElement enterHeight;

    @FindBy(xpath = "(//input[@name='custom_fields[students][3]'])[1]")
    public WebElement enterWeight;

    @FindBy(xpath = "//input[@name='father_name']")
    public WebElement enterFatherName;

    @FindBy(xpath = "//input[@name='father_phone']")
    public WebElement enterFatherNumber;

    @FindBy(xpath = "//input[@name='father_occupation']")
    public WebElement enterFatherJob;

    @FindBy(xpath = "//input[@name='mother_name']")
    public WebElement enterMotherName;

    @FindBy(xpath = "//input[@name='mother_name']")
    public WebElement enterMotherJob;

    @FindBy(xpath = "//input[@value='father']")
    public WebElement selectsGaurdian;

    @FindBy(xpath = "//input[@name='guardian_email']")
    public WebElement enterGaurdianEmail;

    @FindBy(xpath = "//textarea[@name='guardian_address']")
    public WebElement enterGaurdianAddress;

    @FindBy(xpath = "(//button[@type='submit'][normalize-space()='Save'])[1]")
    public WebElement saveButton;


    public StudentAdmissionsPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

}
