package com.chroma.stepDefinitions;

import org.openqa.selenium.By;

import com.chroma.web.WebDriverUtils;

import cucumber.api.java.en.Then;

public class DisableStudentFileDef {

    @Then("user will select Student Information tab")
    public void user_will_select_Student_Information_tab() {
        WebDriverUtils.driver.findElement(By.xpath("//span[normalize-space()='Student Information']")).click();

    }

    @Then("user will click on Student Details")
    public void user_will_click_on_Student_Details() {
        WebDriverUtils.driver.findElement(By.xpath("//li[1]//ul[1]//li[1]//a[1]")).click();
    }
    @Then("will select SDET on the class drop down")
    public void will_select_SDET_on_the_class_drop_down() {
       WebDriverUtils.driver.findElement(By.xpath("//select[@name='class_id']")).click();

    }
}