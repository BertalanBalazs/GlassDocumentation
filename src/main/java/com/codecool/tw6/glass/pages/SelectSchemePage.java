package com.codecool.tw6.glass.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SelectSchemePage extends BasePageObject{

    @FindBy(id = "associate-submit")
    private WebElement associateSubmitButton;

    @FindBy(id = "login-form-authenticatePassword")
    private WebElement authenticatePasswordField;

    @FindBy(id="schemeId_select")
    private WebElement schemeSelect;

    @FindBy(xpath = "//option[@id='schemeId_select_10319']")
    private WebElement demoSchemeOption;

    @FindBy(id="ok_submit")
    private WebElement submitButton;
    //selectByVisibleText("text here");

    @FindBy(id="login-form-submit")
    private WebElement loginButton;
    //selectByVisibleText("text here")

    @FindBy(id="workflow-mapping-submit")
    private Select confirmWorkflowAssociateButton;

    public SelectSchemePage(WebDriver driver) {
        super(driver);
    }

    public void selectSchemeByValue(String scheme){
        waitForElement(demoSchemeOption);
        demoSchemeOption.click();
        submitButton.click();
    }

    public void enterAdminPassword(){
        waitForElement(authenticatePasswordField);
        authenticatePasswordField.sendKeys(System.getenv("PASSWORD"));
        loginButton.click();
    }

}
