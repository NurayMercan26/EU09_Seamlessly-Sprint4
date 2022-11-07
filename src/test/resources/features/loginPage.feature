@SEAMLES-2472
Feature: user can login with valid credentials

  Background: user is on the Seamlessly login page
    Given user is on the Seamlessly login page


  @SEAMLES-2428
  Scenario Outline: user should be able to login successfully with valid credentials
    When user types valid username "<UsernameOrEmail>"
    And user types valid password to "<password>"
    And user clicks on log in button or press enter "<buttonType>"
    Then user should see the dashboard

    Examples:
      | UsernameOrEmail | password    | buttonType |
      | Employee31      | Employee123 | click      |
      | Employee131     | Employee123 | Enter      |
      | Employee151     | Employee123 |            |


  @SEAMLES-2429
  Scenario Outline: User can not login with any invalid credentials
    When User types invalid username "<UsernameOrEmail>"
    And User types invalid password to "<password>"
    And user clicks on log in button or press enter "<buttonType>"
    Then user should see a warning message "<expectedMessage>"

    Examples:
      | UsernameOrEmail | password     | buttonType | expectedMessage                     |
      | Employee31      | Employee1234 | Enter      | Wrong username or password.         |
      ##valid username, invalid password
      | Employee1311    | Employee123  | Click      | Wrong username or password.         |
      ##invalid username, valid password
      | employeE31      | Employee123  |            | Wrong username or password warning. |
      ##case insensitive valid username



  @SEAMLES-2430
  Scenario Outline: User should see "Please fill out this field" message if password or username is empty
    When User types empty username "<UsernameOrEmail>"
    And User types empty password to "<password>"
    And user clicks on log in button or press enter "<buttonType>"
    Then Verify that user sees "<errorOrAlertMessage>"

    Examples:
      | UsernameOrEmail | password    | errorOrAlertMessage         | buttonType |
      |                 | Employee123 | Please fill out this field. | Enter      |
      ##empty username, valid password
      | Employee31      |             | Please fill out this field. | click      |
      ##valid username, empty password

  @SEAMLES-2457
  Scenario: User should see password in a form of dots by default
    When User types any value to password "input"
    Then Verify that the password is invisible

  @SEAMLES-2461
  Scenario: User should see the password explicitly if needed
    When User types any value to password "input"
    And User clicks on the visible button next to the password placeholder
    Then Verify that the password is visible

  @SEAMLES-2463
  Scenario: User should see the "Forgot password?" link on the login page and
  should see the "Reset Password" button on the next page after clicking on forget password link
    When User should see the Forgot Password link
    And User clicks on the Forgot Password link
    Then User should see the Reset Password button

  @SEAMLES-2465
  Scenario: User should see valid placeholders on Username and Password fields
    When  Verify that Username placeholder is displayed as expected
    Then  Verify that Password placeholder is displayed as expected
