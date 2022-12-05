Feature: Check for add homework module in CTSMS

@Regression @Safwan @AGT-10
Scenario: I want to be able to have the option of adding homework
    Given a user is on the CTSMS login page "https://chroma.mexil.it/site/login" 
    When user logs in with username "general@teacher.com" and password "123456"
    And user clicks on the Homework dropdown menu option
    Then the "Add Homework" option is displayed
