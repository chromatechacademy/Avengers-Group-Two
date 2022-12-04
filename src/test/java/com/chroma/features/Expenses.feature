Feature: Expense Module

  @Regression @David1 @AGT-7
  Scenario: Expense Module Displays
    Given a user is on the CTSMS login page "https://chroma.mexil.it/site/login"
    When user logs in with username "general@teacher.com" and password "123456"
    Then the dashboard page is displayed
    When user clicks on Expense Module
    Then user sees the Add Expense, Search Expense, and the Expense Head
    