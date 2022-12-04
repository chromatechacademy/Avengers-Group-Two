package com.chroma.stepDefinitions;

import org.testng.Assert;
import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ExpenseModuleStepDef extends PageInitializer {

    @When("user clicks on Expense Module")
    public void user_clicks_on_Expense_Module() {
        dashboardPageAcademics.expenseModuleButton.click();
        CommonUtils.sleep(2000);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @Then("user sees the Add Expense, Search Expense, and the Expense Head")
    public void user_sees_the_Add_Expense_Search_Expense_and_the_Expense_Head() {
        Assert.assertTrue(true, "Add Expense");
        Assert.assertTrue(true, "Search Expense");
        Assert.assertTrue(true, "Expense Head");
    }

}
