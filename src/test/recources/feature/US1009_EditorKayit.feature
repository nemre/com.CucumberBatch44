Feature: US1009 senario outline ile editor data sayfasına kayıt

    @editor
    Scenario Outline: TC14 Editor Kayit


      Given kullanici "https://editor.datatables.net" sayfasina gider
      Then new butonuna basar
      And firstname olarak "<firstname>" yazar
      And lastname olarak "<lastname>" yazar
      And Position olarak "<position>" yazar
      And Office olarak "<office>" yazar
      And Extension olarak "<extension>" yazar
      And Start olarak "<start>" yazar
      And Salary olarak "<salary>" yazar
      And Create tusuna basar
      When kullanici ilk isim ile arama yapar
      Then isim bolumunde isminin oldugunu dogrular

Examples:
        |firstname|lastname|position|office|extension|start|salary|
        |yunus    |emre    |amele   |ofic  |amele    |2022-02-14|10000|
