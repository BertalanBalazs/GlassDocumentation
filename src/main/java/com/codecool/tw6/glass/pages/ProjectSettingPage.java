package com.codecool.tw6.glass.pages;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProjectSettingPage extends BasePageObject {

    @FindBy(xpath = "//button[@id='roles-add-users-button']")
    WebElement addUserToRoleIcon;

    @FindBy(xpath = "//button[@data-user-name='simpleuser']/span[@class='icon-default aui-icon aui-icon-small aui-iconfont-delete']")
    WebElement simpleUserDeleteButton;

    @FindBy(xpath = "//textarea[@id='roles-usergroup-picker-textarea']")
    WebElement userInput;

    @FindBy(xpath = "//a[@class='aui-list-item-link aui-iconised-link']")
    WebElement user;

    @FindBy(xpath = "//select[@id='roles-role-picker']")
    WebElement rolePicker;

    @FindBy(xpath = "//*[@id=\"roles-role-picker\"]/option[@value='10100']")
    WebElement pickDeveloper;

    @FindBy(xpath = "//input[@id='roles-add-usergroup-save-button']")
    WebElement addUserToRoleButton;


    @FindBy(xpath = "//*[@id='project-config-panel-workflows']/table/tbody//a[text()='Test Workflow']")
    private WebElement testWorkflow;

    public ProjectSettingPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public boolean isTestWorkflowPresent(){
        try{
            waitFor(testWorkflow, 10);
            return true;
        } catch (TimeoutException e){
            System.out.println("Test Workflow not found on page.");
            return false;
        }
    }


    public void clickOnAddUserToRoleIcon() {
        addUserToRoleIcon.click();
    }

    public void clickOnSimpleUserDeleteButton() {
        simpleUserDeleteButton.click();
    }

    public void sendKeyToUserInput(String simple_user) {
        userInput.sendKeys(simple_user);
    }

    public void clickOnTheUser() {
        user.click();
    }

    public void clickOnRolePicker() {
        rolePicker.click();
    }

    public void clickOnDevelopers() {
        pickDeveloper.click();
    }

    public void clickOnAddUserToRoleButton() {
        addUserToRoleButton.click();
    }

/*    public List<String> getDevelopersNameAndQuantity() {
        return;
    }*/
}
