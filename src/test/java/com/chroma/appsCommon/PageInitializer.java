package com.chroma.appsCommon;
import com.chroma.pages.HrModPage;

import com.chroma.pages.DashboardPageAcademics;
import com.chroma.pages.DisableStudentPage;
import com.chroma.pages.FeesCollectionPage;
import com.chroma.pages.AgentModulePage;
import com.chroma.pages.DashboardGraphPage;
import com.chroma.pages.LoginPage;
import com.chroma.pages.RealEstateLoginPage;
import com.chroma.pages.SectionsPage;
import com.chroma.web.WebDriverUtils;

public class PageInitializer extends WebDriverUtils {

    // Instantiating LoginPage

    public static LoginPage loginPage;
    public static RealEstateLoginPage realEstateLoginPage;
    public static HrModPage hrModPage;
    /*This is the Dashboard Academics Page Locators */
    public static DashboardPageAcademics dashboardPageAcademics;
    /*This is the Sections Page Locators */
    public static SectionsPage sectionsPage;
    /*This is the Sections Page Locators */
    public static FeesCollectionPage feesCollectionPage;
    //Instatiating the dashboard graph pages in Real estate website
    public static DashboardGraphPage dashboardGraphPage;
    //Instantiating the Agents page in Real estate website
    public static AgentModulePage agentModulePage;
    public static DisableStudentPage disableStudentPage;

    public void initializeAllPages() {

        loginPage = new LoginPage();
        realEstateLoginPage = new RealEstateLoginPage();
        hrModPage = new HrModPage();
        dashboardPageAcademics = new DashboardPageAcademics();
        sectionsPage = new SectionsPage();
        feesCollectionPage = new FeesCollectionPage();
        dashboardGraphPage = new DashboardGraphPage();
        agentModulePage = new AgentModulePage();
        disableStudentPage= new DisableStudentPage();
    }

}
