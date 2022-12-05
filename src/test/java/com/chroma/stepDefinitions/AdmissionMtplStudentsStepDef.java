package com.chroma.stepDefinitions;

import org.apache.velocity.runtime.directive.Break;
import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.StudentAdmissionPage;
import com.chroma.stepsImplementation.LoginStepsImpl;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en_lol.WEN;
import dev.failsafe.internal.util.Assert;
import io.opentelemetry.sdk.metrics.SdkMeterProvider;

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

    @Then("navigates to the Student Information dropdown module")
    public void navigates_to_the_Student_Information_dropdown_module() {
        studentInformationPage.studentInfoDropDElement.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @And("selects the Student Admission option")
    public void selects_the_Student_Admission_option() {
        studentInformationPage.studentAdmissDropDElement.click();

    }

    @Then("enters data in {int}")
    public void enters_data_in(Integer admInteger) {
        studentAdmissionPage.admissionNo.click();
        CommonUtils.sleep(3000);
        studentAdmissionPage.admissionNo.sendKeys(admInteger.toString());
    }

    @Then("user enters number in {int}")
    public void user_enters_number_in(Integer rollNoInteger) {
        studentAdmissionPage.rollNo.click();
        CommonUtils.sleep(3000);
        studentAdmissionPage.rollNo.sendKeys(rollNoInteger.toString());
    }

    @Then("user enters data in Al")
    public void user_enters_data_in_Al() {
        studentAdmissionPage.firstName.click();
        studentAdmissionPage.firstName.sendKeys();

    }

    @Then("user enters data in Bo")
    public void user_enters_data_in_Bo() {
        studentAdmissionPage.firstName.click();
        studentAdmissionPage.firstName.sendKeys();

    }

    @Then("user enters data in Ck")
    public void user_enters_data_in_Ck() {
        studentAdmissionPage.firstName.click();
        studentAdmissionPage.firstName.sendKeys();

    }
}
