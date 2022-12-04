Feature: Display menu options on Student Information module 

  @Regression @Sergey @AGT-4
  Scenario: menu option is being extended by clicking on Student Information
    Given a user is on the CTSMS login page "https://chroma.mexil.it/site/login" 
    When user logs in with username "general@teacher.com" and password "123456"
    And a user clicks on Student Information module
    Then the following modules display Student Details, Student Admission, Disabled Students, Bulk Delete, Student Categories, Student House, Disable Reason