Feature: Admitting a student

@Regression @Ruth @AGT-12
Scenario: I want to be able to admit a student 
    Given a user is on the CTSMS login page "https://chroma.mexil.it/site/login" 
    When user logs in with username "general@teacher.com" and password "123456" 
    Then user clicks "Student Information" 
    And clicks "Student Admission"
    Then Student Admission page displays

@Progression
Scenario: Admitting a student 
    Given a user is on the CTSMS login page "https://chroma.mexil.it/site/login" 
    When user logs in with username "general@teacher.com" and password "123456" 
    Then user clicks "Student Information" 
    And clicks "Student Admission"
    Then user enters student's credentials "Admission No", "Roll Number", "Class", "Section", "First Name", "Last Name", "gender", "Date of Birth", "Category", "Email", "Blood Group", "Mobile Number", "Height","Weight","Father Name", "Father Phone", "Father Occupation","Mother Name", "Mother Occupation", "Gaurdian", "Gaurdian Email", "Gaurdian Address"
    #And user sees admitted student page
                  
    
    

    
    

   