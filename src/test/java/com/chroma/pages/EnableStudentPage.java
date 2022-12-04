package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class EnableStudentPage {
    /** Web element for selecting Disabled Student */
    @FindBy(xpath = "//a[normalize-space()='Disabled Students']")
    public WebElement disabledStudentTab;
    /** Web element for selecting Enabling button */
    @FindBy(xpath = "//body//div//div//section//div//div//div//ul//li//a[@href='#']//i")
    public WebElement enablingButton;

    public EnableStudentPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}