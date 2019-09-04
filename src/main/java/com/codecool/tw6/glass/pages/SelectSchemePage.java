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
    private Select schemeSelect;

    @FindBy(id="ok_submit")
    private Select submitButton;
    //selectByVisibleText("text here");

    @FindBy(id="workflow-mapping-submit")
    private Select confirmWorkflowAssociateButton;

    public SelectSchemePage(WebDriver driver) {
        super(driver);
    }

    public void selectSchemeByText(String scheme){
        schemeSelect.selectByVisibleText(scheme);
    }

    public void enterAdminPassword(){
        authenticatePasswordField.sendKeys(System.getenv("adminPassword"));
    }
}
