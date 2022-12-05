package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class StudentAdmissionsPage {

    /* Student Admissions Page Text */
    @FindBy(xpath = "//h4[contains(text(),'Student Admission')]")
    public WebElement studentAdmissionsPageDisplays;

    /* Select Criteria Text */
    @FindBy(xpath = "//h3[normalize-space()='Select Criteria']")
    public WebElement selectCriteriaPageDisplays;

    /* Search button on Student Details Page */
    @FindBy(xpath = "(//button[contains(text(), ' Search')])[2]")
    public WebElement searchButton;

    /* Bulk Delete Button */
    @FindBy(xpath = "//a[contains(text(), 'Bulk Delete')]")
    public WebElement bulkDeleteButton;

    /* Search button on Bulk Delete Page */
    @FindBy(xpath = "(//button[normalize-space()='Search'])[1]")
    public WebElement searchButtonBulkDeletePage;

    /* Checkbox on Student Details page */
    @FindBy(xpath = "//a[contains(text(), 'Aretha Franklin')]/../preceding-sibling::td/input[@type='checkbox']")
    public WebElement clickStudentCheckbox;

    /* Delete Button on Student Details Page */
    @FindBy(xpath = "(//button[normalize-space()='Delete'])[1]")
    public WebElement clickDeleteButton;

    /* Student Details Button */
    @FindBy(xpath = "(//a[contains(text(),'Student Details')])[2]")
    public WebElement studentDetailsButton;

    /* Search By Keyword textbox on Student Details Page */
    @FindBy(xpath = "//input[@class='form-control']")
    public WebElement searchByKeywordTextBox;

    /* Student Information Button */
    @FindBy(xpath = "//span[contains(text(),'Student Information')]")
    public WebElement studentInformationButton;

    /* Student Admission Button */
    @FindBy(xpath = "//a[contains(text(),'Student Admission')]")
    public WebElement studentAdmissionButton;

    /* Admission Number textbox on Student Admission page */
    @FindBy(xpath = "//input[@id='admission_no']")
    public WebElement admissionNumber;

    /* Roll Number textbox on Student Admission Page */
    @FindBy(xpath = "//input[@id='roll_no']")
    public WebElement rollNumber;

    /* First Name textbox on Student Admission Page */
    @FindBy(xpath = "//input[@id='firstname']")
    public WebElement enterFirstName;

    /* Last Name textbox on Student Admission Page */
    @FindBy(xpath = "//input[@id='lastname']")
    public WebElement enterLastName;

    /* Date of Birth textbox on Student Admission Page */
    @FindBy(xpath = "//input[@id='dob']")
    public WebElement enterDOB;

    /* Email Address textbox on Student Admission Page */
    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailAddress;

    /* Phone Number textbox on Student Admission Page */
    @FindBy(xpath = "(//input[@name='custom_fields[students][1]'])[1]")
    public WebElement phoneNumber;

    /* Enter Height textbox */
    @FindBy(xpath = "(//input[@name='custom_fields[students][2]'])[1]")
    public WebElement enterHeight;

    /* Enter Weight textbox on Student Admission Page */
    @FindBy(xpath = "(//input[@name='custom_fields[students][3]'])[1]")
    public WebElement enterWeight;

    /* Enter Father Name textbox on Student Admission Page */
    @FindBy(xpath = "//input[@name='father_name']")
    public WebElement enterFatherName;

    /* Enter Father number textbox on Student Admission Page */
    @FindBy(xpath = "//input[@name='father_phone']")
    public WebElement enterFatherNumber;

    /* Enter Father Job textbox on Student Admission Page */
    @FindBy(xpath = "//input[@name='father_occupation']")
    public WebElement enterFatherJob;

    /* Enter Mother Name textbox on Student Admission Page */
    @FindBy(xpath = "//input[@name='mother_name']")
    public WebElement enterMotherName;

    /* Enter Mother Occupation textbox on Student Admission Page */
    @FindBy(xpath = "//input[@name='mother_name']")
    public WebElement enterMotherJob;

    /* Select Gaurdian radio button on Student Admission Page */
    @FindBy(xpath = "(//input[@value='father'])[1]")
    public WebElement selectsGaurdian;

    /* Enter Gaurdian email textbox on Student Admission Page */
    @FindBy(xpath = "//input[@name='guardian_email']")
    public WebElement enterGaurdianEmail;

    /* Enter Gaurdian Adress textbox on Student Admission Page */
    @FindBy(xpath = "//textarea[@name='guardian_address']")
    public WebElement enterGaurdianAddress;

    /* Select Save Button on Student Admission Page */
    @FindBy(xpath = "(//button[@type='submit'][normalize-space()='Save'])[1]")
    public WebElement saveButton;

    public StudentAdmissionsPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

}
