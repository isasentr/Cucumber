Feature: Country Multi Scenario


  Background:     #  background üst extend olarak çalışıyor
    Given Navigate to basgar
    When Enter username and pasword and click login button
    Then User should login successfully
    And Navigate to country page
  @Regression
  @SmokeTest
  Scenario: Create a country
    When Create a country
    Then Success message should be displayed
  @Regression
    Scenario: Create a Country parameter data
      When Create a country name as "isayen5i1hi" code as "co5degşl1"
      Then Success message should be displayed