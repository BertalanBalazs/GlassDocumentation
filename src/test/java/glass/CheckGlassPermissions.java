package glass;

import com.codecool.tw6.glass.pages.GeneralPage;
import com.codecool.tw6.glass.pages.GlassPermissionPage;
import com.codecool.tw6.glass.pages.LoginPage;
import com.codecool.tw6.glass.utility.BrowserFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CheckGlassPermissions {

    GeneralPage generalPage = new GeneralPage(BrowserFactory.getWebDriver(System.getenv("BROWSER")));
    LoginPage loginPage = new LoginPage(BrowserFactory.getWebDriver(System.getenv("BROWSER")));
    GlassPermissionPage permissionPage = new GlassPermissionPage(BrowserFactory.getWebDriver(System.getenv("BROWSER")));

    @Given("I am logged in as system admin")
    public void iAmLoggedInAsSystemAdmin() {
        loginPage.login();
    }

    @And("I am on the Permission Test Project page")
    public void iAmOnThePermissionTestProjectPage() {
        generalPage.navigate("https://jira2.codecool.codecanvas.hu/projects/PERMTEST?selectedItem=com.codecanvas.glass:glass");
    }

    @When("I click on the Permissions button")
    public void iClickOnThePermissionsButton() {
        generalPage.clickToPermissions();
    }

    @Then("Ensure it displays the right permissions for the different roles")
    public void ensureItDisplaysTheRightPermissionsForTheDifferentRoles() {
        String[][] dataFromCsv = permissionPage.readPermissionDataFromCsv();
        String[][] checkPermissionWithGlassList = permissionPage.getPermissionList(12);
        assertArrayEquals(dataFromCsv, checkPermissionWithGlassList);
    }


}
