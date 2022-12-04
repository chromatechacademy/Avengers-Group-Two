package com.chroma.stepDefinitions;

import org.testng.Assert;
import com.chroma.appsCommon.PageInitializer;
import cucumber.api.java.en.Then;

public class FeesCollectionStepDef extends PageInitializer {

    @Then("user clicks on Fees Collection Module")
    public void user_clicks_on_Fees_Collection_Module() {
       feesCollectionPage.feesCollectionModule.click();
    }

    @Then("user sees the links {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void user_sees_the_links(String collectFees,String searchFeesPayment,String searchDueFees, String feesMaster, 
    String feesGroup, String feesType, String feesDiscount,String feesCarryForward,String feesReminder) {
        Assert.assertEquals("Collect Fees", collectFees);
        Assert.assertEquals("Search Fees Payment", searchFeesPayment);
        Assert.assertEquals("Search Due Fees", searchDueFees);
        Assert.assertEquals("Fees Master", feesMaster);
        Assert.assertEquals("Fees Group", feesGroup);
        Assert.assertEquals("Fees Type", feesType);
        Assert.assertEquals("Fees Discount", feesDiscount);
        Assert.assertEquals("Fees Carry Forward", feesCarryForward);
        Assert.assertEquals("Fees Reminder", feesReminder);

    }

}
