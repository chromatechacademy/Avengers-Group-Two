Feature: Academics Module

  @Regression @David @AGT-8
  Scenario: Academics Module Displays 
    Given a user is on the CTSMS login page "https://chroma.mexil.it/site/login"
    When user logs in with username "general@teacher.com" and password "123456"
    Then the dashboard page is displayed
    When user clicks on Academics Module
    Then Academics Module links are displayed "Class Timetable", "Teachers Timetable", "Assign Class Teacher", "Promote Students", "Subject Group", "Subjects", "Class", and "Sections"