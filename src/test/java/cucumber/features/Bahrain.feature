Feature: subscribe Website for Bahrain
  I want to use all packages and Monthly price

  Background:
    Given I landed on subscribe Page

  @Regression_Bahrain
  @All
  Scenario Outline: Positive Test for all packages.
    Given Logged in with landing page
    When I select "<countryName>" Your Plan
    Then All packages is displayed with "<first_package>" , "<Second_package>" , "<third_package>"

    Examples:
      | countryName | first_package | Second_package | third_package |
      | Bahrain     | LITE          | CLASSIC        | PREMIUM       |


  @Regression_Bahrain
  @All
  Scenario Outline: Positive Test for Monthly price
    Given Logged in with landing page
    When I select "<countryName>" Your Plan
    Then All Monthly price is displayed with "<first_Monthly_price>" , "<second_Monthly_price>" , "<third_Monthly_price>"

    Examples:
      | countryName | first_Monthly_price | second_Monthly_price | third_Monthly_price |
      | Bahrain     | 2 BHD/month         | 3 BHD/month          | 6 BHD/month         |