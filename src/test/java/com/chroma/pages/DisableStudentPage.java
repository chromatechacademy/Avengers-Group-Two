package com.chroma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;

public class DisableStudentPage {

    /** Web element for selecting student information */
    @FindBy(xpath = "//span[normalize-space()='Student Information']")
    public WebElement selectStudentInformation;
    /** Web element for selecting student Details */
    @FindBy(xpath = "//li[1]//ul[1]//li[1]//a[1]")
    public WebElement selectStudentDetailTab;
    /** Web element for selecting search button */
    @FindBy(xpath = "//button[@value='search_filter']")
    public WebElement searchButton;
    /** Web element for selecting jon doe */
    @FindBy(xpath = "//tr[@role='row']//a[contains(text(),'Jon Doe')]")
    public WebElement jonDoeName;
    /** Web element for selecting disable button */
    @FindBy(xpath = "//div//div//div//li[6]//a[1]//i[1]")
    public WebElement disableButton;
    /** Web element for selecting save button */
    @FindBy(xpath = "(//button[contains(text(),'Save')])[3]")
    public WebElement saveButton;

    /** Method to select SDET in class drop down */
    public static void studentDetailsPage(String classSelection) {
        CommonUtils.selectDropDownValue(classSelection,
                WebDriverUtils.driver.findElement(By.xpath("//select[@name='class_id']")));
    }

    /** Method to select Very Loud in Reasn drop down */
    public static void reasonPage(String reasonSelection) {
        CommonUtils.selectDropDownValue(reasonSelection,
                WebDriverUtils.driver.findElement(By.xpath("//select[@name='reason']")));

    }

    public DisableStudentPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}