Feature: Adding multiple students

    @Progression @Ulyana @AGT-19

    Scenario Outline: As a Chroma Tech Faculty member I want to be able to add multiple students in one session

        Given user is on a CTSMS home page "https://chroma.mexil.it/site/login"
        When user logsin "general@teacher.com" and password "123456"
        Then navigates to the Student Information dropdown module
        And selects the Student Admission option
        And  enters data in <Admission_No>
        And user enters number in <Roll_Number>
        And user enters data in <First_Name>
        And user enters data in <Last_Name>
        And user enters data in "<Date_Of_Birth>"
        And user enters <Email> in Emailbox
        And user makes selection in <Class> dropdown
        And user makes selection in a "<Section>"  dropdown
        And user makes selection  in a <Gender>  dropdown
        And user makes selection to a <Category> dropdown
        And user selects blood type in a "<Blood_Group>" dropdown
        And user drags <Photo> in a box
        And user enters <Mobile Number> in a box
        And user enters <Height> in a box
        And user enters students <Weight>
        And selects <Gardian> in the checkbox
        And user enters "<Guardian Name>"
        And user enters the "<Guardian Phone>" in a phone box
        And clicks SAVE

        Examples:
            | Admission_No | Roll_Number | First_Name | Last_Name | Date_Of_Birth | Email        | Class | Section    | Gender | Category | Blood_Group | Photo | Mobile Number | Height | Weight | Gardian | Guardian Name | Guardian Phone |
            | 9002         | 34          | Al         | Smith     | 10/10/1980    | Al@gmail.com | SDET  | Git/GitHub | male   | Moe      | A+          | Al    | 845000        | 5.5    | 55kl   | Father  | dad           | work           |
            | 9003         | 78          | Bo         | Smith     | 10/11/1980    | Bo@gmail.com | SDET  | Git/GitHub | male   | Moe      | A+          | Bo    | 845000        | 5.5    | 55kl   | Father  | dad           | work           |
            | 9004         | 100         | Ck         | Smith     | 10/12/1980    | Ck@gmail.com | SDET  | Git/GitHub | male   | Moe      | A+          | Ck    | 845000        | 5.5    | 55kl   | Father  | dad           | work           |


