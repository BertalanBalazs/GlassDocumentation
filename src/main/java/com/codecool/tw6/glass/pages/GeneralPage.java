package com.codecool.tw6.glass.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GeneralPage extends BasePageObject{
    @FindBy(xpath = "//div[@id=\"glass-general-panel\"]//descendant::table[@class=\"aui\"]/tbody/tr")
    private List<WebElement> summaryTable ;

    @FindBy(xpath = "//h2[contains(., 'Basic Summary')]/a")
    private WebElement quickLink;

    @FindBy(id = "project-config-header-name")
    private WebElement detailsTitle;

    @FindBy(xpath = "//input")
    private List<WebElement> detailPageInputs;

    @FindBy(id = "glass-workflow-nav")
    private WebElement issueTypeBtn;

    @FindBy(xpath = "//*[@id='dropdown-issuetypes']//a[@tabindex = -1 ]//span[text() = ' TestIssue']")
    private WebElement testIssueBtn;

    WebDriver driver;

    public GeneralPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getValueForKey(String expectedKey) {
        waitForListOfElements(summaryTable, 10);
        String result = "I am empty :(";
        for (WebElement row : summaryTable) {
            String key = row.findElement(By.xpath("./td[1]")).getText();
            if(key.equals(expectedKey)){
                result = row.findElement(By.xpath("./td[2]")).getText();
            }

        }
        return result;
    }

    public void clickToQuickLink() {
        quickLink.click();
        String currentTab = driver.getWindowHandle();
        for (String tab : driver.getWindowHandles()) {
            if (!tab.equals(currentTab)) {
                driver.switchTo().window(tab);
            }
        }
        waitForElement(detailsTitle, 10);
    }

    public String getvalueFromDetails(String key) {
        String result = "";
        for (WebElement input : detailPageInputs) {
            String inputName =input.getAttribute("name");
            System.out.println("Inuput Name: "+inputName);
            if (inputName.equals(key)) {
                result = input.getAttribute("value");
                System.out.println("Result name: "+result);

            }
        }
        return result;
    }

    public void clickOnIssueTypeBtn(){
        waitFor(issueTypeBtn, 10);
        issueTypeBtn.click();
    }

    public void selectMenuItem(String buttonText){
        switch (buttonText){
            case "TestIssue":
                waitFor(testIssueBtn, 10).click();
                break;
        }
    }
}
