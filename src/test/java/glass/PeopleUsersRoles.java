package glass;

import com.codecool.tw6.glass.pages.AdministrationGroupPage;
import com.codecool.tw6.glass.pages.LoginPage;
import com.codecool.tw6.glass.pages.PeoplePage;
import com.codecool.tw6.glass.pages.ProjectSettingPage;
import com.codecool.tw6.glass.utility.BrowserFactory;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PeopleUsersRoles {
    private PeoplePage peoplePage;
    private LoginPage loginPage;
    private ProjectSettingPage projectSettingPage;
    private AdministrationGroupPage administrationGroupPage;
    private WebDriver driver = BrowserFactory.getWebDriver(System.getenv("BROWSER"));

    @Before
    public void setUp(){
        loginPage = new LoginPage(driver);
        peoplePage = new PeoplePage(driver);
        projectSettingPage = new ProjectSettingPage(driver);
        administrationGroupPage = new AdministrationGroupPage(driver);
    }

    @Given("You are on the Temp - Project Configuration Documentation site")
    public void youAreOnTheTempProjectConfigurationDocumentationSite() {
        loginPage.login();
        peoplePage.navigateToProjectSite();
    }

    @When("I click on the people section")
    public void iClickOnThe() {

        peoplePage.clickOnPeopleSection();
    }

    @And("I click on the Users and Roles link")
    public void iClickOnTheUsersAndRolesLink() {
        peoplePage.clickOnUsersAndRolesLink();
    }

    @And("I click on the Add users to a role icon")
    public void iClickOnTheLink() {
        projectSettingPage.clickOnAddUserToRoleIcon();
    }

    @And("I add Simple User as Developer")
    public void iAddSimpleUserAsDeveloper() {
        projectSettingPage.sendKeyToUserInput("Simple User");
        projectSettingPage.clickOnTheUser();
        projectSettingPage.clickOnRolePicker();
        projectSettingPage.clickOnDevelopers();
        projectSettingPage.clickOnAddUserToRoleButton();
    }

    @And("I save the Developers name and quantity")
    public void iSaveTheDevelopersNameAndQuantity() {
    }

    @Then("I have to see the same data like on the Users and Roles site")
    public void iHaveToSeeTheSameDataLikeOnTheUsersAndRolesSite() {
    }

    @Then("I have to see the same data like on the People section of the Glass Documentation")
    public void iHaveToSeeTheSameDataLikeOnThePeopleSectionOfTheGlassDocumentation() {
    }

    @And("I save the Administrators name and quantity")
    public int iSaveTheAdministratorsNameAndQuantity() {
        return peoplePage.saveAdministratorData();
    }

    @Then("I have to assert the num of the jira-administrators user quantity")
    public void iHaveToAssertTheNumOfTheJiraAdministratorsUserQuantity() {
        int jiraAdministratorQuantity = administrationGroupPage.getNunOfJiraAdministratorQuantity();
        Assert.assertEquals(jiraAdministratorQuantity, iSaveTheAdministratorsNameAndQuantity());
    }

    @And("navigate to Administration group site")
    public void navigateToAdministrationGroupSite() {
        peoplePage.navigateToAdministrationGroupPage();
    }

    @And("I click on the Glass documentation")
    public void iClickOnTheGlassDocumentation() {
        peoplePage.clickOnGlassDocumentation();
    }

    @And("I click on the Simple User delete button")
    public void iClickOnTheSimpleUserDeleteButton() {
        projectSettingPage.clickOnSimpleUserDeleteButton();
    }
}
