package com.chroma.appsCommon;
import com.chroma.pages.DashboardHomeworkPage;
import com.chroma.pages.DashboardStudentInformationPage;
import com.chroma.pages.LoginPage;
import com.chroma.pages.RealEstateAgentsDashboardPage;
import com.chroma.pages.RealEstateAgentsPage;
import com.chroma.pages.RealEstateLoginPage;
import com.chroma.pages.StudentDetailsPage;
import com.chroma.pages.EditStudentPage;
import com.chroma.web.WebDriverUtils;

public class PageInitializer extends WebDriverUtils {

    // Instantiating LoginPage

    public static LoginPage loginPage;

    public static RealEstateLoginPage realEstateLoginPage;

    public static DashboardHomeworkPage dashboardHomeworkPage;

    public static DashboardStudentInformationPage dashboardStudentInformationPage;
    public static StudentDetailsPage studentDetailsPage;
    public static EditStudentPage editStudentPage;

    public static RealEstateAgentsDashboardPage realEstateAgentsDashboardPage;
    public static RealEstateAgentsPage realEstateAgentsPage;

    public void initializeAllPages() {

        loginPage = new LoginPage();

        realEstateLoginPage = new RealEstateLoginPage();

        dashboardHomeworkPage = new DashboardHomeworkPage();

        dashboardStudentInformationPage = new DashboardStudentInformationPage();
        studentDetailsPage = new StudentDetailsPage();
        editStudentPage = new EditStudentPage();

        realEstateAgentsDashboardPage = new RealEstateAgentsDashboardPage();
        realEstateAgentsPage = new RealEstateAgentsPage();
    }

}
