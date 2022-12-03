Feature: Admitting a student, finding the student that was admitted, and then deleting them

  @Regression @Ruth @AGT-12 @1
  Scenario: Admitting a student
    Given a user is on the CTSMS login page "https://chroma.mexil.it/site/login"
    When user logs in with username "general@teacher.com" and password "123456"
    Then user clicks "Student Information"
    And clicks "Student Admission"
    Then user enters student credentials "8983", "3", "SDET", "Database Testing", "Aretha", "Franklin", "Female", "08/22/1989", "Selenium", "studentchroma@gmail.com", "O+", "1234567890", "5'5", "120", "Abraham", "1234567890", "President", "Janet", "Singer", "Father", "studentchroma@gmail.com", "CandyLane ave"

  @Regression @Ruth @AGT-12 @2
  Scenario: Viewing registered student
    Given a user is on the CTSMS login page "https://chroma.mexil.it/site/login"
    When user logs in with username "general@teacher.com" and password "123456"
    Then user clicks "Student Information"
    And clicks on "Student Details"
    And user selects "SDET", selects "Database Testing", enters "Aretha"
    Then Select Criteria page displays and student is viewed

  @Progression @3
  Scenario: Faculty member deletes student 
    Given a user is on the CTSMS login page "https://chroma.mexil.it/site/login"
    When user logs in with username "general@teacher.com" and password "123456"
    Then user clicks "Student Information"
    And navigates to "Bulk Delete" 
    Then user selects "SDET", selects "Database Testing"
    Then user can delete student
    

    
    
