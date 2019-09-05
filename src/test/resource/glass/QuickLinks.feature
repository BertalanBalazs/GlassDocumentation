Feature: Quick Links

  Scenario Outline: Simple item's quick link test
    Given I am on the Basic summary page
      And I am logged in as system admin
    When I click on "<header-item>"
      And I click on the quick link next to the inner header
    Then the Project settings "<project-config-heading>" opens in a new window

    Examples:
      | header-item         | project-config-heading |
      | generalPage         | Details                |
      | peopleHeader        | Users and roles        |
      | permissionsHeader   | Project Permissions    |
      | notificationsHeader | Notifications          |


  Scenario Outline: Issue Types quick link test
    Given I am on the Basic summary page
      And I am logged in as system admin
    When I choose the first option of the Issue Types dropdown
      And I click on the quick link next to the "<inner-header>" text
    Then the Issue Type Project settings "<project-config-heading>" opens in a new window

    Examples:
      | inner-header | project-config-heading |
      | Workflow     | Workflows              |
      | Screens      | Screens                |


  Scenario Outline: General page's subpages quick link test
    Given I am on the Basic summary page
      And I am logged in as system admin
    When I click on the "<menu-item>"
      And I click on the Arrow link next to the "<menu-item>" text
    Then the subpage Project settings "<inner-page-header>" opens in a new window

    Examples:
      | menu-item  | inner-page-header |
      | Components | Components        |
      | Versions   | Releases          |
      | Schemes    | Issue types       |