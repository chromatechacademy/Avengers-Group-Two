package com.chroma.stepDefinitions;

import org.testng.Assert;
import com.chroma.pages.NavigationModPage;
import com.chroma.utils.CucumberLogUtils;
import cucumber.api.java.en.Then;

public class NavigationModDef {
        @Then("user is able to see links displayed {string}, {string}, {string}, {string}, {string}, {string},{string},{string}")
        public void user_is_able_to_see_links_displayed(String studentInformation, String feesCollection, String income,
                        String expenses,
                        String academics, String humanResource, String homework, String reports) {

                boolean isStudentInformationDisplayed = NavigationModPage.dynamicModule(studentInformation).getText()
                                .contentEquals(studentInformation);

                Assert.assertTrue(isStudentInformationDisplayed);
                CucumberLogUtils.logExtentScreenshot();
                CucumberLogUtils.logScreenShot();

                boolean isfeesCollectionDisplayed = NavigationModPage.dynamicModule(feesCollection).getText()
                                .contentEquals(feesCollection);

                Assert.assertTrue(isfeesCollectionDisplayed);
                CucumberLogUtils.logExtentScreenshot();
                CucumberLogUtils.logScreenShot();

                boolean isincomeDisplayed = NavigationModPage.dynamicModule(income).getText()
                                .contentEquals(income);

                Assert.assertTrue(isincomeDisplayed);
                CucumberLogUtils.logExtentScreenshot();
                CucumberLogUtils.logScreenShot();

                boolean isexpensesDisplayed = NavigationModPage.dynamicModule(expenses).getText()
                                .contentEquals(expenses);

                Assert.assertTrue(isexpensesDisplayed);
                CucumberLogUtils.logExtentScreenshot();
                CucumberLogUtils.logScreenShot();

                boolean isacademicsDisplayed = NavigationModPage.dynamicModule(academics).getText()
                                .contentEquals(academics);

                Assert.assertTrue(isacademicsDisplayed);
                CucumberLogUtils.logExtentScreenshot();
                CucumberLogUtils.logScreenShot();

                boolean ishumanResourceDisplayed = NavigationModPage.dynamicModule(humanResource).getText()
                                .contentEquals(humanResource);

                Assert.assertTrue(ishumanResourceDisplayed);
                CucumberLogUtils.logExtentScreenshot();
                CucumberLogUtils.logScreenShot();

                boolean ishomeworkDisplayed = NavigationModPage.dynamicModule(homework).getText()
                                .contentEquals(homework);

                Assert.assertTrue(ishomeworkDisplayed);
                CucumberLogUtils.logExtentScreenshot();
                CucumberLogUtils.logScreenShot();

                boolean isreportsDisplayed = NavigationModPage.dynamicModule(reports).getText()
                                .contentEquals(reports);

                Assert.assertTrue(isreportsDisplayed);
                CucumberLogUtils.logExtentScreenshot();
                CucumberLogUtils.logScreenShot();

        }

}