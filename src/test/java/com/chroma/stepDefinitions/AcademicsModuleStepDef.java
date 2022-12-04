package com.chroma.stepDefinitions;

import static org.junit.Assert.assertEquals;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AcademicsModuleStepDef extends PageInitializer {

    @When("user clicks on Academics Module")
    public void user_clicks_on_Academics_Module() {
        dashboardPageAcademics.academicsModuleButton.click();
    }

    @Then("Academics Module links are displayed {string}, {string}, {string}, {string}, {string}, {string}, {string}, and {string}")
    public void academics_Module_links_are_displayed_and(String classTimetable, String teachersTimetable,
            String assignClassTeacher,String promoteStudents, String subjectGroup, String subjects, String classButton, String sections) {
                CommonUtils.sleep(2000);
                assertEquals("Class Timetable", classTimetable);
                assertEquals("Teachers Timetable", teachersTimetable);
                assertEquals("Assign Class Teacher", assignClassTeacher);
                assertEquals("Promote Students", promoteStudents);
                assertEquals("Subject Group", subjectGroup);
                assertEquals("Subjects", subjects);
                assertEquals("Class", classButton);
                assertEquals("Sections", sections);
            CucumberLogUtils.logExtentScreenshot();
            CucumberLogUtils.logScreenShot();

    }

}
