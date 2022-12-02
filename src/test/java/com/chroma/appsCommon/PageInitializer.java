package com.chroma.appsCommon;
import com.chroma.pages.LoginPage;
import com.chroma.pages.RealEstateLoginPage;
import com.chroma.pages.StudentAdmissionsPage;
import com.chroma.web.WebDriverUtils;

public class PageInitializer extends WebDriverUtils {

    public static LoginPage loginPage;
    public static StudentAdmissionsPage studentAdmissionsPage;
    public static RealEstateLoginPage realEstateLoginPage;

    public void initializeAllPages() {

        loginPage = new LoginPage();
        realEstateLoginPage = new RealEstateLoginPage();
        studentAdmissionsPage = new StudentAdmissionsPage();

    }

}
