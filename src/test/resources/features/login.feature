@regression
Feature: user should be able to login


  Scenario: login as a driver
    Given the user is on the login page
    When the user logged in as "sales manager"
    Then the title contains "Dashboard"

  @wip
  Scenario Outline: login as all users
    Given the user is on the login page
    When user enter "<username>" "<password>"

    Examples:
      | username        | password    |
      | user1           | UserUser123 |
      | salesmanager101 | UserUser123 |
      | storemanager85  | UserUser123 |



