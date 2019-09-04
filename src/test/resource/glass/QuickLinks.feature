Feature: Quick Links

  Scenario: General page quick link test
    Given I am logged in as system admin
      And I am on the Basic summary page
    When I click on the quick link next to the text Basic summary
    Then the Project settings Details opens in a new window

  Scenario Outline: Simple item's quick link test
    Given I am logged in as system admin
    And I am on the Basic summary page
    When I click on "<nav-item>"
    And I click on the quick link next to the "<inner-header>" text
    Then the Project settings "<project-config-heading>" opens in a new window

    Examples:
      | nav-item      | inner-header        | project-config-heading |
      | People        | People              | Users and roles        |
      | Permissions   | Permission Matrix   | Project Permissions    |
      | Notifications | Notification Matrix | Notifications          |