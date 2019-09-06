package glass;

import com.codecool.tw6.glass.pages.GeneralPage;
import com.codecool.tw6.glass.pages.LoginPage;
import com.codecool.tw6.glass.utility.BrowserFactory;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CorrectBasicIssueTypes {

    WebDriver driver = BrowserFactory.getWebDriver(System.getenv("BROWSER"));
    List<String> appliedScheme = new ArrayList<>();

    GeneralPage generalPage = new GeneralPage(driver);
    LoginPage loginPage = new LoginPage(driver);

    @After("@correctBasicIssueTypes")
    public void tearDown(){
        driver.quit();
    }

    @Given("I am logged in as an admin")
    public void iAmLoggedInAsAnAdmin() {
        loginPage.login();
    }

    @And("The scheme with the following IssueTypes are applied to the project:")
    public void theFollowingSchemeIsAppliedToTheProject(List<String> scheme) {
        appliedScheme = scheme;
    }

    @When("I go to the project page")
    public void iGoToTheProjectPage() {
        generalPage.navigate("https://jira2.codecool.codecanvas.hu/projects/ISTY?selectedItem=com.codecanvas.glass:glass");
    }

    @Then("I see the icons related to the scheme")
    public void iSeeTheIconsRelatedToTheScheme() {
        assertTrue(generalPage.areIconsCorrect(appliedScheme));
    }

    @When("I click on the Issue Types dropdown")
    public void iClickOnTheIssueTypesDropdown() {
        generalPage.clickOnIssueTypeBtn();
    }

    @Then("I see the Issue Types related to the scheme")
    public void iSeeTheIssueTypesRelatedToTheScheme() {
        assertTrue(generalPage.areDropdownIssueTypesCorrect(appliedScheme));
    }
}
