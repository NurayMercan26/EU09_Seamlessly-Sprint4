@SEAMLES-2476
Feature: User should be able to log out successfully

  Background: User is on the dashboard page
    Given User is on the dashboard page
  @SEAMLES-2474
  Scenario: User should be able to log out and ends up in login page
    When  User clicks on profile menu button
    And User clicks on log out button
    Then User should end up in login page

  @SEAMLES-2475
  Scenario: User should not be go to home page again by clicking step back button after successfully logged out
    When  User clicks on profile menu button
    And User clicks on log out button
    And User should end up in login page
    And User clicks on the step back button
    Then User should be still on the login page