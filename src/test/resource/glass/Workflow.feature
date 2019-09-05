Feature: Workflow Creation & Handling

  Scenario Outline: Check if possible to create workflow when logged in as admin
    Given I am logged in as admin at Jira
    When I visit "<link>"
    And I click on the Add workflow menu
    Then I should see a new prompt shows up that asks for a Name and a Description for a new project

    Examples:
      | link      |
      | https://jira2.codecool.codecanvas.hu/secure/admin/workflows/ListWorkflows.jspa |