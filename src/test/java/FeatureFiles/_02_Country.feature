Feature: Country Functionality

  Scenario: Create Country
    Given Navigate to basgar
    When Enter username and pasword and click login button
    Then User should login successfully
    And Navigate to country page
    When Create a country
    Then Success message should be displayed
