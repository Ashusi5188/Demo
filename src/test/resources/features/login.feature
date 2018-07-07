Feature:Login feature
  Scenario: Valid login
    Given User is at login page of facebook
    When User enters email and password
    And User clicks on login button
    Then User navigates to Home page of facebook
    And User closes application
