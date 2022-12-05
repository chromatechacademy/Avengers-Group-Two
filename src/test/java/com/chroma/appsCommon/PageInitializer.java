package com.chroma.appsCommon;
import com.chroma.pages.AgentModulePage;
import com.chroma.pages.DashboardGraphPage;
import com.chroma.pages.LoginPage;
import com.chroma.pages.StudentInfoPage;
import com.chroma.pages.RealEstateLoginPage;
import com.chroma.web.WebDriverUtils;

public class PageInitializer extends WebDriverUtils {

    // Instantiating LoginPage

    public static LoginPage loginPage;
    
    public static StudentInfoPage studentInfoPage;
    public static RealEstateLoginPage realEstateLoginPage;
    //Instatiating the dashboard graph pages in Real estate website
    public static DashboardGraphPage dashboardGraphPage;
    //Instantiating the Agents page in Real estate website
    public static AgentModulePage agentModulePage;


    public void initializeAllPages() {

        loginPage = new LoginPage();
        
        studentInfoPage = new StudentInfoPage();
        realEstateLoginPage = new RealEstateLoginPage();
        dashboardGraphPage = new DashboardGraphPage();
        agentModulePage = new AgentModulePage();
        
    }

}
