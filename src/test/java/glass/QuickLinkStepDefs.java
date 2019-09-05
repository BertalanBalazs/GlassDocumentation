package glass;

import com.codecool.tw6.glass.pages.*;
import com.codecool.tw6.glass.utility.BrowserFactory;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class QuickLinkStepDefs {

    private WebDriver driver = BrowserFactory.getWebDriver(System.getenv("BROWSER"));

    LoginPage loginPage = new LoginPage(driver);
    BasePageObject basePageObject = new BasePageObject(driver);
    GeneralPage generalPage = new GeneralPage(driver);
    IssueTypesPage issueTypesPage = new IssueTypesPage(driver);
    NotificationPage notificationPage = new NotificationPage(driver);
    PeoplePage peoplePage = new PeoplePage(driver);
    PermissionPage permissionPage = new PermissionPage(driver);
    ProjectSettingPage projectSettingPage = new ProjectSettingPage(driver);

    @After("@quickLinks")
    public void tearDown(){
        driver.quit();
    }

    @Given("I am logged in as system admin to Jira dashboard")
    public void iAmLoggedInAsSystemAdmin() {
        loginPage.login();
    }

    @And("I am on the Basic sum page")
    public void iAmOnTheBasicSumPage() {
        basePageObject.navigate("https://jira2.codecool.codecanvas.hu/projects/DEMO?selectedItem=com.codecanvas.glass:glass");
    }

    /*
    Scenario: Simple item's quick link test
     */

    @When("I click on the {string}")
    public void iClickOn(String headerItem) {
        generalPage.clickOnHeaderItem(headerItem);
    }

    @And("I click on the quick link next to the inner header")
    public void onTheIClickOnTheQuickLinkNextToTheInnerHeader() {
        generalPage.clickOnQuickLink();
    }

    @Then("the Project settings {string} opens in a different window")
    public void theProjectSettingsOpensInANewWindow(String arg0) {
        Assert.assertEquals("Project settings", projectSettingPage.getHeaderText());
    }

    /*
    Scenario: Issue Types quick link test
     */

    @When("I choose the first option of the Issue Types dropdown")
    public void iClickOnFirstItemOfTheIssueTypesDropdown() {
        generalPage.chooseTheFirstOptionOfIssueTypes();
    }

    @And("I click on the quick link next to the {string}'s text")
    public void iClickOnTheQuickLinkNextToTheText(String innerHeader) {
        issueTypesPage.clickOnQuickLink(innerHeader);
    }

    @Then("the Issue Type Project settings {string} opens in a new window")
    public void theIssueTypeProjectSettingsOpensInANewWindow(String arg0) {
        Assert.assertEquals("Project settings", projectSettingPage.getHeaderText());
    }

    /*
    Scenario: General page's subpages quick link test
     */

    @When("I click on the button called: {string}")
    public void iClickOnThe(String arg0) {
    }

    @And("I click on the Arrow link next to the {string} text")
    public void iClickOnTheArrowLinkNextToTheText(String arg0) {
    }

    @Then("the subpage Project settings {string} opens in a new window")
    public void theSubpageProjectSettingsOpensInANewWindow(String arg0) {
    }

}
