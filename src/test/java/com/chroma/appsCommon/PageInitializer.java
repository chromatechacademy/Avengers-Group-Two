package com.chroma.appsCommon;
import com.chroma.pages.LoginPage;
import com.chroma.pages.StudentInfoPage;
import com.chroma.web.WebDriverUtils;

public class PageInitializer extends WebDriverUtils {

    // Instantiating LoginPage

    public static LoginPage loginPage;
    public static StudentInfoPage studentInfoPage;

    public void initializeAllPages() {

        loginPage = new LoginPage();
        studentInfoPage = new StudentInfoPage();
    }

}
