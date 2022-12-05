package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;

import cucumber.api.java.en.Then;

public class EnablingStudentFileDef extends PageInitializer {

    @Then("will click on Disabled Students")
    public void will_click_on_Disabled_Students() {
        enableStudentPage.disabledStudentTab.click();

    }

    @Then("user will click Enabling button")
    public void user_will_click_Enabling_button() throws InterruptedException {
        enableStudentPage.enablingButton.click();
        driver.switchTo().alert().accept();
        Thread.sleep(5000);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }
}