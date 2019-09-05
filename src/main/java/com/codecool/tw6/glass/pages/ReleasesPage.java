package com.codecool.tw6.glass.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReleasesPage extends BasePageObject {
    private WebDriverWait wait;

    @FindBy(xpath = "//div[@class='releases-add__name']/input[@class='text' and 1]")
    private WebElement versionNameInputField;

    @FindBy(xpath = "//input[@id='version-filter-text']")
    private WebElement searchVersionInputField;

    @FindBy(xpath = "//*[@class='aui-button aui-button-primary']")
    private WebElement newVersionAddButton;

    @FindBy(xpath = "//span[@class='aui-icon aui-icon-small aui-iconfont-more']")
    private WebElement versionDropdownMenu;

    @FindBy(xpath = "//a[@class='project-config-operations-delete']")
    private WebElement deleteVersionButton;

    @FindBy(xpath = "//input[@id='submit']")
    private WebElement confirmDeleteButton;


    public ReleasesPage(WebDriver webDriver) {
        super(webDriver);
        wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }

    public void addTextToTheInputField(String versionName) {
        versionNameInputField.sendKeys(versionName);
    }

    public void clickOnNewVersionAddButton() {
        newVersionAddButton.click();
    }

    private void findVersion(String versionName) {
        searchVersionInputField.sendKeys(versionName);
    }

    public void deleteVersion(String versionName) {
        wait.until(ExpectedConditions.visibilityOf(searchVersionInputField));
        findVersion(versionName);
        versionDropdownMenu.click();
        deleteVersionButton.click();
        confirmDeleteButton.click();
    }
}