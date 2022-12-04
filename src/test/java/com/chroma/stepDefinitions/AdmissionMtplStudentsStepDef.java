package com.chroma.stepDefinitions;

import org.openqa.selenium.By;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.LoginStepsImpl;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.WebDriverUtils;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdmissionMtplStudentsStepDef extends PageInitializer {
    @Given("user is on a CTSMS home page {string}")
    public void user_is_on_a_CTSMS_home_page(String url) {
        WebDriverUtils.driver.get(url);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @When("user logsin {string} and password {string}")
    public void user_logsin_and_password(String username, String password) {
        LoginStepsImpl.loginCredentials(username, password);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();

    }

    @Then("navigates to the Student Information drop down module")
    public void navigates_to_the_Student_Information_drop_down_module() {
      WebDriverUtils.driver.findElement(By.name("Student Information")).click();

    }

    @And("selects the Student Admission option")
    public void selects_the_Student_Admission_option() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }
}
