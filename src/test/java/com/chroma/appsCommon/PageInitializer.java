package com.chroma.appsCommon;
import com.chroma.pages.DashboardPageAcademics;
import com.chroma.pages.LoginPage;
import com.chroma.pages.RealEstateLoginPage;
import com.chroma.web.WebDriverUtils;

public class PageInitializer extends WebDriverUtils {

    // Instantiating LoginPage

    public static LoginPage loginPage;
    public static RealEstateLoginPage realEstateLoginPage;
    /*This is the Dashboard Academics Page Locators */
    public static DashboardPageAcademics dashboardPageAcademics;
    public void initializeAllPages() {

        loginPage = new LoginPage();
        realEstateLoginPage = new RealEstateLoginPage();
        dashboardPageAcademics = new DashboardPageAcademics();
    }

}
