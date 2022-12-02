Feature: Login to the Real Estate portal with valid credentials

    @Regression @Safwan @AGT-41
    Scenario Outline: Logging into ChromaTech's Real Estate site
        Given a user is on the appropriate login page <Website>
        When user logs in with correct username <Username> and password <Password>
        Then the real estate dashboard page is displayed
        Examples:
            | Website                                                                                 | Username              | Password |
            | "https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/admin/login.php" | "admin@mexil.it"      | "123456" |
            | "https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/login.php"       | "general@teacher.com" | "123456" |