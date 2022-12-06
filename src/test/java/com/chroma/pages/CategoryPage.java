package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chroma.web.WebDriverUtils;

public class CategoryPage {

    /* Category textbox */
    @FindBy(xpath = "//input[@name='category']")
    public WebElement categoryTextbox;

    /* Save button */
    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
    public WebElement saveButton;

    /* Delete button */
    @FindBy(xpath = "//body[1]/div[1]/div[1]/section[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[6]/td[3]/a[2]/i[1]")
    public WebElement studentAdmission;

    public CategoryPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
    
}
