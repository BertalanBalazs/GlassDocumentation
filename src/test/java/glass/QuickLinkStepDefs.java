package glass;

import com.codecool.tw6.glass.pages.*;
import com.codecool.tw6.glass.utility.BrowserFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class QuickLinkStepDefs {

    LoginPage loginPage = new LoginPage(BrowserFactory.getWebDriver(System.getenv("BROWSER")));
    BasePageObject basePageObject = new BasePageObject(BrowserFactory.getWebDriver(System.getenv("BROWSER")));
    GeneralPage generalPage = new GeneralPage(BrowserFactory.getWebDriver(System.getenv("BROWSER")));
    IssueTypesPage issueTypesPage = new IssueTypesPage(BrowserFactory.getWebDriver(System.getenv("BROWSER")));
    NotificationPage notificationPage = new NotificationPage(BrowserFactory.getWebDriver(System.getenv("BROWSER")));
    PeoplePage peoplePage = new PeoplePage(BrowserFactory.getWebDriver(System.getenv("BROWSER")));
    PermissionPage permissionPage = new PermissionPage(BrowserFactory.getWebDriver(System.getenv("BROWSER")));
    ProjectSettingPage projectSettingPage = new ProjectSettingPage(BrowserFactory.getWebDriver(System.getenv("BROWSER")));

    @Given("I am logged in as system admin")
    public void iAmLoggedInAsSystemAdmin() {
        loginPage.login();
    }

    @And("I am on the Basic summary page")
    public void iAmOnTheBasicSummaryPage() {
        basePageObject.openProjectPage("DEMO");
    }

    /*
    Scenario: Simple item's quick link test
     */

    @When("I click on {string}")
    public void iClickOn(String headerItem) {
        generalPage.clickOnHeaderItem(headerItem);
    }

    @And("I click on the quick link next to the inner header")
    public void onTheIClickOnTheQuickLinkNextToTheInnerHeader() {
        generalPage.clickOnQuickLink();
    }

    @Then("the Project settings {string} opens in a new window")
    public void theProjectSettingsOpensInANewWindow(String arg0) {
        Assert.assertEquals("Project settings", projectSettingPage.getHeaderText());
    }

    /*
    Scenario: Issue Types quick link test
     */

    /*
    @When("I choose the first option of the Issue Types dropdown")
    public void iClickOnFirstItemOfTheIssueTypesDropdown() {
        generalPage.chooseTheFirstOptionOfIssueTypes();
    }

    @And("I click on the quick link next to the {string} text")
    public void iClickOnTheQuickLinkNextToTheText(String innerHeader) {
        issueTypesPage.clickOnQuickLink(innerHeader);
    }

    @Then("the Issue Type Project settings {string} opens in a new window")
    public void theIssueTypeProjectSettingsOpensInANewWindow(String arg0) {
        Assert.assertEquals("Project settings", projectSettingPage.getHeaderText());
    }

     */

    /*
    Scenario: General page's subpages quick link test
     */

    /*
    @When("I click on the {string}")
    public void iClickOnThe(String arg0) {
    }

    @And("I click on the Arrow link next to the {string} text")
    public void iClickOnTheArrowLinkNextToTheText(String arg0) {
    }

    @Then("the subpage Project settings {string} opens in a new window")
    public void theSubpageProjectSettingsOpensInANewWindow(String arg0) {
    }

     */

}
