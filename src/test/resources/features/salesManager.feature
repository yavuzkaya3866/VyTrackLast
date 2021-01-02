@regression
Feature: Sales Manager Page


  Background:
  Given the user is on the login page
  Then verify that title is "Login"
  And the user logged in as "sales manager"
  Then verify that title is "Dashboard"

  Scenario: Sales Manager login

    And  verify that title is "Dashboard"
    Then the user should see following options
      | Dashboard          |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |

    Scenario: Three Line Menu
      And user clicks on "three lines"
      And the user should see threeLine options
      | History     |
      | Favorites   |
      | Most Viewed |
  @sales
    Scenario: 1- As a store manager and Sales manager I should be able to create Vehicle
        When user navigate to "Fleet" and "Vehicles"
        Then verify that title is "All - Car - Entities - System - Car - Entities - System"

    Scenario: 2- Verify that Store manager or sales manager should be able to create car
      When user navigate to "Fleet" and "Vehicles"
      Then verify that title is "All - Car - Entities - System - Car - Entities - System"
      When user create a new car

    Scenario: 3- Verify that Store manager or sales manager should be able to cancel car.
      When user navigate to "Fleet" and "Vehicles"
      Then verify that title is "All - Car - Entities - System - Car - Entities - System"
      When user create a car and cancel creating the car
      Then verify that title is "Dashboard"

  Scenario: 4. Verify that Store manager or sales manager should be able to add Vehicle Model
    When user navigate to "Fleet" and "Vehicles Model"
    Then verify that title is "All - Vehicles Model - Entities - System - Car - Entities - System"
    #And user push the Create Vehicles Model button and verify by title






