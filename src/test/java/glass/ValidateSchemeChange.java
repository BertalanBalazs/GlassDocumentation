package glass;

import com.codecool.tw6.glass.pages.BasePageObject;
import com.codecool.tw6.glass.pages.GeneralPage;
import com.codecool.tw6.glass.pages.LoginPage;
import com.codecool.tw6.glass.pages.SelectSchemePage;
import com.codecool.tw6.glass.utility.BrowserFactory;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class ValidateSchemeChange {

    WebDriver driver = BrowserFactory.getWebDriver(System.getenv("BROWSER"));

    BasePageObject basePageObject = new BasePageObject(driver);
    GeneralPage generalPage = new GeneralPage(driver);
    LoginPage loginPage = new LoginPage(driver);
    SelectSchemePage selectSchemePage = new SelectSchemePage(driver);

    @After("@schemes")
    public void tearDown(){
        driver.quit();
    }

    @Given("I am on the Select Issue Type Scheme page")
    public void iAmOnTheSelectIssueTypeSchemePage() {
        loginPage.login();
        selectSchemePage.navigate("https://jira2.codecool.codecanvas.hu/secure/admin/SelectIssueTypeSchemeForProject!default.jspa?projectId=10007");
    }


    @When("I input admin credentials")
    public void iInputAdminCredentials() {
        selectSchemePage.enterAdminPassword();
    }

    @And("I set Demo Issue Type Scheme for the project")
    public void iSetDemoIssueTypeSchemeForTheProject() {
        selectSchemePage.selectSchemeByValue("Demo Issue Type Scheme");
    }

    @And("I go to the project's Glass Documentation page")
    public void iGoToTheProjectSGlassDocumentationPage() {
        selectSchemePage.openProjectPage("ST");
    }

    @And("I click Schemes")
    public void iClickSchemes() {
        generalPage.clickSchemesTabLink();
    }

    @Then("the Issue Type Scheme displays Demo Issue Type Scheme")
    public void theIssueTypeSchemeDisplaysDemoIssueTypeScheme() {
        Assert.assertEquals("Demo Issue Type Scheme", generalPage.getCurrentIssueTypeSchemeText());
    }
}
