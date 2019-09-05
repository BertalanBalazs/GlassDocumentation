package com.codecool.tw6.glass.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class GeneralPage extends BasePageObject{

    public GeneralPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    WebDriverWait wait;

    @FindBy(xpath = "//li[#'glass-general-nav']/a[@innertext='General']") private WebElement generalHeader;
    @FindBy(xpath = "//li[#'glass-people-nav']/a[@innertext='People']") private WebElement peopleHeader;
    @FindBy(xpath = "//li[#'glass-permissions-nav']/a[@innertext='Permissions']") private WebElement permissionsHeader;
    @FindBy(xpath = "//li[#'glass-notifications-nav']/a[@innertext='Notifications']") private WebElement notificationsHeader;

    @FindBy(xpath = "//a[@class='header-nav-item']") private List<WebElement> headerElements;
    @FindBy(xpath = "//div[#'glass-permissions-panel']//a/span[0]") private WebElement quickLink;

    @FindBy(xpath = "//?/div[@innertext='Issue Types']") private WebElement issueTypesDropdown;
    @FindBy(xpath = "//aui-item-link[1]/a[@role='menuitem']") private WebElement issueTypesDropdownFirstItem;

    public void clickOnHeaderItem(String headerItem) {
        wait.until(ExpectedConditions.visibilityOf(peopleHeader));
        for (WebElement headerElement : headerElements) {
            String headerText = headerElement.getText();
            if (headerItem.equals(headerText)) {
                headerElement.click();
            }
        }
    }

    public void clickOnQuickLink() {
        wait.until(ExpectedConditions.elementToBeClickable(quickLink));
        quickLink.click();
    }

    public void chooseTheFirstOptionOfIssueTypes() {
        wait.until(ExpectedConditions.elementToBeClickable(issueTypesDropdown));
        issueTypesDropdown.click();
        wait.until(ExpectedConditions.elementToBeClickable(issueTypesDropdownFirstItem));
        issueTypesDropdownFirstItem.click();
    }
}
