package glass;

import com.codecool.tw6.glass.pages.GeneralPage;
import com.codecool.tw6.glass.pages.LoginPage;
import com.codecool.tw6.glass.pages.ReleasesPage;
import com.codecool.tw6.glass.utility.BrowserFactory;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckVersions {
    private WebDriver driver = BrowserFactory.getWebDriver(System.getenv("BROWSER"));
    private LoginPage loginPage = new LoginPage(driver);
    private GeneralPage generalPage = new GeneralPage(driver);
    private ReleasesPage releasesPage = new ReleasesPage(driver);

    @Given("I am logged in as system admin.")
    public void iAmLoggedInAsSystemAdmin() {
        loginPage.login();
    }

    @And("I am on the Project Releases page.")
    public void iAmOnTheProjectReleasesPage() {
        generalPage.navigate("https://jira2.codecool.codecanvas.hu/projects/DEMO?selectedItem=com.atlassian.jira.jira-projects-plugin:release-page");
    }

    @When("I fill the Version name input field with TestVersion text.")
    public void iFillTheVersionNameInputFieldWithTestVersionText() {
        releasesPage.addTextToTheInputField("TestVersion");
    }

    @And("I click on the the Add button next to the new version input screen.")
    public void iClickOnTheTheAddButtonNextToTheNewVersionInputScreen() {
        releasesPage.clickOnNewVersionAddButton();
    }

    @And("I go to the Glass documentation page.")
    public void iGoToTheGlassDocumentationOption() {
        generalPage.navigate("https://jira2.codecool.codecanvas.hu/projects/DEMO?selectedItem=com.codecanvas.glass:glass");
    }

    @And("I click on the Version text option.")
    public void iClickOnTheVersionTextOption() {
        generalPage.clickOnVersions();
    }

    @Then("I see the TestVersion version in the list.")
    public void iSeeTheTestVersionVersionInTheList() {
        assertTrue(generalPage.checkNewlyCreatedTestVersion("TestVersion"));
    }

    @After("@CheckVersions")
    public void tearDown(){
        driver.quit();
    }
    /*public void deleteTestVersion() throws InterruptedException {
        generalPage.navigate("https://jira2.codecool.codecanvas.hu/projects/DEMO?selectedItem=com.atlassian.jira.jira-projects-plugin%3Arelease-page&status=no-filter");
        releasesPage.deleteVersion("TestVersion");
    }*/
}