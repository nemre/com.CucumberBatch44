Feature: US1007 Senario Outline ile amazon search

  Scenario Outline: TC12 amazonda bir liste aratma
    Given kullanici "amazonUrl" sayfasina gider
    Then "<aranacakEleman>" icin arama yapar
    And sonuclarin "<aranacakEleman>" icerdigini test eder
    



    Examples:
    |aranacakEleman|
    |Apple|
    |Java|
    |Samsung|
    |armut|
    |Nutella|

