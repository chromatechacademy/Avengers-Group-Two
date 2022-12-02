Feature: Display menu options on Student Information module 

  @Regression @Sergey @AGT-4
  Scenario: menu option is being extended by clicking on Student Information
    Given a user is on the CTSMS login page "https://chroma.mexil.it/site/login" 
    When user logs in with username "general@teacher.com" and password "123456"
    And a user clicks on Student Information module
    Then the following modules display Student Details "//li[1]//ul[1]//li[1]//a[1]", Student Admission "//a[normalize-space()='Student Admission']", Disabled Students "//a[normalize-space()='Disabled Students']", Bulk Delete "//a[normalize-space()='Bulk Delete']", Student Categories "//a[normalize-space()='Student Categories']", Student House "//a[normalize-space()='Student House']", Disable Reason "//a[normalize-space()='Disable Reason']"    
      