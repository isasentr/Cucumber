#  Employee menusu için Create-Exist-Delete bölümleri olan Senaryoyu yazınız
#  Daha sonra aynı senaryoru 5 farklı degerler için çalıştırınız.
Feature: Datatable Functionality

  Background:
    Given Navigate to basgar
    When Enter username and pasword and click login button
    Then User should login successfully

  Scenario Outline: Create Employee,Create-Exist-Delete
    And Click on the element in the left nav
      | setupOne       |
      | humanResources |
      | employees      |

    And Click on the element in the Dialog
      | addButton |

    And User Sending the keys in Dialog Content
      | firstname  | <firstname1>  |
      | lastName   | <lastName1>   |
      | employeeId | <employeeId1> |


    And Click on the element in the Dialog
      | gender          |
      | male      |
      | employeeType    |
      | teacher |
      | documentType |
      | passport |

    And User Sending the keys in Dialog Content
      | documentNumber | <documentNumber1> |


#
#    And Click on the element in the Dialog
#      | saveButton |
    Examples:
      | firstname1 | lastName1 | employeeId1 | documentNumber1 |
      | alis       | velis          | 123               |123654|