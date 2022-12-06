package com.chroma.stepDefinitions;

import javax.swing.Action;
import org.apache.velocity.runtime.directive.Break;
import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.StudentAdmissionPage;
import com.chroma.stepsImplementation.LoginStepsImpl;
import com.chroma.utils.Constans;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
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

    @Then("navigates to the Student Information dropdown module")
    public void navigates_to_the_Student_Information_dropdown_module() {
        studentInformationPage.studentInfoDropDElement.click();
    }

    @And("selects the Student Admission option")
    public void selects_the_Student_Admission_option() {
        studentInformationPage.studentAdmissDropDElement.click();

    }

    @Then("enters data in {int}")
    public void enters_data_in(Integer admInteger) {
        studentAdmissionPage.admissionNoBox.click();
        studentAdmissionPage.admissionNoBox.sendKeys(admInteger.toString());
    }

    @Then("user enters number in {int}")
    public void user_enters_number_in(Integer rollNoInteger) {
        studentAdmissionPage.rollNoBox.click();
        CommonUtils.sleep(3000);
        studentAdmissionPage.rollNoBox.sendKeys(rollNoInteger.toString());
    }

    @Then("user enters data in Al")
    public void user_enters_data_in_Al() {
        studentAdmissionPage.firstNameBox.click();
        studentAdmissionPage.firstNameBox.sendKeys("Al".toString());
    }

    @Then("user enters data in Bo")
    public void user_enters_data_in_Bo() {
        studentAdmissionPage.firstNameBox.click();
        studentAdmissionPage.firstNameBox.sendKeys("Bo".toString());
    }

    @Then("user enters data in Ck")
    public void user_enters_data_in_Ck() {
        studentAdmissionPage.firstNameBox.click();
        studentAdmissionPage.firstNameBox.sendKeys("Ck".toString());
    }

    @Then("user enters data in Smith")
    public void user_enters_data_in_Smith() {
        studentAdmissionPage.lastNameBox.click();
        studentAdmissionPage.lastNameBox.sendKeys("Ck".toString());
    }

    @Then("user enters data in {string}")
    public void user_enters_data_in(String dateOfBirth) {
        studentAdmissionPage.dateOfBirthDropDown.click();
        studentAdmissionPage.dateOfBirthDropDown.sendKeys(dateOfBirth.toString());
        CommonUtils.sleep(3000);
    }

    @Then("user enters Al@gmail.com in Emailbox")
    public void user_enters_Al_gmail_com_in_Emailbox() {
        CommonUtils.sleep(3000);
        studentAdmissionPage.studentEmailBox.click();
        CommonUtils.sleep(3000);
        studentAdmissionPage.studentEmailBox.sendKeys("Al@gmail.com".toString());

    }

    @Then("user enters Bo@gmail.com in Emailbox")
    public void user_enters_Bo_gmail_com_in_Emailbox() {
        CommonUtils.sleep(3000);
        studentAdmissionPage.studentEmailBox.click();
        CommonUtils.sleep(3000);
        studentAdmissionPage.studentEmailBox.sendKeys("Bo@gmail.com".toString());
    }

    @Then("user enters Ck@gmail.com in Emailbox")
    public void user_enters_Ck_gmail_com_in_Emailbox() {
        CommonUtils.sleep(3000);
        studentAdmissionPage.studentEmailBox.click();
        CommonUtils.sleep(3000);
        studentAdmissionPage.studentEmailBox.sendKeys("Ck@gmail.com".toString());
    }

    @Then("user makes selection in SDET dropdown")
    public void user_makes_selection_in_SDET_dropdown() {
        CommonUtils.sleep(3000);
        studentAdmissionPage.studentClassDropDown.click();
        CommonUtils.sleep(3000);
        studentAdmissionPage.classSDET_DropDown.click();
    }

    @Then("user makes selection in a Git\\/GitHub  dropdown")
    public void user_makes_selection_in_a_Git_GitHub_dropdown() {
        studentAdmissionPage.classSelectioElement.click();
        studentAdmissionPage.selectGitDropDown.click();
    }

    @Then("user makes selection  in a male  dropdown")
    public void user_makes_selection_in_a_male_dropdown() {
        studentAdmissionPage.genderDropDown.click();
        studentAdmissionPage.genderMaleDropDown.click();
    }

    @Then("user makes selection in a Moe dropdown")
    public void user_makes_selection_in_a_Moe_dropdown() {
        studentAdmissionPage.studentCategoryDropD.click();

    }

    @Then("user drags Al in a box")
    public void user_drags_Al_in_a_box() {
        CommonUtils.sleep(3000);
        studentAdmissionPage.studentPhotoElement.sendKeys(Constans.studentPhoto);
        CommonUtils.sleep(3000);
    }

    @Then("user drags Bo in a box")
    public void user_drags_Bo_in_a_box() {
        CommonUtils.sleep(3000);
        studentAdmissionPage.studentPhotoElement.sendKeys(Constans.studentPhoto);
        CommonUtils.sleep(3000);
    }

    @Then("user drags Ck in a box")
    public void user_drags_Ck_in_a_box() {
        CommonUtils.sleep(3000);
        studentAdmissionPage.studentPhotoElement.sendKeys(Constans.studentPhoto);
        CommonUtils.sleep(3000);
    }
    @Then("user makes selection to a Moe dropdown")
public void user_makes_selection_to_a_Moe_dropdown() {
    studentAdmissionPage.studentCategoryDropD.click();
    studentAdmissionPage.studentCategoryMoeDDown.click();
}



}
