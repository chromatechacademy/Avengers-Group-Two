package com.chroma.stepsImplementation;

import org.openqa.selenium.By;
import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;

public class StudentAdmissionsStepImpl extends PageInitializer {

        /**
         * Use this method to add student credentials to the student admissions page
         */
        public static void studentAdmissionsCredentials(String admissionNo, String rollNum, String classSelection,
                        String sectionSelection, String firstName,
                        String lastName,
                        String genderSelection, String dateOfBirth, String categorySelection, String email,
                        String bloodGroupSelection, String mobileNum,
                        String height, String weight, String fatherName, String fatherPhone, String fatherOccupation,
                        String motherName,
                        String motherOccupation, String gaurdian, String gaurdianEmail, String guardianAddress) {

                studentAdmissionsPage.admissionNumber.sendKeys(admissionNo);
                studentAdmissionsPage.rollNumber.sendKeys(rollNum);
                CommonUtils.selectDropDownValue(classSelection,
                                driver.findElement(By.xpath("//select[@name='class_id']")));
                CommonUtils.selectDropDownValue(sectionSelection,
                                driver.findElement(By.xpath("//select[@name='section_id']")));
                studentAdmissionsPage.enterFirstName.sendKeys(firstName);
                studentAdmissionsPage.enterLastName.sendKeys(lastName);
                CommonUtils.selectDropDownValue(genderSelection,
                                WebDriverUtils.driver.findElement(By.xpath("//select[@name='gender']")));
                studentAdmissionsPage.enterDOB.sendKeys(dateOfBirth);
                CommonUtils.selectDropDownValue(categorySelection,
                                driver.findElement(By.xpath("(//select[@name='category_id'])[1]")));
                studentAdmissionsPage.emailAddress.sendKeys(email);
                CommonUtils.selectDropDownValue(bloodGroupSelection,
                                driver.findElement(By.xpath("//select[@name='blood_group']")));
                studentAdmissionsPage.phoneNumber.sendKeys(mobileNum);
                studentAdmissionsPage.enterHeight.sendKeys(height);
                studentAdmissionsPage.enterWeight.sendKeys(weight);
                studentAdmissionsPage.enterFatherName.sendKeys(fatherName);
                studentAdmissionsPage.enterFatherNumber.sendKeys(fatherPhone);
                studentAdmissionsPage.enterFatherJob.sendKeys(fatherOccupation);
                studentAdmissionsPage.enterMotherName.sendKeys(motherName);
                studentAdmissionsPage.enterMotherJob.sendKeys(motherOccupation);
                studentAdmissionsPage.selectsGaurdian.click();
                studentAdmissionsPage.enterGaurdianEmail.sendKeys(gaurdianEmail);
                studentAdmissionsPage.enterGaurdianAddress.sendKeys(guardianAddress);
                studentAdmissionsPage.saveButton.click();
                CucumberLogUtils.logExtentScreenshot();
                CucumberLogUtils.logScreenShot();
        }

        /**
         * Use this method to select class type and select section type in the student details page
         */
        public static void studentDetailsPage(String classSelection, String sectionSelection, String firstName) {
                CommonUtils.selectDropDownValue(classSelection,
                                driver.findElement(By.xpath("//select[@name='class_id']")));
                CommonUtils.selectDropDownValue(sectionSelection,
                                driver.findElement(By.xpath("//select[@name='section_id']")));
                studentAdmissionsPage.searchByKeywordTextBox.sendKeys(firstName);
        }
        /**
         * Use this method to select class type and select section type in the bulk delete page
         */
        public static void bulkDeletePage(String classSelection, String sectionSelection) {
                CommonUtils.selectDropDownValue(classSelection,
                                driver.findElement(By.xpath("//select[@name='class_id']")));
                CommonUtils.selectDropDownValue(sectionSelection,
                                driver.findElement(By.xpath("//select[@name='section_id']")));
        }
}
