package com.chroma.stepsImplementation;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.WebDriverUtils;

public class EditStudentStepsImpl extends PageInitializer{
    /**
     * Use this method to check if the edit student feature worked
     * 
     */

    public static void editStudentCheck() {
        boolean didEditStudentWork = editStudentPage.correctEmail.isDisplayed();
        Assert.assertTrue(didEditStudentWork);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Use this method to click on and view the details of the student "Kobe Bryant"
     * 
     */

    public static void clickOnKobeBryant(){
        Select classDropdown = new Select(WebDriverUtils.driver.findElement(By.xpath("//select[@name='class_id']")));
        classDropdown.selectByVisibleText("SDET");
        studentDetailsPage.searchButton.click();
        studentDetailsPage.kobeBryantButton.click();
    }
}
