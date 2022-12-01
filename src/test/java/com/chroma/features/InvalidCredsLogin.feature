Feature: Security mechanism to prevent invalid credentials login


    @Progression @Ulyana @AGT-2

    Scenario: A user should not be able to login with invalid credentials.
        Given user is on the CTSMS login page "https://chroma.mexil.it/site/login"
        When user logs in with invalid username "someone@teacher.com" and password "12345"
        Then Invalid Username or Password message displays
