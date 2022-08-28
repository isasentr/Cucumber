#  Bir önceki Exam Giriş Senaryosunu
#  Aşağıdaki değerler için çalıştırınız.
#
#| ExamName        | AcademicPeriodOption      | GradeLevelOption |
#| Math exam is1   | academicPeriod2              | gradeLevel4  |
#| IT exam is1     | academicPeriod2              | gradeLevel2  |
#| Oracle exam is1 | academicPeriod2              | gradeLevel3  |
#| Math exam  is1  | academicPeriod2              | gradeLevel1  |

Feature: Entrace Exam Functionality
  Background:
    Given Navigate to basgar
    When Enter username and pasword and click login button
    Then User should login successfully

  Scenario Outline: Enter and Delete exam points
    And Click on the element in the left nav
      | entraceExam      |
      | setupTwo         |
      | entraceExamPoint |

    And Click on the element in the Dialog
      | addButton |

    And User Sending the keys in Dialog Content
      | nameInput | <ExamName> |

    And Click on the element in the Form Content
      | academicPeriod  |
      | <AcademicPeriodOption> |
      | gradeLevel      |
      | <GradeLevelOption>     |

#    todo: akademik period ve gradelevel tıklama problemi
    And Click on the element in the Dialog
      | saveButton |
    Then Success message should be displayed

    And Click on the element in the left nav
      | entraceExam      |
      | setupTwo         |
      | entraceExamPoint |

    And User Delete item from Dialog
      | <ExamName> |

    And Success message should be displayed
    Examples:
      | ExamName         | AcademicPeriodOption | GradeLevelOption |
      | Math exam ighhts1  | academicPeriod1      | gradeLevel1      |
      | IT exam 54     | academicPeriod2      | gradeLevel2      |
      | IT exam ighhsj1     | academicPeriod2      | gradeLevel3      |
      | Oracle exam ihghhs1 | academicPeriod1      | gradeLevel4      |
      | Oracle exam ighjhs1 | academicPeriod1      | gradeLevel5      |

