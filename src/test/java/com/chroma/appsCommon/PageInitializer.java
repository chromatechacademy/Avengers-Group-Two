package com.chroma.appsCommon;
<<<<<<< HEAD
import com.chroma.pages.HrModPage;
=======

import com.chroma.pages.DashboardPageAcademics;
import com.chroma.pages.FeesCollectionPage;
>>>>>>> ce9a4ec708aa40437cab4dd386a92c7509be7c76
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
<<<<<<< HEAD
    public static HrModPage hrModPage;
=======
    /*This is the Dashboard Academics Page Locators */
    public static DashboardPageAcademics dashboardPageAcademics;
    /*This is the Sections Page Locators */
    public static SectionsPage sectionsPage;
    /*This is the Sections Page Locators */
    public static FeesCollectionPage feesCollectionPage;
>>>>>>> ce9a4ec708aa40437cab4dd386a92c7509be7c76
    //Instatiating the dashboard graph pages in Real estate website
    public static DashboardGraphPage dashboardGraphPage;
    //Instantiating the Agents page in Real estate website
    public static AgentModulePage agentModulePage;

    public void initializeAllPages() {

        loginPage = new LoginPage();
        realEstateLoginPage = new RealEstateLoginPage();
<<<<<<< HEAD
        hrModPage = new HrModPage();
=======
        dashboardPageAcademics = new DashboardPageAcademics();
        sectionsPage = new SectionsPage();
        feesCollectionPage = new FeesCollectionPage();
>>>>>>> ce9a4ec708aa40437cab4dd386a92c7509be7c76
        dashboardGraphPage = new DashboardGraphPage();
        agentModulePage = new AgentModulePage();
        
    }

}
