Feature: Disable Student file

  @Progression @Luis @AGT-15
  Scenario: Disabling Student file
    Given a user is on the CTSMS login page "https://chroma.mexil.it/site/login"
    When user logs in with username "general@teacher.com" and password "123456"
    Then user will select Student Information tab
    Then user will click on Student Details 
    Then will select SDET on the class drop down