package com.chroma.appsCommon;
import com.chroma.pages.DashboardHomeworkPage;
import com.chroma.pages.DashboardStudentInformationPage;
import com.chroma.pages.DashboardPageAcademics;
import com.chroma.pages.FeesCollectionPage;
import com.chroma.pages.AgentModulePage;
import com.chroma.pages.DashboardGraphPage;
import com.chroma.pages.LoginPage;
<<<<<<< HEAD
import com.chroma.pages.StudentInfoPage;
=======
import com.chroma.pages.RealEstateAgentsDashboardPage;
import com.chroma.pages.RealEstateAgentsPage;
>>>>>>> 95d2e73483647e4b4d316a80ce23572950e18273
import com.chroma.pages.RealEstateLoginPage;
import com.chroma.pages.StudentDetailsPage;
import com.chroma.pages.EditStudentPage;
import com.chroma.pages.StudentAdmissionsPage;
import com.chroma.pages.SectionsPage;
import com.chroma.web.WebDriverUtils;

public class PageInitializer extends WebDriverUtils {
    /* This is the CTSMS Login Page */
    public static LoginPage loginPage;
<<<<<<< HEAD
    
    public static StudentInfoPage studentInfoPage;
=======

    /* This is the CTSMS Student Admissions Page Locator */
    public static StudentAdmissionsPage studentAdmissionsPage;

    /* This is the Real Estate Login Page Locator */
>>>>>>> 95d2e73483647e4b4d316a80ce23572950e18273
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

<<<<<<< HEAD
=======
    public static DashboardHomeworkPage dashboardHomeworkPage;

    public static DashboardStudentInformationPage dashboardStudentInformationPage;
    public static StudentDetailsPage studentDetailsPage;
    public static EditStudentPage editStudentPage;

    public static RealEstateAgentsDashboardPage realEstateAgentsDashboardPage;
    public static RealEstateAgentsPage realEstateAgentsPage;
>>>>>>> 95d2e73483647e4b4d316a80ce23572950e18273

    public void initializeAllPages() {

        loginPage = new LoginPage();
<<<<<<< HEAD
        
        studentInfoPage = new StudentInfoPage();
=======

>>>>>>> 95d2e73483647e4b4d316a80ce23572950e18273
        realEstateLoginPage = new RealEstateLoginPage();
        dashboardPageAcademics = new DashboardPageAcademics();
        sectionsPage = new SectionsPage();
        feesCollectionPage = new FeesCollectionPage();
        dashboardGraphPage = new DashboardGraphPage();
        agentModulePage = new AgentModulePage();
<<<<<<< HEAD
        
=======
        studentAdmissionsPage = new StudentAdmissionsPage();

        dashboardHomeworkPage = new DashboardHomeworkPage();

        dashboardStudentInformationPage = new DashboardStudentInformationPage();
        studentDetailsPage = new StudentDetailsPage();
        editStudentPage = new EditStudentPage();

        realEstateAgentsDashboardPage = new RealEstateAgentsDashboardPage();
        realEstateAgentsPage = new RealEstateAgentsPage();
>>>>>>> 95d2e73483647e4b4d316a80ce23572950e18273
    }

}
