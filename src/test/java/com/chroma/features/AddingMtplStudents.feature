Feature: Adding multiple students


    @Progression @Ulyana @AGT-19

    Scenario Outline: : As a Chroma Tech Faculty member I want to be able to add multiple students in one session
        Given a user is on the login page "https://chroma.mexil.it/site/login"
        When logs in with username "general@teacher.com" and password "123456"
        Then user navigates to Student Information dropdown
        And user clicks on Student Admition
        And user enters data in <Admission No *>
        And user enters number in <Roll Number>
        And user enters data in <First Name *>
        And user enters data in <Last Name>
        And user enters data in <Date of Birth *>
        And user enters data in <Email>
        And user makes selection in Class dropdown
        And user makes selection in a Section  dropdown
        And user makes selection  in a Gender  dropdown
        And user makes selection in a Category dropdown
        And user selects blood type in a Blood Group dropdown

        Examples:
            | Admission No * | Roll Number | First Name * | Last Name | Date of Birth * | Email        |
            | 12             | 34          | Al           | Smith     | 10/10/1980      | Al@gmail.com |
            | 56             | 78          | Bo           | Smith     | 10/11/1980      | Bo@gmail.com |
            | 90             | 100         | Ck           | Smith     | 10/12/1980      | Ck@gmail.com |

















