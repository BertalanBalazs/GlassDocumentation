package glass;

import com.codecool.tw6.glass.pages.GeneralPage;
import com.codecool.tw6.glass.pages.GlassPermissionPage;
import com.codecool.tw6.glass.pages.LoginPage;
import com.codecool.tw6.glass.utility.BrowserFactory;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CheckGlassPermissions {

    private WebDriver driver = BrowserFactory.getWebDriver(System.getenv("BROWSER"));
    private GeneralPage generalPage = new GeneralPage(driver);
    private LoginPage loginPage = new LoginPage(driver);
    private GlassPermissionPage permissionPage = new GlassPermissionPage(driver);

    @After("@glassPermission")
    public void tearDown(){
        driver.quit();
    }

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
        String[][] checkPermissionWithGlassList = permissionPage.getPermissionList(10);
        assertArrayEquals(dataFromCsv, checkPermissionWithGlassList);
    }


}
