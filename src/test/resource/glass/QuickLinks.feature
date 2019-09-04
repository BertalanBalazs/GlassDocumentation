Feature: Quick Links

  Scenario: General page quick link test
    Given I am logged in as system admin
      And I am on the Basic summary page
    When I click on the quick link next to the text Basic summary
    Then the Project settings Details opens in a new window