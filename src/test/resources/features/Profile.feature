Feature: User should be on the related module

  Background: User should be on the dashboard page with valid credentials
    Given user is on the Seamlessly login page
    And user types valid username "Employee111"
    And user types valid password to "Employee123"
    Then user clicks on log in button and lands on the dashboard page

  @wip
  Scenario: User is on the contacts module
    When User clicks on "setting profile" module
    And user go to profile info page
    Then user see the profile page in URL settings


@wip
  Scenario:  User can see at least following titles inside personal info under Profile Settings page;
    When user see fullname "Nuray Mercan"
    And user see email "nuraymercan25@gmail.com"
    And user see phone number "05064251472"
    Then user see verify that  titles inside personal info


@wip
  Scenario: User can change "Full name" info under profile Settings page
    When user go to profile info page
    And user clear old full name
    And user change  full name "HoneyBee"
    Then user see verify that  new full name


@wip
  Scenario: User can make "Phone number" info as private under Profile Settings page
    When user click private button on phone number button
    And user write phone number
    Then user see verify that phone number info as private under Profile Settings page

@wip
  Scenario: User can see the current local time under the Local dropdown
    When user select local time under the local dropdown
    Then user see verify that current local time "Turkish" under the Local dropdown