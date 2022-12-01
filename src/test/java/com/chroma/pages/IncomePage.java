package com.chroma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chroma.web.WebDriverUtils;

public class IncomePage {

    /* "$ Income" dropdown button */
    @FindBy(xpath = "//span[normalize-space()='Income']")
    public WebElement dropDownButton;

    /* "Add Income" option */
    @FindBy(xpath = "//body[1]/div[1]/aside[1]/div[1]/section[1]/ul[2]/li[3]/ul[1]/li[1]/a[1]")
    public WebElement optionAddIncome ;

    /* "Search Income option" */
    @FindBy(xpath = "//a[normalize-space()='Search Income']")
    public WebElement optionSearchIncome ;

    /* "Income Head" option */
    @FindBy(xpath = "//a[normalize-space()='Income Head']")
    public WebElement optionIncomeHead;

    

    public IncomePage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}



 