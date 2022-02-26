Feature: US1006 Negative Login Test

  Scenario: TC09 yanlis user name dogru sifre
    Given kullanici "HMCUrl" sayfasina gider
    Then login linkine tıklar
    And kullanıcı adı olarak "HMCWrongUsername" girer
    And password olarak "HMCValidPassword" girer
    Then login butonuna basar
    And giris yapılamadığını test eder
    And sayfayi kapatir

    Scenario: TC10 dogru username yanlıs sifre
      Given kullanici "HMCUrl" sayfasina gider
      Then login linkine tıklar
      And kullanıcı adı olarak "HMCValidUsername" girer
      And password olarak "HMCWrongPassword" girer
      Then login butonuna basar
      And giris yapılamadığını test eder
      And sayfayi kapatir

    Scenario: TC11 yanlis username ve yanlis password girer
      Given kullanici "HMCUrl" sayfasina gider
      Then login linkine tıklar
      And kullanıcı adı olarak "HMCWrongUsername" girer
      And password olarak "HMCWrongPassword" girer
      Then login butonuna basar
      And giris yapılamadığını test eder
      And sayfayi kapatir


