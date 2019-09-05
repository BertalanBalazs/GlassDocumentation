package glass;

import com.codecool.tw6.glass.pages.PeoplePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class PeopleUsersRoles {
    PeoplePage peoplePage;
    WebDriver driver;

    @Before
    public void setUp(){
        peoplePage = new PeoplePage(driver);
    }

    @Given("You are on the Temp - Project Configuration Documentation site")
    public void youAreOnTheTempProjectConfigurationDocumentationSite() {
        peoplePage.navigateToPeopleSite();
    }

    @When("I click on the {string}")
    public void iClickOnThe(String arg0) {
    }

    @And("I click on the Users and Roles link")
    public void iClickOnTheUsersAndRolesLink() {
    }

    @And("I click on the {string} link")
    public void iClickOnTheLink(String arg0) {
    }

    @And("I add Simple User as Developer")
    public void iAddSimpleUserAsDeveloper() {
    }

    @And("I save the Developers name and quantity")
    public void iSaveTheDevelopersNameAndQuantity() {
    }

    @Then("I have to see the same data like on the Users and Roles site")
    public void iHaveToSeeTheSameDataLikeOnTheUsersAndRolesSite() {
    }

    @And("I click on the {string} delete button")
    public void iClickOnTheDeleteIconButton(String arg0) {
    }

    @And("I save the Administrators and the Developers name and quantity")
    public void iSaveTheAdministratorsAndTheDevelopersNameAndQuantity() {
    }

    @And("I save the Administrators and the Developers num and type")
    public void iSaveTheAdministratorsAndTheDevelopersNumAndType() {
    }

    @Then("I have to see the same data like on the People section of the Glass Documentation")
    public void iHaveToSeeTheSameDataLikeOnThePeopleSectionOfTheGlassDocumentation() {
    }

    @And("I save the Administrators name and quantity")
    public void iSaveTheAdministratorsNameAndQuantity() {
    }

    @And("navigate to https:\\/\\/jira{int}.codecool.codecanvas.hu\\/secure\\/admin\\/user\\/GroupBrowser.jspa site")
    public void navigateToHttpsJiraCodecoolCodecanvasHuSecureAdminUserGroupBrowserJspaSite(int arg0) {
    }

    @Then("I have to assert the num of the jira-administrators user quantity")
    public void iHaveToAssertTheNumOfTheJiraAdministratorsUserQuantity() {
    }
}
