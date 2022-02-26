Feature: US1005 Positiv Login Test

  @hotel
  Scenario: TC08 Positive Login
    
    Given kullanici "HMCUrl" sayfasina gider
    And login linkine tıklar
    Then kullanıcı adı olarak "HMCValidUsername" girer
    And password olarak "HMCValidPassword" girer
    And login butonuna basar
    Then giris yapıldığını test eder
    And sayfayi kapatir