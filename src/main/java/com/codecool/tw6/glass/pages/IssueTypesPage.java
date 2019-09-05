package com.codecool.tw6.glass.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class IssueTypesPage extends BasePageObject {

    public IssueTypesPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    WebDriverWait wait;

    @FindBy(id = "glass-workflow-panel-title") private WebElement panelTitle;
    @FindBy(xpath = "//div[#'glass-workflow-panel']//h2/a/span") private List<WebElement> issueTypesQuickLinks;

    public void clickOnQuickLink(String innerHeader) {
        wait.until(ExpectedConditions.visibilityOf(panelTitle));
        for (WebElement issueTypeQuickLink : issueTypesQuickLinks) {
            if (innerHeader.equals(issueTypeQuickLink)) {
                issueTypeQuickLink.click();
            }
        }
    }
}
