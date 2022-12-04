Feature: Fees Collection Module Displays
@Regression @David @AGT-5
  Scenario: Fees and Collection Module Displays
    Given a user is on the CTSMS login page "https://chroma.mexil.it/site/login"
    When user logs in with username "general@teacher.com" and password "123456"
    Then the dashboard page is displayed
    Then user sees the links "Collect Fees", "Search Fees Payment", "Search Due Fees", "Fees Master", "Fees Group", "Fees Type", "Fees Discount", "Fees Carry Forward", "Fees Reminder"