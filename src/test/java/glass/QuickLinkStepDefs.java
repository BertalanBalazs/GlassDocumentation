package glass;

import com.codecool.tw6.glass.pages.*;
import com.codecool.tw6.glass.utility.BrowserFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class QuickLinkStepDefs {

    LoginPage loginPage = new LoginPage(BrowserFactory.getWebDriver(System.getenv("BROWSER")));
    BasePageObject basePageObject = new BasePageObject(BrowserFactory.getWebDriver(System.getenv("BROWSER")));
    GeneralPage generalPage = new GeneralPage(BrowserFactory.getWebDriver(System.getenv("BROWSER")));
    IssueTypesPage issueTypesPage = new IssueTypesPage(BrowserFactory.getWebDriver(System.getenv("BROWSER")));
    NotificationPage notificationPage = new NotificationPage(BrowserFactory.getWebDriver(System.getenv("BROWSER")));
    PeoplePage peoplePage = new PeoplePage(BrowserFactory.getWebDriver(System.getenv("BROWSER")));
    PermissionPage permissionPage = new PermissionPage(BrowserFactory.getWebDriver(System.getenv("BROWSER")));
    ProjectSettingPage projectSettingPage = new ProjectSettingPage(BrowserFactory.getWebDriver(System.getenv("BROWSER")));

    /*
    Scenario: General page quick link test
     */

    @Given("I am logged in as system admin")
    public void iAmLoggedInAsSystemAdmin() {
        loginPage.login();
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

    @And("I click on the Arrow link next to the {string} text")
    public void iClickOnTheArrowLinkNextToTheText(String arg0) {
    }
}
