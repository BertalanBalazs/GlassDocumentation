package com.codecool.tw6.glass.pages;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProjectSettingPage extends BasePageObject {

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
}
