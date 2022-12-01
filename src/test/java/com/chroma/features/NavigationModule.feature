Feature: Modules to be displayed on portal
Description: This feature file contains display on protal cucumber Scenarios

  @Progression @Luis @AGT-3
  Scenario: Portal display
    Given a user is on the CTSMS login page "https://chroma.mexil.it/site/login"
    When user logs in with username "general@teacher.com" and password "123456"
    Then user is able to see links displayed "Student Information", "Fees Collection", "Income", "Expenses", "Academics", "Human Resource","Homework","Reports"
