package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chroma.web.WebDriverUtils;

public class StudentDetailsPage {

    /* Search Button */
    @FindBy(xpath = "//button[@value='search_filter']")
    public WebElement searchButton;

    /* Edit Button */
    @FindBy(xpath = "//td[contains(text(),'022407')]/following-sibling::td[10]/a[2]")
    public WebElement editButton;

    /* Kobe Bryant button */
    @FindBy(xpath = "//tr[@role='row']//a[contains(text(),'Kobe Bryant')]")
    public WebElement kobeBryantButton;

    /* Successful change message */
    @FindBy(xpath = "//div[@student='alert alert-success text-left']")
    public WebElement successfulChange;

    public StudentDetailsPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
