package com.codecool.tw6.glass.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Keys;

public class ComponentsPage extends BasePageObject {
    private WebDriverWait wait;

    @FindBy(xpath = "//input[@id='component-filter-text']")
    private WebElement searchComponentInputField;

    @FindBy(xpath = "//div[@class='components-add__name']/input[@class='text']")
    private WebElement componentNameInputField;

    @FindBy(xpath = "//*[@id='assigneeType-field']")
    private WebElement assigneeInputField;

    @FindBy(xpath = "//button[text()='Add']")
    private WebElement newComponentAddButton;

    @FindBy(xpath = "//a/span[@class='aui-icon aui-icon-small aui-iconfont-more' and 1]")
    private WebElement componentDropdownMenu;

    @FindBy(xpath = "//a[@class='component-delete-dialog deletecomponent_link']")
    private WebElement deleteComponentButton;

    @FindBy(xpath = "//input[@id='submit']")
    private WebElement deleteComponentSubmitButton;

    public ComponentsPage(WebDriver webDriver) {
        super(webDriver);
        wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }

    public void addTextToTheComponentNameInputField(String ComponentName) {
        componentNameInputField.sendKeys(ComponentName);
    }

    public void addTextToTheAssigneeInputField(String Assignee) {
        assigneeInputField.sendKeys(Assignee, Keys.RETURN);
    }

    public void clickOnNewComponentAddButton() {
        wait.until(ExpectedConditions.elementToBeClickable(newComponentAddButton));
        newComponentAddButton.click();
    }

    private void findComponent(String componentName) {
        searchComponentInputField.sendKeys(componentName);
    }

    public void deleteComponent(String versionName) {
        wait.until(ExpectedConditions.visibilityOf(searchComponentInputField));
        findComponent(versionName);
        componentDropdownMenu.click();
        deleteComponentButton.click();
        deleteComponentButton.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.RETURN);
        deleteComponentSubmitButton.click();
        deleteComponentSubmitButton.click();
        deleteComponentSubmitButton.sendKeys(Keys.RETURN, Keys.ENTER);
    }
}