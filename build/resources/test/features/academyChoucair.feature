# Autor: DenisUlloa
@stories
Feature: Academy Choucair
  As a user, I want to learn how to aumate in screamplay at the Choucair Academy with the autmation course
  @scenario1
  Scenario: Search for a automation course
    Given than brandon wants to learn automation at the academy Choucair
    When he search for the course on the choucair academy platform
      | strFirstName | strLastName | strEmail         | strMonth | strDay | strYear | strLanguage | strZipCode | strBrand | strModel  | strOs  | strCity | strPass    |
      | Omar         | Masin       | correox@temp.com | January  | 31     | 1994    | spanish     | 0854       | Apple    | Iphone 11 | iOS 14 | Panama  | Panama1234 |
    Then he finds the course called resources
      | strValidation  |
      | Complete Setup |
