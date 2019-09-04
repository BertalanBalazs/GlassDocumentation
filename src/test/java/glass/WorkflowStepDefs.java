package glass;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WorkflowStepDefs {

    @Given("I visit the login page")
    public void iVisitTheLoginPage() {
    }

    @When("I enter my username and password")
    public void iEnterMyUsernameAndPassword() {
    }

    @Then("I should be logged in")
    public void iShouldBeLoggedIn() {
    }

    @Given("I visit the following {string}")
    public void iVisitTheFollowing(String link) {
    }

    @When("I click on the Add workflow menu")
    public void iClickOnTheAddWorkflowMenu() {
    }

    @Then("a new prompt shows up that asks for a Name and a Description for a new project")
    public void aNewPromptShowsUpThatAsksForANameAndADescriptionForANewProject() {
    }

    @Given("I am on {string}")
    public void iAmOn(String url) {
    }

    @When("I click on Issue Types menu")
    public void iClickOnIssueTypesMenu() {
    }

    @And("I select TestIssue")
    public void iSelectTestIssue() {
    }

    @Then("a Workflow box shows the workflow associated with TestIssue")
    public void aWorkflowBoxShowsTheWorkflowAssociatedWithTestIssue() {
    }

    @Given("I am on <link>")
    public void iAmOnLink() {
    }

    @When("I clik on the Issue Types")
    public void iClikOnTheIssueTypes() {
    }

    @And("I click on TestIssue")
    public void iClickOnTestIssue() {
    }

    @Then("I see a Workflow Transitions box with the following elements: Create, Start Progress, Review Problem, Finish Issue, Close Issue")
    public void iSeeAWorkflowTransitionsBoxWithTheFollowingElementsCreateStartProgressReviewProblemFinishIssueCloseIssue() {
    }


    @Given("I visit {string}")
    public void iVisit(String url) {
    }

    @Then("{string} appears on the page")
    public void appearsOnThePage(String workflowName) {
    }
}
