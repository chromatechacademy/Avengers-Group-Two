package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddDeleteSectionsStepDef extends PageInitializer {

    @Then("user navigates to Academics module")
    public void user_navigates_to_Academics_module() {
        addDeleteSectionsPage.academicsButton.click();
    }

    @Then("user navigates to sections")
    public void user_navigates_to_sections() {
        addDeleteSectionsPage.sectionsButton.click();
    }

    @When("user enters {string}")
    public void user_enters(String nameOfSection) {
        addDeleteSectionsPage.sectionTextbox.sendKeys(nameOfSection);
        addDeleteSectionsPage.saveButton.click();
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @Then("user clicks and deletes Bag of Money")
    public void user_clicks_and_deletes_Bag_of_Money() {
        addDeleteSectionsPage.deleteButton.click();
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
    public void user_can_delete_class() {
        addDeleteSectionsPage.deleteClassButton.click();
        CommonUtils.acceptAlert();
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }
}
