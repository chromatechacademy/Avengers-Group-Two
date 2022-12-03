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

    @FindBy(xpath = "//h3[normalize-space()='Select Criteria']")
    public WebElement selectCriteriaPageDisplays;

    @FindBy(xpath = "(//button[contains(text(), ' Search')])[2]")
    public WebElement searchButton;

    @FindBy(xpath = "//a[contains(text(), 'Bulk Delete')]")
    public WebElement bulkDeleteButton;

    @FindBy(xpath = "(//button[normalize-space()='Search'])[1]")
    public WebElement searchButtonBulkDeletePage;

    @FindBy(xpath = "//a[contains(text(), 'Aretha Franklin')]/../preceding-sibling::td/input[@type='checkbox']")
    public WebElement clickStudentCheckbox;

    @FindBy(xpath = "(//button[normalize-space()='Delete'])[1]")
    public WebElement clickDeleteButton;

    @FindBy(xpath = "(//a[contains(text(),'Student Details')])[2]")
    public WebElement studentDetailsButton;

    @FindBy(xpath = "//input[@class='form-control']")
    public WebElement searchByKeywordTextBox;

    /* Student Information Button */
    @FindBy(xpath = "//span[contains(text(),'Student Information')]")
    public WebElement studentInformationButton;

    // /* Dynamic xpath for module button */
    // public static WebElement dynamicModule(String moduleButton) {
    //     return WebDriverUtils.driver.findElement(By.xpath("//span[contains(text(),'Student Information')]"));
    // }

    @FindBy(xpath = "//a[contains(text(),'Student Admission')]")
    public WebElement studentAdmissionButton;
    
    // /* Dynamic xpath for buttons under module */
    // public static WebElement dynamicModuleList(String subModuleButton) {
        
    //     return WebDriverUtils.driver.findElement(By.xpath("//a[contains(text(),'" + subModuleButton + "')]"));
    // }

    @FindBy(xpath = "//input[@id='admission_no']")
    public WebElement admissionNumber;

    @FindBy(xpath = "//input[@id='roll_no']")
    public WebElement rollNumber;

    @FindBy(xpath = "//input[@id='firstname']")
    public WebElement enterFirstName;

    @FindBy(xpath = "//input[@id='lastname']")
    public WebElement enterLastName;

    @FindBy(xpath = "//input[@id='dob']")
    public WebElement enterDOB;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailAddress;

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

    @FindBy(xpath = "(//input[@value='father'])[1]")
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
