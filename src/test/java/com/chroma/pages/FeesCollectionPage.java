package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.chroma.appsCommon.PageInitializer;

public class FeesCollectionPage extends PageInitializer {
    
    /* Locator for Fees Collection Module */
    @FindBy(xpath = "//span[normalize-space()='Fees Collection']")
    public WebElement feesCollectionModule;

    /* Locator for Collect Fees */
    @FindBy(xpath = "//body[1]/div[1]/aside[1]/div[1]/section[1]/ul[2]/li[2]/ul[1]/li[1]/a[1]")
    public WebElement collectFees;

    /* Locator for Search Fees Payment */
    @FindBy(xpath = "//a[normalize-space()='Search Fees Payment']")
    public WebElement searchFeesPayment;

    /* Locator for Search Due Fees */
    @FindBy(xpath = "//a[normalize-space()='Search Due Fees']")
    public WebElement searchDueFees;

    /* Locator for Fees Master */
    @FindBy(xpath = "//a[normalize-space()='Fees Master']")
    public WebElement feesMaster;

    /* Locator for Fees Group */
    @FindBy(xpath = "//a[normalize-space()='Fees Group']")
    public WebElement feesGroup;

    /* Locator for Fees Type */
    @FindBy(xpath = "//a[normalize-space()='Fees Type']")
    public WebElement feesType;

    /* Locator for Fees Discount */
    @FindBy(xpath = "//a[normalize-space()='Fees Discount']")
    public WebElement feesDiscount;

    /* Locator for Fees Carry Forward */
    @FindBy(xpath = "//a[normalize-space()='Fees Carry Forward']")
    public WebElement feesCarryForward;

    /* Locator for Fees Reminder */
    @FindBy(xpath = "//a[normalize-space()='Fees Reminder']")
    public WebElement feesReminder;

}
