package glass;


import com.codecool.tw6.glass.pages.GeneralPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ValidateBasSumPageStepdefs {
    GeneralPage generalPage = new GeneralPage();
    @Given("I am on the Basic Summary page")
    public void iAmOnTheBasicSummaryPage() {

    }

    @When("I check the {string}'s value")
    public void iCheckTheSValue(String arg0) {

    }

    @And("click to the quick link")
    public void clickToTheQuickLink() {
    }

    @Then("The {string}s value at the below details equals with the checked value")
    public void theSValueAtTheBelowDetailsEqualsWithTheCheckedValue(String arg0) {
    }
}

