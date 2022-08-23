Feature: Entrace Exam Functionality
#1 sınav girişi yapıp
#  sonrasında silmesini yapınız

  Background:
    Given Navigate to basgar
    When Enter username and pasword and click login button
    Then User should login successfully

  Scenario: Enter and Delete exam points
    And Click on the element in the left nav
      | entraceExam      |
      | setupTwo         |
      | entraceExamPoint |

    And Click on the element in the Dialog
      | addButton |

    And User Sending the keys in Dialog Content
      | nameInput | isa |

    And Click on the element in the Form Content
      | academicPeriod  |
      | academicPeriod1 |
      | gradeLevel      |
      | gradeLevel2     |
      | saveButton |

#    todo: akademik period ve gradelevel tıklama problemi


    Then Success message should be displayed