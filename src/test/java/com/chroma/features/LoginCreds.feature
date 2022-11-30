Feature: Login with valid credentials

@Progression
Scenario: I want to be able to login with valid credentials
    Given a user is on the CTSMS login page "https://chroma.mexil.it/site/login" 
    When user logs in with username "general@teacher.com" and password "123456"
    Then the home page is displayed

