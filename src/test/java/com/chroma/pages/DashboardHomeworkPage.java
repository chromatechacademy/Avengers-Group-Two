package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chroma.web.WebDriverUtils;

public class DashboardHomeworkPage {
    /* Button for Homework on dashboard page */
    @FindBy(xpath = "//span[normalize-space()='Homework']")
    public WebElement homeworkButton;

    /* Add Homework text on dashboard page */
    @FindBy(xpath = "//*[text() = ' Add Homework']")
    public WebElement addHomeworkText;
    
    public DashboardHomeworkPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
