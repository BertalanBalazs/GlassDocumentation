package glass;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Workflow {

    @Given("I am logged in as admin at Jira")
    public void iAmLoggedInAsAdminAtJira() {

    }

    @When("I visit {string}")
    public void iVisit(String link) {
    }

    @And("I click on the Add workflow menu")
    public void iClickOnTheAddWorkflowMenu() {
    }

    @Then("I should see a new prompt shows up that asks for a Name and a Description for a new project")
    public void validatePromptShows() {
    }
}
