package com.chroma.stepsImplementation;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.chroma.appsCommon.PageInitializer;


public class StudentAdmissionsStepImpl extends PageInitializer{
    
    /** 
     * Use this method to enter information for Admissions page
     * 
     */
    public static void studentAdmissionsCredentials(String admissionNo, String rollNum, String classSelection, String sectionSelection, String firstName,
    String lastName,
    String genderSelection, String dateOfBirth, String categorySelection, String email,
    String bloodGroupSelection, String mobileNum,
    String height, String weight, String fatherName, String fatherPhone, String fatherOccupation,
    String motherName,
    String motherOccupation, String gaurdian, String gaurdianEmail, String guardianAddress){

    
        // studentAdmissionsPage.admissionNumber.sendKeys("20172020");
        // studentAdmissionsPage.rollNumber.sendKeys("1");
        // studentAdmissionsPage.enterFirstName.sendKeys("Shine");
        // studentAdmissionsPage.enterLastName.sendKeys("Bright");
        // studentAdmissionsPage.enterDOB.sendKeys("08/22/1989");
        // studentAdmissionsPage.emailAddress.sendKeys("studentchroma@gmail.com");
        // studentAdmissionsPage.phoneNumber.sendKeys("1234567890");
        // studentAdmissionsPage.enterHeight.sendKeys("5'5");
        // studentAdmissionsPage.enterWeight.sendKeys("120");
        // studentAdmissionsPage.enterFatherName.sendKeys("Abraham");
        // studentAdmissionsPage.enterFatherNumber.sendKeys("1234567890");
        // studentAdmissionsPage.enterFatherJob.sendKeys("President");
        // studentAdmissionsPage.enterMotherName.sendKeys("Aretha");
        // studentAdmissionsPage.enterMotherJob.sendKeys("Singer");
        // studentAdmissionsPage.enterGaurdianEmail.sendKeys("studentchroma@gmail.com");
        // studentAdmissionsPage.enterGaurdianAddress.sendKeys("CandyLane drive");
        // studentAdmissionsPage.saveButton.click();

        Select dropdownClass = new Select(driver.findElement(By.xpath("//select[@name='class_id']")));
        dropdownClass.selectByValue("SDET");

        Select dropdownSection = new Select(driver.findElement(By.xpath("//select[@name='section_id']")));
        dropdownSection.selectByValue("Mobile Test Automation");

        Select dropdownGender = new Select(driver.findElement(By.xpath("//select[@name='gender']")));
        dropdownGender.selectByValue("Female");

        Select dropdownCategory = new Select(driver.findElement(By.xpath("//select[@name='category_id']")));
        dropdownCategory.selectByValue("Testing sample");

        Select dropdownBlood = new Select(driver.findElement(By.xpath("//select[@name='blood_group']")));
        dropdownBlood.selectByValue("O+");



    }
    


    
}
