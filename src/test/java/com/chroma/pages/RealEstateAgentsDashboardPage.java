package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chroma.web.WebDriverUtils;

public class RealEstateAgentsDashboardPage {
    /* Navigating to Agents page */
    @FindBy(xpath = "//span[normalize-space()='Agents']")
    public WebElement agents;

    public RealEstateAgentsDashboardPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
