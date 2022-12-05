package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chroma.web.WebDriverUtils;

public class StudentAdmissionPage {
    @FindBy(xpath = "//input[@id='admission_no']")
    public WebElement admissionNo;
    @FindBy(xpath = "//input[@id='roll_no']")
    public WebElement rollNo;
    @FindBy(xpath = "//input[@id='firstname']")
    public WebElement firstName;
    







    public StudentAdmissionPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
    
}
