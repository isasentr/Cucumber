Feature: Citizenship with Scenario Outline

  Background:
    Given Navigate to basgar
    When Enter username and pasword and click login button
    Then User should login successfully
    And Navigate to Citizenship page

#    Alernatif yol data providera karşı
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

    When  User Delete the "<CitizenshipName>"
    Then Success message should be displayed

    Examples:
      | CitizenshipName | ShortName |
      | isa4155           | ali554     |
      | isa14225f         | ali8125f   |
      | isa134d65         | ali1953s   |
      | isa145445         | ali1478e   |
