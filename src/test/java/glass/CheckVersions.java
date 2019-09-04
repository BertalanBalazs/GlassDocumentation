package glass;

import com.codecool.tw6.glass.pages.GeneralPage;
import com.codecool.tw6.glass.utility.BrowserFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheckVersions {
    GeneralPage generalPage = new GeneralPage(BrowserFactory.getWebDriver(System.getenv("BROWSER")));
    @Given("I am logged in as system admin.")
    public void iAmLoggedInAsSystemAdmin() {
    }

    @And("I am on the Project page.")
    public void iAmOnTheProjectPage() {
    }

    @When("I click on {string} text option.")
    public void iClickOnReleasesTextOption() {
    }

    @And("I fill the {string} input field with {string} text.")
    public void iFillTheVersionNameInputFieldWithTestVersionText() {
    }

    @And("I click on the the {string} button.")
    public void iClickOnTheTheAddButton() {
    }

    @And("I click on the {string} option.")
    public void iClickOnTheGlassDocumentationOption() {
    }

    @And("I click on the {string} text option.")
    public void iClickOnTheVersionTextOption() {
    }

    @Then("I see the {string} version in the list.")
    public void iSeeTheTestVersionVersionInTheList() {
    }
}
