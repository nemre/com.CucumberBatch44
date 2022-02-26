Feature: US1014 Dinamik Elemanlar

  @dinamik
  Scenario: TC19 dinamik elementler tiklanabilmeli
    
  Given kullanici "DemoQaDinamikUrl" sayfasina gider
  Then Will enable 5 seconds butonunun enable olmasini bekleyin
  And Will enable 5 seconds butonunun enable oldugunu test edin