Feature: Datatable Functionality

  Background:
    Given Navigate to basgar
    When Enter username and pasword and click login button
    Then User should login successfully

  Scenario: Create Country
    And Click on the element in the left nav
      | setupOne   |
      | parameters |
      | countries  |

    And Click on the element in the Dialog
      | addButton |

    And User Sending the keys in Dialog Content
      | nameInput | isajava15855   |
      | codeInput | 123456 |

    And Click on the element in the Dialog
      | saveButton |

    And Success message should be displayed

    And User Delete item from Dialog
     | isajava15855 |

    And Success message should be displayed


  Scenario: Create a Nationality

    And Click on the element in the left nav
      | setupOne      |
      | parameters    |
      | Nationalities |

    And Click on the element in the Dialog
      | addButton |

    And User Sending the keys in Dialog Content
      | nameInput | java1058|

    And Click on the element in the Dialog
      | saveButton |

    And Success message should be displayed

    And User Delete item from Dialog
      |  java1058 |

    And Success message should be displayed

  Scenario: Create a Fee, delete Fee
    #    Senaryo Outline da verilen değerler için tüm senaryo her satır kadar tekrar çalıştırılıyordu.
    #    DataTable da ise, sadece ilgili step için toplu veri gönderme imkanı oluşuyor.
    And Click on the element in the left nav
      | setupOne      |
      | parameters    |
      | fees |

    And Click on the element in the Dialog
      | addButton |

    And User Sending the keys in Dialog Content
      | nameInput | isa5|
      | codeInput | 1234556f|
      | intcodeInput | 1235456f|
      | priorityInput | 51|

    And Click on the element in the Dialog
      | saveButton |

    And Success message should be displayed

    And User Delete item from Dialog
      |  isa5 |

    And Success message should be displayed