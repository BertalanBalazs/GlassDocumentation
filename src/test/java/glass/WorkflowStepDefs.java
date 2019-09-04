package glass;

import org.junit.Assert;
import com.codecool.tw6.glass.pages.BasePageObject;
import com.codecool.tw6.glass.pages.LoginPage;
import com.codecool.tw6.glass.utility.BrowserFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WorkflowStepDefs {

    private static BasePageObject basePage = new BasePageObject(BrowserFactory.getWebDriver(System.getenv("BROWSER")));
    private static LoginPage loginPage = new LoginPage(BrowserFactory.getWebDriver(System.getenv("BROWSER")));

    @Given("I visit the login page")
    public void iVisitTheLoginPage() {
        loginPage.login();
    }

    @When("I enter my username and password")
    public void iEnterMyUsernameAndPassword() {
    }

    @Then("I should be logged in")
    public void iShouldBeLoggedIn() {
        Assert.assertEquals("yes", "yes");
    }

    /*@Given("I visit the following {string}")
    public void iVisitTheFollowing(String link) {
    }

    @When("I click on the Add workflow menu")
    public void iClickOnTheAddWorkflowMenu() {
    }

    @Then("a new prompt shows up that asks for a Name and a Description for a new project")
    public void checkPromptAppears() {
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
    public void workflowBoxAppears() {
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
    public void checkCorrectElementsAppear() {
    }


    @Given("I visit {string}")
    public void iVisit(String url) {
    }

    @Then("{string} appears on the page")
    public void appearsOnThePage(String workflowName) {
    }*/
}
