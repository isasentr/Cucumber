Feature: ApachePOI Citizen Functionality

  Background:
    Given Navigate to basgar
    When Enter username and pasword and click login button
    Then User should login successfully
    And Navigate to Citizenship page

  Scenario: Create  citizenship from Excel
    When  User Create citizenship with ApachePOI

    Then  User Delete citizenship with ApachePOI



