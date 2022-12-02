Feature: Expense Module
  @Regression @David @AGT-7
  Scenario: Expense Module Displays
    Given a user is on the CTSMS login page "https://chroma.mexil.it/site/login"
    When user logs in with username "general@teacher.com" and password "123456"
    Then the dashboard page is displayed
    When user clicks on Expense Module "//span[normalize-space()='Expenses']"
    Then user sees the Add Expense Module "//body[1]/div[1]/aside[1]/div[1]/section[1]/ul[2]/li[4]/ul[1]/li[1]/a[1]", Search Expense "//a[normalize-space()='Search Expense']", and the Expense Head "//a[normalize-space()='Expense Head']"
    