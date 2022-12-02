package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chroma.web.WebDriverUtils;

public class DashboardGraphPage{

    /*Locator for the Agents Graph radio button*/
    @FindBy(xpath = "//a[contains(text(),'Agents Graph')]")
    public WebElement agentGraphRadioBtn;

    /*Locator for the Reserve By Agent text*/
    @FindBy(xpath = "//a[contains(text(),'Reserved by Agents')]")
    public WebElement reserveByAgentsText;

    /*Locator for the Overview radio buttton*/
    @FindBy(xpath = "//a[contains(text(),'Overview')]")
    public WebElement overviewRadioBtn;

    /*Locator for header text display Overview "Properties Overview"*/
    @FindBy(xpath = "//a[contains(text(),'Properties Overview')]")
    public WebElement propertiesOverview;

    public DashboardGraphPage(){
        PageFactory.initElements(WebDriverUtils.driver, this);
    }



    



    
}
