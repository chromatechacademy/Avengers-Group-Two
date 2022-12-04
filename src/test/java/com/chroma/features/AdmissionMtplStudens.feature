Feature: Adding multiple students

    @Regression @Ulyana @AGT-19

    Scenario Outline: As a Chroma Tech Faculty member I want to be able to add multiple students in one session

        Given user is on a CTSMS home page "https://chroma.mexil.it/site/login"
        When user logsin "general@teacher.com" and password "123456"
        Then navigates to the Student Information drop down module
        And selects the Student Admission option

        Examples:
            | Header 1 | Header 2 | Header 3 |
            | Value 1  | Value 2  | Value 3  |
