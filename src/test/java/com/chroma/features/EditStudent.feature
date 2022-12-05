Feature: Edit a student's information

    @Regression @Safwan @AGT-14
    Scenario: Editting a student's information
        Given a user is on the CTSMS login page "https://chroma.mexil.it/site/login"
        When user logs in with username "general@teacher.com" and password "123456"
        And the user clicks on the Student Details tab under the Student Information dropdown menu
        And selects the name of the "SDET" in the Class dropdown menu and clicks the search button
        When the user clicks on the Pencil icon for Kobe Bryant
        And changes the Email to "GOAT@Lakers.com" and clicks the Save button
        Then the student has been updated
        And selects the name of the "SDET" in the Class dropdown menu and clicks the search button
        And clicks on Kobe Bryant
        Then the change made can be confirmed