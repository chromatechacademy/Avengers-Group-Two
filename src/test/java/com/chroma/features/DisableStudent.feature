Feature: Disable Student file

  @Regression @Luis @AGT-15
  Scenario: Disabling Student file
    Given a user is on the CTSMS login page "https://chroma.mexil.it/site/login"
    When user logs in with username "general@teacher.com" and password "123456"
    Then user will select Student Information tab
    Then user will click on Student Details 
    Then will select "SDET" on the class drop down
    Then user will click on the search button
    Then user will select Jon Doe 
    Then user will click the Disable button
    Then will select "Very Loud" on the reason drop down
    And clicks Save button