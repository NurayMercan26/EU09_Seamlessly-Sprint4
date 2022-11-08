Feature: User should be on the related module

  Background: User should be on the dashboard page with valid credentials
    Given user is on the Seamlessly login page
    And user types valid username "Employee61"
    And user types valid password to "Employee123"
    Then user clicks on log in button and lands on the dashboard page

    Scenario: