Feature: Citizenship with Scenario Outline

  Background:
    Given Navigate to basgar
    When Enter username and pasword and click login button
    Then User should login successfully
    And Navigate to Citizenship page

#  Scenario: Citizenship create
#    When User a Citizenship name as "vatan51" short name as "vat1"
#    Then Success message should be displayed
#
#    When User a Citizenship name as "vatan51" short name as "vat1"
#    Then Already exist message should be displayed
#    And Click on close button

#  Data provider
  Scenario Outline: Citizenship create
    When User a Citizenship name as "<CitizenshipName>" short name as "<ShortName>"
    Then Success message should be displayed

    When User a Citizenship name as "<CitizenshipName>" short name as "<ShortName>"
    Then Already exist message should be displayed
    And Click on close button
    Examples:
      | CitizenshipName | ShortName |
      | isa1            | ali1      |
      | isa12f           | ali12f     |
      | isa13d           | ali13s     |
      | isa14 s          | ali14  e   |
