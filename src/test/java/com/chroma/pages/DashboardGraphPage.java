package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chroma.web.WebDriverUtils;

public class DashboardGraphPage{

    /*Locator for the Overview radio buttton*/
    @FindBy(xpath = "//a[contains(text(),'Overview')]")
    public WebElement overviewRadioBtn;

    /*Locator for header text display Overview "Properties Overview"*/
    @FindBy(xpath = "//h5[normalize-space()='Properties Overview']")
    public WebElement propertiesOverview;

    /*Locator for the Agents Graph radio button*/
    @FindBy(xpath = "//a[contains(text(),'Agents Graph')]")
    public WebElement agentGraphRadioBtn;

    /*Locator for the Reserve By Agent text*/
    @FindBy(xpath = "//h5[contains(text(),'Reserved by Agents')]")
    public WebElement reserveByAgentsText;

    public DashboardGraphPage(){

        PageFactory.initElements(WebDriverUtils.driver, this); 
    }



    



    
}
