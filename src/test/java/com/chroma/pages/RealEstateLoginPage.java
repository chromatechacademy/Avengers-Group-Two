package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chroma.web.WebDriverUtils;

public class RealEstateLoginPage {
    /* Username/Email text box */
    @FindBy(xpath = "//input[@placeholder='Email']")
    public WebElement realEstateUsernameTextBox;

    /* Password text box */
    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement realEstatePasswordTextBox;

    /* Login button */
    @FindBy(xpath = "//button[normalize-space()='Login']")
    public WebElement realEstateLoginButton;

    /* Properties Overview text on dashboard page */
    @FindBy(xpath = "//h5[normalize-space()='Properties Overview']")
    public WebElement realEstateDashboardPageText;

    public RealEstateLoginPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
