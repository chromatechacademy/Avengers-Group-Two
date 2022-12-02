package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AgentModulePage{

/*Locator for Agents page*/
@FindBy(xpath = "//span[normalize-space()='Agents']")
public WebElement agentsModuleText;

/*Locator for Agents dsiplay*/
@FindBy(xpath = "//h5[normalize-space()='Properties Overview']")
public WebElement agentsdisplay;


}
