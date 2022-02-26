
Feature: US1003 parametre ile step defination olusturma

  @paralel1
  Scenario: TC05_parametre kullanımı

    Given kullanici amazon sayfasina gider
    And "iPhone" icin arama yapar
    Then  sonuclarin "iPhone" icerdigini test eder
    And sayfayi kapatir