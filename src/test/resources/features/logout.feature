@logout
Feature: logout
  Scenario: user able to logout
    When user is on the login page
    And the "driver" enters info
    Then verify that title is "Dashboard"
    And verify that subtitle is "Quick Launchpad"
    When user logged out
    Then verify that title is "Login"