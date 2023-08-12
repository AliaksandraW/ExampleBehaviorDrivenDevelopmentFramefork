Feature: Search Functionality With Additional Credentials
  Background:
    Given User on the Amazon website

  Scenario: Search for a valid product with additional credentials
    When User enter "coffee maker" in the search bar and click the search button
    And User should see list of results and additional options for searching
    When User choose additional searching options and count of find results should be different than previous