package glass;

import com.codecool.tw6.glass.pages.BasePageObject;
import com.codecool.tw6.glass.pages.LoginPage;
import com.codecool.tw6.glass.pages.SelectSchemePage;
import com.codecool.tw6.glass.utility.BrowserFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ValidateSchemeChange {

    BasePageObject basePageObject = new BasePageObject(BrowserFactory.getWebDriver(System.getenv("BROWSER")));
    LoginPage loginPage = new LoginPage(BrowserFactory.getWebDriver(System.getenv("BROWSER")));
    SelectSchemePage selectSchemePage = new SelectSchemePage(BrowserFactory.getWebDriver(System.getenv("BROWSER")));

    @Given("I am on the Select Issue Type Scheme page")
    public void iAmOnTheSelectIssueTypeSchemePage() {
        basePageObject.navigate("https://jira2.codecool.codecanvas.hu");
        loginPage.login();
    }

    @When("I input admin credentials")
    public void iInputAdminCredentials() {

    }

    @And("I set Demo Issue Type Scheme for the project")
    public void iSetDemoIssueTypeSchemeForTheProject() {

    }

    @And("I go to the project's Glass Documentation page")
    public void iGoToTheProjectSGlassDocumentationPage() {

    }

    @And("I click Schemes")
    public void iClickSchemes() {
    }

    @Then("the Issue Type Scheme displays Demo Issue Type Scheme")
    public void theIssueTypeSchemeDisplaysDemoIssueTypeScheme() {
    }
}
