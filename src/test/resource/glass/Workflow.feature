Feature: Create a new workflow as an admin

  Scenario Outline: To check if it is possible to create a new workflow when logged in as an admin.
    Given I am logged in to the "<website>" with admin privileges.
    When I visit the following "<link>"
    And I click on the Add workflow menu
    Then a new prompt shows up that asks for a Name and a Description for a new project

    Examples: website | link
      | jira2.codecool.codecanvas.hu | https://jira2.codecool.codecanvas.hu/secure/admin/workflows/ListWorkflows.jspa |