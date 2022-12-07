package com.chroma.stepsImplementation;

import org.testng.Assert;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;



public class AdmissionMtplStudentsImpl extends PageInitializer {

    public static void dashboardPage() {

        boolean recordSavedSuccessfully = studentAdmissionPage.recordSavedText.isDisplayed();
        Assert.assertTrue(recordSavedSuccessfully);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

}
