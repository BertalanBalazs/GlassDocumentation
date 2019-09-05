Feature: Validate Values On Basic Summary Page
  Check if all the values are valid on the Basic Summary Page

  Scenario Outline: Check Values
    Given I am on the Basic Summary page
    When I check the "<ExpectedKey>"'s value
    And click to the quick link
    Then The "<Key>"s value at the below details equals with the checked value

    Examples:
      |ExpectedKey     |Key         |
      |Project Name    |name        |
      |Key             |key         |
      |URL             |url         |
