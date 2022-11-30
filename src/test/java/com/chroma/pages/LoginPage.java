package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chroma.web.WebDriverUtils;

public class LoginPage {

    @FindBy(xpath = "//input[@placeholder='Username']")
    public WebElement userNameTextBox;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//button[normalize-space()='Sign In']")
    public WebElement signInButton;

    @FindBy(xpath = "//span[contains(text(),'Chroma Tech Academy')]")
    public WebElement homePageText;

    public LoginPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

}
