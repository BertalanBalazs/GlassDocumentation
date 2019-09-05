package com.codecool.tw6.glass.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ReleasesPage extends BasePageObject {
    @FindBy(xpath = "//div[@class='releases-add__name']/input[@class='text' and 1]")
    private WebElement versionNameInputField;

    @FindBy(xpath = "//input[@id='version-filter-text']")
    private WebElement searchVersionInputField;

    @FindBy(xpath = "//*[@class='aui-button aui-button-primary']")
    private WebElement newVersionAddButton;

    @FindBy(xpath = "https://jira2.codecool.codecanvas.hu/projects/DEMO?selectedItem=com.atlassian.jira.jira-projects-plugin%3Arelease-page&status=no-filter")
    private WebElement versionDropdownMenu;

    @FindBy(xpath = "//a[@class='project-config-operations-delete']")
    private WebElement deleteVersionButton;

    @FindBy(xpath = "//input[@id='submit']")
    private WebElement confirmDeleteButton;

    public ReleasesPage(WebDriver webDriver) {
        super(webDriver);
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

    public void deleteVersion(String versionName) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(searchVersionInputField));
        findVersion(versionName);
        versionDropdownMenu.click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//a[@class='project-config-operations-delete']")).click();
        deleteVersionButton.click();
        Thread.sleep(1500);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='info-message']")));
        confirmDeleteButton.click();
    }
}