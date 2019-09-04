package glass;


import com.codecool.tw6.glass.pages.GeneralPage;
import com.codecool.tw6.glass.pages.LoginPage;
import com.codecool.tw6.glass.utility.BrowserFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ValidateBasSumPageStepdefs {

    LoginPage loginPage = new LoginPage(BrowserFactory.getWebDriver(System.getenv("BROWSER")));
    GeneralPage generalPage = new GeneralPage(BrowserFactory.getWebDriver(System.getenv("BROWSER")));

    @Given("I am on the Basic Summary page")
    public void iAmOnTheBasicSummaryPage() {
        loginPage.login();
        generalPage.navigate("https://jira2.codecool.codecanvas.hu/projects/DEMO?selectedItem=com.codecanvas.glass:glass");
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

