package com.chroma.appsCommon;
import com.chroma.pages.DashboardHomeworkPage;
import com.chroma.pages.DashboardStudentInformationPage;
import com.chroma.pages.DashboardPageAcademics;
import com.chroma.pages.FeesCollectionPage;
import com.chroma.pages.AddDeleteSectionsPage;
import com.chroma.pages.AgentModulePage;
import com.chroma.pages.DashboardGraphPage;
import com.chroma.pages.LoginPage;
import com.chroma.pages.RealEstateAgentsDashboardPage;
import com.chroma.pages.RealEstateAgentsPage;
import com.chroma.pages.RealEstateLoginPage;
import com.chroma.pages.StudentDetailsPage;
import com.chroma.pages.EditStudentPage;
import com.chroma.pages.StudentAdmissionsPage;
import com.chroma.pages.SectionsPage;
import com.chroma.web.WebDriverUtils;

public class PageInitializer extends WebDriverUtils {
    /* This is the CTSMS Login Page */
    public static LoginPage loginPage;

    /* This is the CTSMS Student Admissions Page Locator */
    public static StudentAdmissionsPage studentAdmissionsPage;

    /* This is the Real Estate Login Page Locator */
    public static RealEstateLoginPage realEstateLoginPage;

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
    public static AddDeleteSectionsPage addDeleteSectionsPage;

    public static DashboardHomeworkPage dashboardHomeworkPage;

    public static DashboardStudentInformationPage dashboardStudentInformationPage;
    public static StudentDetailsPage studentDetailsPage;
    public static EditStudentPage editStudentPage;

    public static RealEstateAgentsDashboardPage realEstateAgentsDashboardPage;
    public static RealEstateAgentsPage realEstateAgentsPage;

    public void initializeAllPages() {

        loginPage = new LoginPage();

        realEstateLoginPage = new RealEstateLoginPage();
        dashboardPageAcademics = new DashboardPageAcademics();
        sectionsPage = new SectionsPage();
        feesCollectionPage = new FeesCollectionPage();
        dashboardGraphPage = new DashboardGraphPage();
        agentModulePage = new AgentModulePage();
        studentAdmissionsPage = new StudentAdmissionsPage();
        addDeleteSectionsPage = new AddDeleteSectionsPage();


        dashboardHomeworkPage = new DashboardHomeworkPage();

        dashboardStudentInformationPage = new DashboardStudentInformationPage();
        studentDetailsPage = new StudentDetailsPage();
        editStudentPage = new EditStudentPage();

        realEstateAgentsDashboardPage = new RealEstateAgentsDashboardPage();
        realEstateAgentsPage = new RealEstateAgentsPage();
    }

}
