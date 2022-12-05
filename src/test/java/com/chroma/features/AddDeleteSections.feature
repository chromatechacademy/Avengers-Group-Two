Feature: Chroma Tech Faculty member will be able to add and delect sections and add and delete classes

  @Regression @Ruth @AGT-17
  Scenario: Faculty member adds and deletes section
    Given a user is on the CTSMS login page "https://chroma.mexil.it/site/login"
    When user logs in with username "general@teacher.com" and password "123456"
    Then user navigates to Academics module
    Then user navigates to sections
    When user enters "Bag of Money"
    Then user clicks and deletes Bag of Money

  @Regression @Ruth @AGT-18
  Scenario: Faculty member adds and deletes class
    Given a user is on the CTSMS login page "https://chroma.mexil.it/site/login"
    When user logs in with username "general@teacher.com" and password "123456"
    Then user navigates to Academics module
    Then user navigates to class
    Then user will enter "Automation Is Extremely Captivating" under Ruth section
    Then user can delete class
