package com.chroma.stepDefinitions;

import org.openqa.selenium.WebElement;

import com.chroma.appsCommon.PageInitializer;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CategoryStepDef extends PageInitializer {

    @When("user clicks on Student Information and Student Categories modules")
public void user_clicks_on_Student_Information_and_Student_Categories_modules() throws InterruptedException {
Thread.sleep(3000);
studentInfoPage.studentCategories.click();
}

@When("user enters {string} in the Category textbox and clicks on Save")
public void user_enters_in_the_Category_textbox_and_clicks_on_Save(String string) {
    
    
}

@When("{string} added to the Category List")
public void added_to_the_Category_List(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@Then("user clicks on delete and deleted New Category from the Category List")
public void user_clicks_on_delete_and_deleted_New_Category_from_the_Category_List() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}
    
}
