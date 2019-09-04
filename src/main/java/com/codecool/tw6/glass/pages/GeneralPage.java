package com.codecool.tw6.glass.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GeneralPage extends BasePageObject{

    public GeneralPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    WebDriverWait wait;

    @FindBy(xpath = "//li[#'glass-people-nav']/a[@innertext='People']") private WebElement peopleHeader;
    @FindBy(xpath = "//li[#'glass-permissions-nav']/a[@innertext='Permissions']") private WebElement permissionsHeader;
    @FindBy(xpath = "//li[#'glass-notifications-nav']/a[@innertext='Notifications']") private WebElement notificationsHeader;
    @FindBy(xpath = "//div[#'glass-permissions-panel']//a/span") private WebElement quickLink;

    public void clickOnHeaderItem(WebElement headerItem) {
        wait.until(ExpectedConditions.visibilityOf(peopleHeader));
        headerItem.click();
    }

    public void clickOnQuickLink() {
        wait.until(ExpectedConditions.elementToBeClickable(quickLink));
        quickLink.click();
    }
}
