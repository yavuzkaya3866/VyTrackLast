@logout
Feature: logout
  Scenario: user able to logout
    When the user is on the login page
    When the user logged in as "driver"
    Then the title contains "Dashboard"
    When user logged out
    Then verify that title is "Login"