package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chroma.web.WebDriverUtils;

public class EditStudentPage {
    /* Email textbox */
    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailTextbox;

    /* The Intended Admission Date */
    @FindBy(xpath = "//td[contains(text(), 'GOAT@Lakers.com')]")
    public WebElement correctEmail;

    /* Save button */
    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
    public WebElement saveButton;

    /* Email displayed in Kobe Bryant's student profile */
    @FindBy(xpath = "(//td)[8]")
    public WebElement emailDisplayed;
    
    public EditStudentPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
