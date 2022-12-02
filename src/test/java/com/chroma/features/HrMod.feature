Feature:Human Resource Module display
Description: This feature file shows the contains display on Hr cucumber Scenarios

@Progression @Luis @AGT-9
Scenario: Human Resource Module to display
    Given a user is on the CTSMS login page "https://chroma.mexil.it/site/login" 
    When user logs in with username "general@teacher.com" and password "123456"
    Then User will click on Human Resource 
    Then user will be able to see links displayed "Staff Directory", "Staff Attendance", "Payroll", "Approve Leave Request", "Apply Leave", "Teachers Rating","Department","Designation,"

