package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class StudentInformationPage {
    //locarot for Student dropdown manu
    @FindBy(xpath = "//i[@class='fa fa-user-plus ftlayer']")
    public WebElement studentInfoDropDElement;
    //locator for student admition element
    @FindBy(xpath = "//a[normalize-space()='Student Admission']")
    public WebElement studentAdmissDropDElement;

    public StudentInformationPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
