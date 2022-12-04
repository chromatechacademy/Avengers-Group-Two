package com.chroma.stepDefinitions;

import org.testng.Assert;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import cucumber.api.java.en.Then;

public class ClassAndSectionsStepDef extends PageInitializer {

    @Then("user clicks on class sections")
    public void user_clicks_on_class_sections() {
        dashboardPageAcademics.academicsModuleButton.click();
        dashboardPageAcademics.classButton.click();
    }

    @Then("user is on the Class List Page and {string}, {string}, {string}, and {string}")
    public void user_is_on_the_Class_List_Page_and_and(String cyberSecurity, String sDET, String penetrationTesting,
            String databaseTesting) {
        CommonUtils.sleep(2000);
        Assert.assertEquals("Cyber Security", cyberSecurity);
        Assert.assertEquals("SDET", sDET);
        Assert.assertEquals("Penetration Testing/Ethical Hacking", penetrationTesting);
        Assert.assertEquals("Database Testing", databaseTesting);
    }

    @Then("user is on the Class List Page and under the {string} section, they will see {string}, {string}, {string}, and {string} and under the {string} section user will see {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, and {string}")
    public void user_is_on_the_Class_List_Page_and_under_the_section_they_will_see_and_and_under_the_section_user_will_see_and(
            String cyberSecurity, String penetrationTesting, String networkingFundamentals, String linuxFundamentals, String ciaTriad, String sDET,
            String databaseTesting, String testingFunadamentals, String sdlcMethodologies, String seleniumTestAutomation, String cucumberFundamentals, String apiTesting,
            String gitHub, String javaForCoolPeople, String mobileTestAutomation, String accessibilityTesting) {

                CommonUtils.sleep(2000);
        Assert.assertEquals("Cyber Security", cyberSecurity);
        Assert.assertEquals("SDET", sDET);
        Assert.assertEquals("Penetration Testing/Ethical Hacking", penetrationTesting);
        Assert.assertEquals("Networking Fundamentals", networkingFundamentals);
        Assert.assertEquals("Linux Fundamentals", linuxFundamentals);
        Assert.assertEquals("CIA Triad", ciaTriad);
        Assert.assertEquals("Database Testing", databaseTesting);
        Assert.assertEquals("Testing Fundamentals", testingFunadamentals);
        Assert.assertEquals("SDLC Methodologies", sdlcMethodologies);
        Assert.assertEquals("Selenium Test Automation", seleniumTestAutomation);
        Assert.assertEquals("Cucumber Fundamentals", cucumberFundamentals);
        Assert.assertEquals("API Testing", apiTesting);
        Assert.assertEquals("Git/GitHub", gitHub);
        Assert.assertEquals("Java 11 for Cool People", javaForCoolPeople);
        Assert.assertEquals("Mobile Test Automation", mobileTestAutomation);
        Assert.assertEquals("Accessibility Testing", accessibilityTesting);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();


    }

}
