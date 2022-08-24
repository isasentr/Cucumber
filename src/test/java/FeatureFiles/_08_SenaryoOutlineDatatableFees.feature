#  Daha önceki Create a Fee, delete Fee Senaryosunu
#  Aşağıdaki 5 farklı değerler için çalıştırınız.
Feature: Datatable Functionality
Background:
Given Navigate to basgar
When Enter username and pasword and click login button
Then User should login successfully

  Scenario Outline: Create a Fee, delete Fee
And Click on the element in the left nav
| setupOne   |
| parameters |
| fees       |

And Click on the element in the Dialog
| addButton |

And User Sending the keys in Dialog Content
| nameInput     | <nameInput1>  |
| codeInput     | <codeInput1> |
| intcodeInput  | <intcodeInput1> |
| priorityInput | <priorityInput1>       |

And Click on the element in the Dialog
| saveButton |

And Success message should be displayed

And User Delete item from Dialog
  | <nameInput1>  |
And Success message should be displayed
    Examples:
      | nameInput1 | codeInput1 | intcodeInput1 | priorityInput1 |
      | aligfg        | 125453        | 648             | 124357           |
      | vefliff       | 546          | 5459            | 5405             |
      | kemfaldd      | 428          | 8486            | 8426             |
      | akfsıns       | 745          | 7473            | 7433             |
      | melffihs      | 1404         | 12404           | 10451            |
