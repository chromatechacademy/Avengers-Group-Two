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

    /* LoginPage instance */
    public static LoginPage loginPage;

    /* StudentAdmissionsPage instance */
    public static StudentAdmissionsPage studentAdmissionsPage;

    /* RealEstateLoginPage instance */
    public static RealEstateLoginPage realEstateLoginPage;

    /* DashboardPageAcademics instance */
    public static DashboardPageAcademics dashboardPageAcademics;

    /* SectionsPage instance */
    public static SectionsPage sectionsPage;

    /* FeesCollectionPage instance */
    public static FeesCollectionPage feesCollectionPage;

    /* DashboardGraphPage instance */
    public static DashboardGraphPage dashboardGraphPage;

    /* AgentModulePage instance */ 
    public static AgentModulePage agentModulePage;

    /* AddDeleteSections instance */
    public static AddDeleteSectionsPage addDeleteSectionsPage;

    /* DashboardHomework instance */
    public static DashboardHomeworkPage dashboardHomeworkPage;

    /* DashboardStudent instance */
    public static DashboardStudentInformationPage dashboardStudentInformationPage;

    /* StudentDetail instance */
    public static StudentDetailsPage studentDetailsPage;

    /* EditStudent instance */
    public static EditStudentPage editStudentPage;

    /* RealEstateAgentsDashboard instance */
    public static RealEstateAgentsDashboardPage realEstateAgentsDashboardPage;

    /* RealEstateAgents instance */
    public static RealEstateAgentsPage realEstateAgentsPage;

    public void initializeAllPages() {
        // create instances of all pages and assign them to the variables
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
