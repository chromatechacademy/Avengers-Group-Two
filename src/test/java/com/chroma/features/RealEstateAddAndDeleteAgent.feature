Feature: Add and delete an agent in the chroma tech real estate site

    @Regression @Safwan @AGT-45 @AGT-46
    Scenario: Adding and deleting an agent in the chroma tech real estate site
        Given a user is on the appropriate login page "https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/admin/login.php"
        When user logs in with correct username "admin@mexil.it" and password "123456"
        And clicks on Agents and clicks on Add Now
        And enters First Name "lol", Last Name "Leedlelee", Email "lol@league.com", Contact Number "123-456-7890", Password "1234567890", retypes password, clicks Save and clicks Back
        When the user clicks Active on the left
        Then the user will see "lol Leedlelee" added as an agent
        When the user clicks on the three dots next to the active student lol Leedlelee and clicks Delete
        And the user clicks on Inactive on the left, clicks on the three dots next to the inactive student lol Leedlelee and clicks Delete Permanently
        Then when the user clicks on All Agents on the left the student "lol@league.com" will not be shown