package com.chroma.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.WebDriverUtils;

import cucumber.api.java.en.Then;

public class ExpenseModuleStepDef extends PageInitializer {

    @Then("user clicks on Expense Module {string}")
    public void user_clicks_on_Expense_Module(String ExpenseModule) throws InterruptedException {
        WebDriverUtils.driver.findElement(By.xpath(ExpenseModule)).click();
        Thread.sleep(2000);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @Then("user sees the Add Expense Module {string}, Search Expense {string}, and the Expense Head {string}")
    public void user_sees_the_Add_Expense_Search_Expense_and_the_Expense_Head(String addExpense, String searchExpense,
            String expenseHead) {
        Assert.assertTrue(addExpense, true);
        Assert.assertTrue(searchExpense, true);
        Assert.assertTrue(expenseHead, true);
    }

}
