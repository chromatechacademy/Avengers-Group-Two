package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddDeleteSectionsStepDef extends PageInitializer {

    @Then("user navigates to Academics module")
    public void user_navigates_to_Academics_module() throws InterruptedException {
        addDeleteSectionsPage.academicsButton.click();
        Thread.sleep(2000);
    }

    @Then("user navigates to sections")
    public void user_navigates_to_sections() {
        addDeleteSectionsPage.sectionsButton.click();
    }

    @When("user enters {string}")
    public void user_enters(String nameOfSection) throws InterruptedException {
        addDeleteSectionsPage.sectionTextbox.sendKeys(nameOfSection);
        addDeleteSectionsPage.saveButton.click();
        Thread.sleep(2000);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @Then("user clicks and deletes Bag of Money")
    public void user_clicks_and_deletes_Bag_of_Money() throws InterruptedException {
        addDeleteSectionsPage.deleteButton.click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @Then("user navigates to class")
    public void user_navigates_to_class() {
        addDeleteSectionsPage.classButton.click();
    }

    @Then("user will enter {string} under Ruth section")
    public void user_will_enter_under_Ruth_section(String nameOfClass) {
        addDeleteSectionsPage.classTextbox.sendKeys(nameOfClass);
        addDeleteSectionsPage.selectSectionCheck.click();
        addDeleteSectionsPage.saveButtonClassPage.click();
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @Then("user can delete class")
    public void user_can_delete_class() throws InterruptedException {
        addDeleteSectionsPage.deleteClassButton.click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

}
