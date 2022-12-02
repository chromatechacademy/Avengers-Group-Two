package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class LoginPage {

    /* Username text box */
    @FindBy(xpath = "//input[@placeholder='Username']")
    public WebElement userNameTextBox;

    /* Password text box */
    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement passwordTextBox;

    /* Sign in button */
    @FindBy(xpath = "//button[normalize-space()='Sign In']")
    public WebElement signInButton;

    /* Chroma Tech Academy text on dashboard page */
    @FindBy(xpath = "//span[contains(text(),'Chroma Tech Academy')]")
    public WebElement dashboardPageText;

    public LoginPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

}
