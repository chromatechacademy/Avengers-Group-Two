Feature: Create and delete student category 

  @Progression @Sergey @AGT-20
  Scenario: New category added ti the Category List and then deleted
    Given a user is on the CTSMS login page "https://chroma.mexil.it/site/login" 
    When user logs in with username "general@teacher.com" and password "123456"
    And user clicks on Student Information and Student Categories modules
    And user enters "New Category" in the Category textbox and clicks on Save
    And "New Category" added to the Category List
    Then user clicks on delete and deleted New Category from the Category List