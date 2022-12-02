package com.chroma.appsCommon;
import com.chroma.pages.LoginPage;
import com.chroma.pages.StudentAdmissionsPage;
import com.chroma.web.WebDriverUtils;

public class PageInitializer extends WebDriverUtils {

    public static LoginPage loginPage;
    public static StudentAdmissionsPage studentAdmissionsPage;

    public void initializeAllPages() {

        loginPage = new LoginPage();
        studentAdmissionsPage = new StudentAdmissionsPage();

    }

}
