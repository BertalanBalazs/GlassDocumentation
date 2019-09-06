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
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;

public class ValidateBasSumPageStepdefs {
    private WebDriver driver = BrowserFactory.getWebDriver(System.getenv("BROWSER"));
    GeneralPage generalPage = new GeneralPage(driver);
    LoginPage loginPage = new LoginPage(driver);
    private String expectedvalue;
    private String resultValue;

    @Given("I am on the Basic Summary page")
    public void iAmOnTheBasicSummaryPage() {
        loginPage.login();
        generalPage.navigate("https://jira2.codecool.codecanvas.hu/projects/DEMO?selectedItem=com.codecanvas.glass:glass");
    }

    @When("I check the {string}'s value")
    public void iCheckTheSValue(String key) {
        expectedvalue =generalPage.getValueForKey(key);

    }

    @And("click to the quick link")
    public void clickToTheQuickLink() {
        generalPage.clickToQuickLink();
    }

    @Then("The {string}s value at the below details equals with the checked value")
    public void theSValueAtTheBelowDetailsEqualsWithTheCheckedValue(String key) {
        resultValue = generalPage.getvalueFromDetails(key);
        assertEquals(expectedvalue, resultValue);
    }

}

