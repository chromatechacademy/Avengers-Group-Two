Feature: Dashboard Graph Text


@Progression @joyce @AGT-43
Scenario Outline: In Admin view the graph displays with the header text overview
Given a user is on the appropriate login page <Website>
When user logs in with correct username <Username> and password <Password>
When Admin clicks on button Agents Graph
And graph displays with header text Reserved by Agents
And Admin user clicks on button overview
Then the graph displays with the header text Properties Overview
Examples:
| Website                                                                                 | Username              | Password |
| "https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/admin/login.php" | "admin@mexil.it"      | "123456" |

