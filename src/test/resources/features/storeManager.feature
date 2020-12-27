@regression @storeManager
  Feature:  As a store manager and Sales manager I should be able to create Vehicle
    Background:
      Given the user is on the login page
      When the user logged in as "store manager"
      Then the title contains "Dashboard"

    Scenario:Store Manager Options

      Then the user should see following options
        | Dashboard          |
        | Fleet              |
        | Customers          |
        | Sales              |
        | Activities         |
        | Marketing          |
        | Reports & Segments |
        | System             |

