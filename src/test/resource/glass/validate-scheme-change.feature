Feature: Validate Scheme changes
  Scenario Outline: Validate Issue Type Scheme change
    Given I am on <website>
    When I click Schemes
    And I click the cogwheel in the <scheme> row
    And I input admin credentials
    And I set <demo scheme> for the project
    And I go to <website>
    And I click Schemes
    Then the <scheme> displays <demo scheme>

    Examples:
      | website | scheme | demo scheme |
      |  https://jira2.codecool.codecanvas.hu/projects/ST?selectedItem=com.codecanvas.glass:glass   |  Issue Type Scheme  |  Demo Issue Type Scheme   |
      |     |  Workflow Scheme  | Demo Workflow Scheme  |