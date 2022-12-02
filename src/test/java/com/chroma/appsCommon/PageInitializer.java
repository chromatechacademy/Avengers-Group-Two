package com.chroma.appsCommon;
import com.chroma.pages.DashboardGraphPage;
import com.chroma.pages.LoginPage;
import com.chroma.pages.RealEstateLoginPage;
import com.chroma.web.WebDriverUtils;

public class PageInitializer extends WebDriverUtils {

    // Instantiating LoginPage

    public static LoginPage loginPage;
    public static RealEstateLoginPage realEstateLoginPage;
    //Instatiating the dashboard graph pages
    public static DashboardGraphPage dashboardGraphPage;

    public void initializeAllPages() {

        loginPage = new LoginPage();
        realEstateLoginPage = new RealEstateLoginPage();
        dashboardGraphPage = new DashboardGraphPage();

    }

}
