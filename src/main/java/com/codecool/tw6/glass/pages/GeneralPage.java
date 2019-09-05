package com.codecool.tw6.glass.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GeneralPage extends BasePageObject{

    @FindBy(xpath = "//a[@id='aui-uid-3']")
    private WebElement schemesTabLink;

    //get current scheme, which is the first td next to the scheme title
    @FindBy(xpath = "//td[@class='project-meta-label'][contains(.,'Issue Type Scheme')]//following-sibling::td[1]")
    private WebElement currentIssueTypeSchemeCell;

    public GeneralPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickSchemesTabLink(){
        waitForElement(schemesTabLink);
        schemesTabLink.click();
    }

    public String getCurrentIssueTypeSchemeText(){
        waitForElement(currentIssueTypeSchemeCell);
        return currentIssueTypeSchemeCell.getText();
    }

}
