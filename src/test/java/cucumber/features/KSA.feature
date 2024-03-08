Feature: subscribe Website for KSA
  I want to use all packages and Monthly price

  Background:
    Given I landed on subscribe Page

  @Regression_KSA
  @All
  Scenario Outline: Positive Test for all packages.
    Given Logged in with landing page
    When I select "<countryName>" Your Plan
    Then All packages is displayed with "<first_package>" , "<Second_package>" , "<third_package>"

    Examples:
      | countryName | first_package | Second_package | third_package |
      | KSA2        | LITE          | CLASSIC        | PREMIUM       |


  @Regression_KSA
  @All
  Scenario Outline: Positive Test for Monthly price
    Given Logged in with landing page
    When I select "<countryName>" Your Plan
    Then All Monthly price is displayed with "<first_Monthly_price>" , "<second_Monthly_price>" , "<third_Monthly_price>"

    Examples:
      | countryName | first_Monthly_price | second_Monthly_price | third_Monthly_price |
      | KSA         | 15 SAR/month        | 25 SAR/month         | 60 SAR/month        |