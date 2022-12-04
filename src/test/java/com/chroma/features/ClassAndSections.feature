Feature: Class and Sections 

@Regression @David @AGT-11
Scenario: Class Page Displays 
    Given a user is on the CTSMS login page "https://chroma.mexil.it/site/login"
    When user logs in with username "general@teacher.com" and password "123456"
    Then the dashboard page is displayed
    And user clicks on class sections
    Then user is on the Class List Page and under the "Cyber Security" section, they will see "Penetration Testing/Ethical Hacking", "Networking Fundamentals", "Linux Fundamentals", and "CIA Triad" and under the "SDET" section user will see "Database Testing", "Testing Fundamentals", "SDLC Methodologies", "Selenium Test Automation", "Cucumber Fundamentals", "API Testing", "Git/GitHub", "Java 11 for Cool People", "Mobile Test Automation", and "Accessibility Testing"