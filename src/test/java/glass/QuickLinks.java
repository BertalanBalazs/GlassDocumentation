package glass;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class QuickLinks {

    /*
    Scenario: General page quick link test
     */

    @Given("I am logged in as system admin")
    public void iAmLoggedInAsSystemAdmin() {
    }

    @And("I am on the Basic summary page")
    public void iAmOnTheBasicSummaryPage() {
    }

    @When("I click on the quick link next to the text Basic summary")
    public void iClickOnTheQuickLinkNextToTheTextBasicSummary() {
    }

    @Then("the Project settings Details opens in a new window")
    public void theProjectSettingsDetailsOpensInANewWindow() {
    }

    /*
    Scenario: Simple item's quick link test
     */

    @When("I click on {string}")
    public void iClickOn(String arg0) {
    }

    @And("I click on the quick link next to the {string} text")
    public void iClickOnTheQuickLinkNextToTheText(String arg0) {
    }

    @Then("the Project settings {string} opens in a new window")
    public void theProjectSettingsOpensInANewWindow(String arg0) {
    }

    /*
    Scenario: Issue Types quick link test
     */

    @When("I click on the Issue Types dropdown")
    public void iClickOnTheIssueTypesDropdown() {
    }

    @And("I choose the first option")
    public void iChooseTheFirstOption() {
    }
}
