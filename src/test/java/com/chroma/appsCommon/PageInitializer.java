package com.chroma.appsCommon;

import com.chroma.pages.AgentModulePage;
import com.chroma.pages.DashboardGraphPage;
import com.chroma.pages.LoginPage;
import com.chroma.pages.RealEstateLoginPage;
import com.chroma.pages.StudentAdmissionPage;
import com.chroma.pages.StudentInformationPage;

import com.chroma.web.WebDriverUtils;

public class PageInitializer extends WebDriverUtils {

    // Instantiating LoginPage

    public static LoginPage loginPage;
    public static RealEstateLoginPage realEstateLoginPage;
    // Instatiating the dashboard graph pages in Real estate website
    public static DashboardGraphPage dashboardGraphPage;
    // Instantiating the Agents page in Real estate website
    public static AgentModulePage agentModulePage;
    // Instantialing the Student Information Page
    public static StudentInformationPage studentInformationPage;
    // Instantialing the Student Admission Page
    public static StudentAdmissionPage studentAdmissionPage;

    public void initializeAllPages() {

        loginPage = new LoginPage();
        realEstateLoginPage = new RealEstateLoginPage();
        dashboardGraphPage = new DashboardGraphPage();
        agentModulePage = new AgentModulePage();
        studentInformationPage = new StudentInformationPage();
        studentAdmissionPage = new StudentAdmissionPage();

    }

}
