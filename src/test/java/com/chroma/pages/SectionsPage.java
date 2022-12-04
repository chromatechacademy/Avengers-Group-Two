package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.chroma.appsCommon.PageInitializer;

public class SectionsPage extends PageInitializer{

    /*Locator for Cyber Security Class */
    @FindBy(xpath = "//td[normalize-space()='Cyber Security']")
    public WebElement cyberSecurity;

    /*Locator for SDET Class */
    @FindBy(xpath = "//td[normalize-space()='SDET']")
    public WebElement sDET;

    /*Locator for Sections Penetration Testing/Ethical Hacking */
    @FindBy(xpath = "//td[normalize-space()='Cyber Security']/following-sibling::td[1]//div[1]")
    public WebElement penetrationTesting;

    /*Locator for Database Testing */
    @FindBy(xpath = "//td[normalize-space()='SDET']/following-sibling::td[1]//div[1]")
    public WebElement databaseTesting;

    /*Locator for Networking Fundamentals */
    @FindBy(xpath = "//td[normalize-space()='Cyber Security']/following-sibling::td[1]//div[2]")
    public WebElement networkingFundamentals;

    /*Locator for Linux Fundamentals */
    @FindBy(xpath = "//td[normalize-space()='Cyber Security']/following-sibling::td[1]//div[3]")
    public WebElement linuxFundamentals;

    /*Locator for CIA Triad */
    @FindBy(xpath = "//td[normalize-space()='Cyber Security']/following-sibling::td[1]//div[4]")
    public WebElement ciaTriad;

    /*Locator for Testing Fundamentals */
    @FindBy(xpath = "//td[normalize-space()='SDET']/following-sibling::td[1]//div[1]")
    public WebElement testingFundamentals;

    /*Locator for SDLC Methodologies */
    @FindBy(xpath = "//td[normalize-space()='SDET']/following-sibling::td[1]//div[3]")
    public WebElement sdlcMethodologies;

    /*Locator for Selenium Test Automation */
    @FindBy(xpath = "//td[normalize-space()='SDET']/following-sibling::td[1]//div[4]")
    public WebElement seleniumTestAutomation;

    /*Locator for Cucumber Fundamentals */
    @FindBy(xpath = "//td[normalize-space()='SDET']/following-sibling::td[1]//div[5]")
    public WebElement cucumberFundamentals;

    /*Locator for API Testing */
    @FindBy(xpath = "//td[normalize-space()='SDET']/following-sibling::td[1]//div[6]")
    public WebElement apiTesting;

    /*Locator for Git/Github */
    @FindBy(xpath = "//td[normalize-space()='SDET']/following-sibling::td[1]//div[7]")
    public WebElement gitHub;

    /*Locator for Java 11 for cool people */
    @FindBy(xpath = "//td[normalize-space()='SDET']/following-sibling::td[1]//div[8]")
    public WebElement javaForCoolPeople;

    /*Locator for Mobile Test Automation */
    @FindBy(xpath = "//td[normalize-space()='SDET']/following-sibling::td[1]//div[9]")
    public WebElement mobileTestAutomation;

    /*Locator for Accessibility Testing */
    @FindBy(xpath = "//td[normalize-space()='SDET']/following-sibling::td[1]//div[10]")
    public WebElement accessibilityTesting;

}
