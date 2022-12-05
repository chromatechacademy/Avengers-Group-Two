package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chroma.web.WebDriverUtils;

public class DashboardStudentInformationPage {
    /* Button for Student Information on dashboard page */
    @FindBy(xpath = "//span[normalize-space()='Student Information']")
    public WebElement studentInformationButton;

    /* Button for Student Details on dashboard page */
    @FindBy(xpath = "//ul[@class='treeview-menu menu-open']//a[normalize-space()='Student Details']")
    public WebElement studentDetailsButton;

    public DashboardStudentInformationPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
