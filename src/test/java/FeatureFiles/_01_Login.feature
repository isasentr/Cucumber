#Senaryo ;
#  1-siteyi açınız.
#  2-username ve password u gönderin ve login butonuna tıklayınız.
#  3-Login olduğunu doğrulayın.

#  Sonra yukarıdaki senaryoyu Gherkin dilinde yazdık.Ability:

Feature: Login Functionality
  @SmokeTest
  @Regression
  Scenario: Login with valid username ve password

    Given Navigate to basgar
      #Given Navigate to basgar  -1 adım ve bu adımın bir karşılığı olmalı method
    When Enter username and pasword and click login button
      #When Enter username and pasword and click login button  -1 adım
    Then User should login successfully
      #Then User should login successfully -1 adım
