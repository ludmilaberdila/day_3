Feature: testing demoBlizer

  @signIn
  Scenario Outline: verify login functionality
    Given login web url "<url>"
    And user enters "<username>" and "<password>"
    When user clicks on login button
    Then verify user is logged in

    Examples: provide user name and password
      | url                                  | username | password   |
      | https://www.demoblaze.com/index.html | ludmila1 | ludmila12  |
      | https://www.demoblaze.com/index.html | ludmila2 | ludmila123 |
      | https://www.demoblaze.com/index.html | ludmila3 | ludmila321 |

