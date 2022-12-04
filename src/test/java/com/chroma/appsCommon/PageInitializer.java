package com.chroma.appsCommon;
import com.chroma.pages.AgentModulePage;
import com.chroma.pages.DashboardGraphPage;
import com.chroma.pages.LoginPage;
import com.chroma.pages.RealEstateLoginPage;
import com.chroma.pages.StudentAdmissionsPage;
import com.chroma.web.WebDriverUtils;

public class PageInitializer extends WebDriverUtils {

    public static LoginPage loginPage;
    public static StudentAdmissionsPage studentAdmissionsPage;
    public static RealEstateLoginPage realEstateLoginPage;
    //Instatiating the dashboard graph pages in Real estate website
    public static DashboardGraphPage dashboardGraphPage;
    //Instantiating the Agents page in Real estate website
    public static AgentModulePage agentModulePage;

    public void initializeAllPages() {

        loginPage = new LoginPage();
        realEstateLoginPage = new RealEstateLoginPage();
        dashboardGraphPage = new DashboardGraphPage();
        agentModulePage = new AgentModulePage();
        studentAdmissionsPage = new StudentAdmissionsPage();

    }

}
