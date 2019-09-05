package glass;

import com.codecool.tw6.glass.pages.*;
import com.codecool.tw6.glass.utility.BrowserFactory;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Workflow {

    private WebDriver driver = BrowserFactory.getWebDriver(System.getenv("BROWSER"));
    private BasePageObject basePage = new BasePageObject(driver);
    private LoginPage loginPage = new LoginPage(driver);
    private GeneralPage generalPage = new GeneralPage(driver);
    private AdministrationPage administrationPage = new AdministrationPage(driver);
    private AuthenticatePage authenticatePage = new AuthenticatePage(driver);
    private IssueTypesPage issueTypesPage = new IssueTypesPage(driver);
    private ProjectSettingPage settingsPage = new ProjectSettingPage(driver);

    @After("@workflow")
    public void tearDown(){
        driver.quit();
    }

    @Given("I am logged in as admin to Jira")
    public void iAmLoggedInAsAdminToJira() {
        loginPage.login();
    }

    @Given("I visit {string}")
    public void iVisit(String link) {
        basePage.navigate(link);
        authenticatePage.authenticate();
    }

    @When("I click on the Add workflow menu")
    public void iClickOnTheAddWorkflowMenu() {
        administrationPage.clickOnMenu("Add workflow");
    }

    @Then("I should see a new prompt shows up that asks for a Name and a Description for a new project")
    public void validatePromptShows() {
        Assert.assertTrue(administrationPage.createPopUpShows());
    }

    @Given("I am on {string}")
    public void iAmOn(String url) {
        basePage.navigate(url);
    }

    @When("I click on Issue Types menu")
    public void iClickOnIssueTypesMenu() {
        generalPage.clickOnIssueTypeBtn();
    }

    @And("I select TestIssue")
    public void iSelectTestIssue() {
        generalPage.selectMenuItem("TestIssue");
    }

    @Then("a Workflow box shows the workflow associated with TestIssue")
    public void workFlowPresentTest() {
        Assert.assertTrue(issueTypesPage.isWorkflowBoxPresent());
    }

    @Given("I am on <link>")
    public void iAmOnLink() {
    }

    @When("I click on the Issue Types menu")
    public void iClikOnTheIssueTypes() {
        generalPage.clickOnIssueTypeBtn();
    }

    @And("I click on TestIssue")
    public void iClickOnTestIssue() {
        generalPage.selectMenuItem("TestIssue");
    }

    @Then("I see a Workflow Transitions box with the following elements: Create, Start Progress, Review Problem, Finish Issue, Close Issue")
    public void workFlowTransitionsPresentTest() {
        List<String> expectedTransitions = new ArrayList<>(Arrays.asList("Create", "Start Progress", "Review Problem", "Finish Issue", "Close Issue"));
        Assert.assertEquals(expectedTransitions, issueTypesPage.getWorkflowTransitionList());
    }

    @Given("I open {string}")
    public void iOpen(String url) {
        basePage.navigate(url);
    }

    @Then("Test Workflow appears on the page")
    public void testWorkflowAppearsOnThePage() {
        Assert.assertTrue(settingsPage.isTestWorkflowPresent());
    }
}
