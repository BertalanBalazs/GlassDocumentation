package com.codecool.tw6.glass.pages;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdministrationPage {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(xpath = "//*[@id='workflows']")
    private static WebElement workflowsBtn;

    @FindBy(xpath = "//*[@id='workflow_schemes']")
    private static WebElement workflowSchemesBtn;

    @FindBy(xpath = "//*[@id='add-workflow']")
    private static WebElement addWorkflowBtn;

    @FindBy(xpath = "//*[@id='add-workflow-dialog']")
    private static WebElement createPopup;

    public AdministrationPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }

    public AdministrationPage clickOnMenu(String menu){
        switch (menu){
            case "Workflows":
                wait.until(ExpectedConditions.visibilityOf(workflowsBtn)).click();
                return this;
            case "Workflow Schemes":
                wait.until(ExpectedConditions.visibilityOf(workflowSchemesBtn)).click();
                return this;
            case "Add workflow":
                wait.until(ExpectedConditions.visibilityOf(addWorkflowBtn)).click();
                return this;
            default:
                return this;
        }
    }

    public boolean createPopUpShows(){
        try {
            wait.until(ExpectedConditions.visibilityOf(createPopup));
            return true;
        } catch (TimeoutException e){
            return false;
        }
    }



}
