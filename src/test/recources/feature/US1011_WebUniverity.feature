Feature: US1011 Webuniversity window Handle

  @web
  Scenario Outline: TC16 Reusable Method ile Window Handle testi

    Given webuniversity WebUniversityUrl adresine gider
    Then Login Portal'a  kadar asagi iner
    And Login Portal'a tiklar
    Then Diger window'a gecer
    And "<username>" ve  "<password>" kutularina deger yazdirar
    And sayfada login butonuna basar
    Then Popup'ta cikan yazinin "validation failed" oldugunu test eder
    And Ok diyerek Popup'i kapatır
    Then Ilk sayfaya geri doner
    And Ilk sayfaya donuldugunu test eder

    Examples:
    |username|password|
    |yunus   |emre    |

