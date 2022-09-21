Feature: Testing JDBC states

  Background:
    Given Navigate to basgar
    When Enter username and pasword and click login button
    Then User should login successfully

    Scenario: State testing with JDBC
      And Click on the element in the left nav
        | setupOne      |
        | parameters    |
        | states |
      Then Send the query the database "select * from States" and control match

