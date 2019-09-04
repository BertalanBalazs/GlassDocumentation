package glass;

import com.codecool.tw6.glass.pages.*;
import com.codecool.tw6.glass.utility.BrowserFactory;
import com.codecool.tw6.glass.utility.QuickLinkUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class QuickLinkStepDefs {

    LoginPage loginPage = new LoginPage(BrowserFactory.getWebDriver(System.getenv("BROWSER")));
    BasePageObject basePageObject = new BasePageObject(BrowserFactory.getWebDriver(System.getenv("BROWSER")));
    GeneralPage generalPage = new GeneralPage(BrowserFactory.getWebDriver(System.getenv("BROWSER")));
    IssueTypesPage issueTypesPage = new IssueTypesPage(BrowserFactory.getWebDriver(System.getenv("BROWSER")));
    NotificationPage notificationPage = new NotificationPage(BrowserFactory.getWebDriver(System.getenv("BROWSER")));
    PeoplePage peoplePage = new PeoplePage(BrowserFactory.getWebDriver(System.getenv("BROWSER")));
    PermissionPage permissionPage = new PermissionPage(BrowserFactory.getWebDriver(System.getenv("BROWSER")));
    ProjectSettingPage projectSettingPage = new ProjectSettingPage(BrowserFactory.getWebDriver(System.getenv("BROWSER")));

    @Given("I am on the Basic summary page")
    public void iAmOnTheBasicSummaryPage() {
        basePageObject.openProjectPage("DEMO");
    }

    @And("I am logged in as system admin")
    public void iAmLoggedInAsSystemAdmin() {
        loginPage.login();
    }

    /*
    Scenario: General page quick link test
     */

    @When("I click on the quick link next to the text Basic summary")
    public void iClickOnTheQuickLinkNextToTheTextBasicSummary() {
    }

    @Then("the Project settings Details opens in a new window")
    public void theProjectSettingsDetailsOpensInANewWindow() {
    }

    /*
    Scenario: Simple item's quick link test
     */

    @When("I click on {WebElement}")
    public void iClickOn(WebElement headerItem) {
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

    @When("I click on the Issue Types dropdown")
    public void iClickOnTheIssueTypesDropdown() {
    }

    @And("I choose the first option")
    public void iChooseTheFirstOption() {
    }

    @And("I click on the quick link next to the {string} text")
    public void iClickOnTheQuickLinkNextToTheText(String arg0) {
    }

    @Then("the Issue Type Project settings {string} opens in a new window")
    public void theIssueTypeProjectSettingsOpensInANewWindow(String arg0) {
    }

    /*
    Scenario: General page's subpages quick link test
     */

    @When("I click on the {string}")
    public void iClickOnThe(String arg0) {
    }

    @And("I click on the Arrow link next to the {string} text")
    public void iClickOnTheArrowLinkNextToTheText(String arg0) {
    }

    @Then("the subpage Project settings {string} opens in a new window")
    public void theSubpageProjectSettingsOpensInANewWindow(String arg0) {
    }

}
