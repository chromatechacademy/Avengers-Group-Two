package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chroma.web.WebDriverUtils;

public class AddDeleteSectionsPage {

    /* Academics module button */
    @FindBy(xpath = "(//span[normalize-space()='Academics'])[1]")
    public WebElement academicsButton;

    /* Sections button under Academics module */
    @FindBy(xpath = "(//a[normalize-space()='Sections'])[1]")
    public WebElement sectionsButton;

    /* Textbox field in Add Section page */
    @FindBy(xpath = "//input[@name='section']")
    public WebElement sectionTextbox;

    /* Save button in Add Section page */
    @FindBy(xpath = "(//button[contains(text(), 'Save')])[1]")
    public WebElement saveButton;

    /* Delete button on Section List */
    @FindBy(xpath = "//td[contains(text(),'Bag of Money')]//following-sibling::td//following-sibling::a//following-sibling::a")
    public WebElement deleteButton;

    /* Delete button on Class List */
    @FindBy(xpath = "//tr[@role='row']/child::td[contains(text(), ' Automation Is Extremely Captivating')]/following-sibling::td[2]/child::a[2]")
    public WebElement deleteClassButton;

    /* Class button under Acadamics module */
    @FindBy(xpath = "(//a[normalize-space()='Class'])[1]")
    public WebElement classButton;

    /* Textbox field to enter class name */
    @FindBy(xpath = "(//input[@name='class'])[1]")
    public WebElement classTextbox;

    /* Save button in Add Class page */
    @FindBy(xpath = "(//button[@type='submit'][normalize-space()='Save'])[1]")
    public WebElement saveButtonClassPage;

    /* Checkbox button to select section on Add Class page */
    @FindBy(xpath = "(//label[normalize-space()='Ruth section'])[1]")
    public WebElement selectSectionCheck;

    public AddDeleteSectionsPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

}
