package com.chroma.stepDefinitions;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.LoginStepsImpl;
import com.chroma.web.WebDriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddingMtplStudentsStepDef extends PageInitializer {

    @Given("a user is on the login page {string}")
    public void a_user_is_on_the_login_page(String url) {
        WebDriverUtils.driver.get(url);
    }

    @When("logs in with username {string} and password {string}")
    public void logs_in_with_username_and_password(String username, String password) {
        LoginStepsImpl.loginCredentials(username, password);

    }

    @Then("user navigates to Student Information dropdown")
    public void user_navigates_to_Student_Information_dropdown() {
        WebDriverUtils.driver.findElement(By.xpath("//i[@class='fa fa-user-plus ftlayer']")).click();
    }

    @Then("user clicks on Student Admition")
    public void user_clicks_on_Student_Admition() {
        WebDriverUtils.driver.findElement(By.xpath("//a[normalize-space()='Student Admission']//i[@class='fa fa-angle-double-right']")).click();
        
    }

    @Then("user enters data in {int}")
    public void user_enters_data_in(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("user enters number in {int}")
    public void user_enters_number_in(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("user enters data in Al")
    public void user_enters_data_in_Al() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("user enters data in Smith")
    public void user_enters_data_in_Smith() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("user enters data in {int}\\/{int}\\/{int}")
    public void user_enters_data_in(Integer int1, Integer int2, Integer int3) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("user enters data in Al@gmail.com")
    public void user_enters_data_in_Al_gmail_com() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("user makes selection in Class dropdown")
    public void user_makes_selection_in_Class_dropdown() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("user makes selection in a Section  dropdown")
    public void user_makes_selection_in_a_Section_dropdown() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("user makes selection  in a Gender  dropdown")
    public void user_makes_selection_in_a_Gender_dropdown() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("user makes selection in a Category dropdown")
    public void user_makes_selection_in_a_Category_dropdown() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("user selects blood type in a Blood Group dropdown")
    public void user_selects_blood_type_in_a_Blood_Group_dropdown() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("user enters data in Bo")
    public void user_enters_data_in_Bo() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("user enters data in Bo@gmail.com")
    public void user_enters_data_in_Bo_gmail_com() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("user enters data in Ck")
    public void user_enters_data_in_Ck() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("user enters data in Ck@gmail.com")
    public void user_enters_data_in_Ck_gmail_com() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }
}
