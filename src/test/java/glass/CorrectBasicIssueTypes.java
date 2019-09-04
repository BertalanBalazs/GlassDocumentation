package glass;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CorrectBasicIssueTypes {

    @Given("Admin user is on the {string}")
    public void adminUserIsOnThe(String arg0) {

    }

    @And("I have {string} that is applied to the {string}")
    public void iHaveThatIsAppliedToThe(String arg0, String arg1) {

    }

    @When("I go to the {string} page")
    public void iGoToThePage(String arg0) {
    }


    @Then("I see the {string} related to the {string}")
    public void iSeeTheRelatedToThe(String arg0, String arg1) {
    }
}
