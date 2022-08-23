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
      | nameInput | isq9   |
      | codeInput | 123q66 |

    And Click on the element in the Dialog
      | saveButton |

    And Success message should be displayed

    And User Delete item from Dialog
      | isq9 |

    And Success message should be displayed


  Scenario: Create a Nationality

    And Click on the element in the left nav
      | setupOne      |
      | parameters    |
      | Nationalities |

    And Click on the element in the Dialog
      | addButton |

    And User Sending the keys in Dialog Content
      | nameInput | javqa15 |

    And Click on the element in the Dialog
      | saveButton |

    And Success message should be displayed

    And User Delete item from Dialog
      | javqa15 |

    And Success message should be displayed

  Scenario: Create a Fee, delete Fee

    #    Senaryo Outline da verilen değerler için tüm senaryo her satır kadar tekrar çalıştırılıyordu.
    #    DataTable da ise, sadece ilgili step için toplu veri gönderme imkanı oluşuyor.
    #  Nurhayat String Class, kaymakçı tablo yüklenmesini, melike search btn clickable

    And Click on the element in the left nav
      | setupOne   |
      | parameters |
      | fees       |

    And Click on the element in the Dialog
      | addButton |

    And User Sending the keys in Dialog Content
      | nameInput     | ajava  |
      | codeInput     | selenium |
      | intcodeInput  | 123 |
      | priorityInput | 2251       |

    And Click on the element in the Dialog
      | saveButton |

    And Success message should be displayed

    And User Delete item from Dialog
      | ajava |

    And Success message should be displayed