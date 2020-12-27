@allUser @regression
Feature: All user can able to log in

  Scenario Outline: Each user can log in
    Given user is on the login page
    And verify that title is "Login"
    When user enters "<user>" "<username>" "<password>"
    Then verify that title is "<title>"



    Examples:
      | user          | username        | password    | title     |
      | driver        | user41          | UserUser123 | Dashboard |
      | store manager | storemanager78  | UserUser123 | Dashboard |
      | sales manager | salesmanager142 | UserUser123 | Dashboard |
