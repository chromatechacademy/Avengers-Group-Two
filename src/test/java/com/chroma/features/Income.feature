
Feature: Income testing 
   
@Regression @Mila @AGT6
 Scenario: User with valid credentials cheks income module
    Given user is on dashboard page "https://chroma.mexil.it/site/login"
    When user with valid credentials logs in with username "general@teacher.com" and password "123456"
    When user clicks on Income button
    Then user should be able to see Income option, Add Income, Search Income, Income Head










    