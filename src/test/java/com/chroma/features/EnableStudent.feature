Feature: Enabling a Disabled Student

  @Regression @Luis @AGT-16
  Scenario: Enabling a Student file
    Given a user is on the CTSMS login page "https://chroma.mexil.it/site/login"
    When user logs in with username "general@teacher.com" and password "123456"
    Then user will select Student Information tab
    Then will click on Disabled Students
    Then will select "SDET" on the class drop down
    Then user will click on the search button
    Then user will select Jon Doe
    Then user will click Enabling button
