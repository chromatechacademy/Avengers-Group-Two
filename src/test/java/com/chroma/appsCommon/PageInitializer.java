package com.chroma.appsCommon;
import com.chroma.pages.IncomePage;
import com.chroma.pages.LoginPage;
import com.chroma.web.WebDriverUtils;

public class PageInitializer extends WebDriverUtils {

    // Instantiating LoginPage

    public static LoginPage loginPage;
    public static IncomePage incomePage;

    public void initializeAllPages() {

        loginPage = new LoginPage();
        incomePage = new IncomePage();
    }

}
