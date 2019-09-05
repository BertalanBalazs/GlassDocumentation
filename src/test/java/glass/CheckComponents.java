package glass;

import com.codecool.tw6.glass.pages.ComponentsPage;
import com.codecool.tw6.glass.pages.GeneralPage;
import com.codecool.tw6.glass.pages.LoginPage;
import com.codecool.tw6.glass.utility.BrowserFactory;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckComponents {
    private WebDriver driver = BrowserFactory.getWebDriver(System.getenv("BROWSER"));
    private LoginPage loginPage = new LoginPage(driver);
    private GeneralPage generalPage = new GeneralPage(driver);
    private ComponentsPage componentsPage = new ComponentsPage(driver);

    @Given("I am logged in as system adminRole.")
    public void iAmLoggedInAsSystemAdminRole() {
        loginPage.login();
    }

    @And("I am on the Project components page.")
    public void iAmOnTheProjectComponentsPage() {
        generalPage.navigate("https://jira2.codecool.codecanvas.hu/projects/DEMO?selectedItem=com.atlassian.jira.jira-projects-plugin:components-page");
    }

    @When("I fill the Version name input field with TestComponent text.")
    public void iFillTheVersionNameInputFieldWithTestComponentText() {
        componentsPage.addTextToTheComponentNameInputField("TestComponent");
    }

    @And("I fill the Default assignee input field with Unassigned text.")
    public void iFillTheDefaultAssigneeInputFieldWithUnassignedText() {
        componentsPage.addTextToTheAssigneeInputField("Unassigned");
    }

    @And("I click on the the Add button next to the new component input screen.")
    public void iClickOnTheTheAddButtonNextToTheNewComponentInputScreen() {
        componentsPage.clickOnNewComponentAddButton();
    }

    @And("I go to the Glass documentation.")
    public void iGoToTheGlassDocumentation() {
        generalPage.navigate("https://jira2.codecool.codecanvas.hu/projects/DEMO?selectedItem=com.codecanvas.glass:glass");
    }

    @Then("I see the TestComponent version in the list.")
    public void iSeeTheTestComponentVersionInTheList() {
        assertTrue(generalPage.checkNewlyCreatedComponent("TestComponent"));
    }

    @After("@CheckComponent")
    public void tearDown(){
        driver.quit();
    }
    /*public void deleteTestComponent() throws InterruptedException {
        generalPage.navigate("https://jira2.codecool.codecanvas.hu/projects/DEMO?selectedItem=com.atlassian.jira.jira-projects-plugin:components-page");
        componentsPage.deleteComponent("TestComponent");
    }*/
}
