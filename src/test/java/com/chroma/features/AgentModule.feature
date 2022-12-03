Feature: Agent Module Text

  @Regression @joyce @AGT-44
  Scenario Outline: In Agents view displays
      Given a user is on the appropriate login page <Website>
      When user logs in with correct username <Username> and password <Password>
      When user clicks the text agents from the dashboard
      Then agents page displays
      Examples: 
      | Website                                                                                 | Username         | Password |
      | "https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/admin/login.php" | "admin@mexil.it" | "123456" |
