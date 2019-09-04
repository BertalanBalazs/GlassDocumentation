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


  Scenario Outline: Issue Types quick link test
    Given I am logged in as system admin
      And I am on the Basic summary page
    When I click on the Issue Types dropdown
      And I choose the first option
      And I click on the quick link next to the "<inner-header>" text
    Then the Project settings "<project-config-heading>" opens in a new window

    Examples:
      | inner-header | project-config-heading |
      | Workflow     | Workflows              |
      | Screens      | Screens                |


  Scenario Outline: General page's subpages quick link test
    Given I am logged in as system admin
      And I am on the Basic summary page
    When I click on "<menu-item>"
      And I click on the Arrow link next to the "<menu-item>" text
    Then the Project settings "<inner-page-header>" opens in a new window

    Examples:
      | menu-item  | inner-page-header |
      | Components | Components        |
      | Versions   | Releases          |
      | Schemes    | Issue types       |