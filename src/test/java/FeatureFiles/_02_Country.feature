Feature: Country Functionality
Background:
  Given Navigate to basgar
  When Enter username and pasword and click login button
  Then User should login successfully
  @SmokeTest
#  @Regression

  Scenario: Create Country
    And Navigate to country page
    When Create a country
    Then Success message should be displayed
