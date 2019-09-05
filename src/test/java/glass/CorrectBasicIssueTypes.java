package glass;

import com.codecool.tw6.glass.pages.GeneralPage;
import com.codecool.tw6.glass.pages.LoginPage;
import com.codecool.tw6.glass.utility.BrowserFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CorrectBasicIssueTypes {

    GeneralPage generalPage = new GeneralPage(BrowserFactory.getWebDriver(System.getenv("BROWSER")));
    LoginPage loginPage = new LoginPage(BrowserFactory.getWebDriver(System.getenv("BROWSER")));

    List<String> appliedScheme = new ArrayList<>();

    @Given("I am logged in as an admin")
    public void iAmLoggedInAsAnAdmin() {
        loginPage.login();
    }

    @And("The following scheme is applied to the project:")
    public void theFollowingSchemeIsAppliedToTheProject(List<String> scheme) {
        appliedScheme = scheme;
    }

    @When("I go to the project page")
    public void iGoToTheProjectPage() {
        generalPage.navigate("https://jira2.codecool.codecanvas.hu/projects/DEMO?selectedItem=com.codecanvas.glass:glass");
    }

    @Then("I see the icons related to the scheme")
    public void iSeeTheIconsRelatedToTheScheme() {
        assertTrue(generalPage.areIconsCorrect(appliedScheme));
    }
}
