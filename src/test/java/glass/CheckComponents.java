package glass;

import com.codecool.tw6.glass.pages.GeneralPage;
import com.codecool.tw6.glass.pages.LoginPage;
import com.codecool.tw6.glass.utility.BrowserFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class CheckComponents {
    private WebDriver driver = BrowserFactory.getWebDriver(System.getenv("BROWSER"));
    LoginPage loginPage = new LoginPage(driver);
    GeneralPage generalPage = new GeneralPage(driver);

    @When("I click on Components text option.")
    public void iClickOnComponentsTextOption() {
    }

    @And("I fill the Version name input field with TestComponent text.")
    public void iFillTheVersionNameInputFieldWithTestComponentText() {
    }

    @And("I fill the Default assignee input field with Unassigned text.")
    public void iFillTheDefaultAssigneeInputFieldWithUnassignedText() {
    }

    @And("I click on the the Add button next to the new component input screen.")
    public void iClickOnTheTheAddButtonNextToTheNewComponentInputScreen() {
    }

    @Then("I see the TestComponent version in the list.")
    public void iSeeTheTestComponentVersionInTheList() {
    }
}
