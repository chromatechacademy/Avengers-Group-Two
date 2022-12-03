Feature: Fees Collection Module Displays
@Progression @David @AGT-5
  Scenario: Fees and Collection Module Displays
    Given a user is on the CTSMS login page "https://chroma.mexil.it/site/login"
    When user logs in with username "general@teacher.com" and password "123456"
    Then the dashboard page is displayed