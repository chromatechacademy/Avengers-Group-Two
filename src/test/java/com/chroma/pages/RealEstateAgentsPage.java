package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chroma.web.WebDriverUtils;


public class RealEstateAgentsPage {
    /* Add Now Button */
    @FindBy(xpath = "//button[normalize-space()='Add Now']")
    public WebElement addNow;

    /* First Name textbox */
    @FindBy(xpath = "//input[@name='fname']")
    public WebElement firstNameTextbox;

    /* Last Name textbox */
    @FindBy(xpath = "//input[@name='lname']")
    public WebElement lastNameTextbox;

    /* Email textbox */
    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailTextbox;

    /* Contact Number textbox */
    @FindBy(xpath = "//input[@name='phone']")
    public WebElement contactNumberTextbox;

    /* Password textbox */
    @FindBy(xpath = "//input[@name='pass']")
    public WebElement passwordTextbox;

    /* Retype Password textbox */
    @FindBy(xpath = "//input[@name='cpass']")
    public WebElement retypePasswordTextbox;

    /* Save Button */
    @FindBy(xpath = "//button[@id='addagentbutton']")
    public WebElement saveButton;

    /* Back Button */
    @FindBy(xpath = "//button[normalize-space()='Back']")
    public WebElement backButton;

    /* Active Button */
    @FindBy(xpath = "//a[normalize-space()='Active']")
    public WebElement activeButton;

    /* 3 Dot Button next to the student */
    @FindBy(xpath = "//td[normalize-space()='lol@league.com']/following-sibling::td[2]//div//button//span")
    public WebElement threeDotsButton;

    /* Delete Button */
    @FindBy(xpath = "//ul[@class='dropdown-menu show']//button[@class='dropdown-item'][normalize-space()='Delete']")
    public WebElement deleteButton;

    /* Inactive Button */
    @FindBy(xpath = "//a[normalize-space()='Inactive']")
    public WebElement inactiveButton;

    /* Delete Permanently Button */
    @FindBy(xpath = "//ul[@class='dropdown-menu show']//button[@class='dropdown-item'][normalize-space()='Delete Permanently']")
    public WebElement deletePermanentlyButton;

    /* OK Button */
    @FindBy(xpath = "//button[normalize-space()='OK']")
    public WebElement okButton;

    /* All Agents Button */
    @FindBy(xpath = "//a[normalize-space()='All Agents']")
    public WebElement allAgentsButton;

    public RealEstateAgentsPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
