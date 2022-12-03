package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chroma.web.WebDriverUtils;

public class AgentModulePage{

/*Locator for Agents page*/
@FindBy(xpath = "(//li)[1]")
public WebElement agentsModuleText;

/*Locator for Agents dsiplay*/
@FindBy(xpath = "(//html)[1]")
public WebElement agentsdisplay;

public AgentModulePage(){
    PageFactory.initElements(WebDriverUtils.driver, this); 
}
}
