@paralel2
Feature: US1002Backround ile amazon testi

  Background: amazon sayfasına gidiş
Given kullanici amazon sayfasina gider

  @wip
  Scenario: TC02_Amozon iPhone Search Testi
    And iPhone icin arama yapar
    Then  sonuclarin iPhone icerdigini test eder

  @wip
  Scenario: TC03_Amozon tea pot Search Testi
    And tea pot icin arama yapar
    Then sonuclarin tea pot icerdigini test eder

  Scenario: TC04_Amozon flower Search Testi
    And flower icin arama yapar
    Then sonuclarin flower icerdigini test eder
