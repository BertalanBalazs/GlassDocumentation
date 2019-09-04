Feature: Workflow Creation and Handling

  Scenario Outline: To check if it is possible to create a new workflow when logged in as an admin.
    Given I visit the following "link"
    When I click on the Add workflow menu
    Then a new prompt shows up that asks for a Name and a Description for a new project

    Examples: link
      | https://jira2.codecool.codecanvas.hu/secure/admin/workflows/ListWorkflows.jspa |