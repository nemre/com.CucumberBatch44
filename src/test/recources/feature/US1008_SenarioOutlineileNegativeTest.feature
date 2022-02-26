Feature: US1008 Senario Outline ile Negative test

  Scenario Outline: TC13 farklı kullanici adi ve pasword
    Given kullanici "HMCUrl" sayfasina gider
    And login linkine tıklar
    Then senario outline'dan kullanici adi olarak "<username>" yazar
    And senario outline'dan password olaral "<password>" yazar
    And login butonuna basar
    Then giris yapılamadığını test eder




    Examples:
    |username|password|
    |Maneger |MANEGER |
    |MaNeGer |manEGER |
    |manegeR |ManegeR |
    |mANEGEr |mAnEgEr |
