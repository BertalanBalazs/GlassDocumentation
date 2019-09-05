package com.codecool.tw6.glass.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePageObject {
    private static final String BROWSER = System.getenv("BROWSER");
    private WebDriverWait wait;

    protected WebDriver driver;

    public BasePageObject(WebDriver driver) {
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 10);
        this.driver=driver;
    }

    public static String getBrowser(){
        return BROWSER;
    }

    public void navigate(String location){
        driver.get(location);
    }

    // project can be either: DEMO or ST
    public void openProjectPage(String project){
        driver.get("https://jira2.codecool.codecanvas.hu/projects/" + project + "?selectedItem=com.codecanvas.glass:glass");
    }

    public void waitForElement(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForElement(WebElement element, int waitTime){
        WebDriverWait wait = new WebDriverWait(driver, waitTime);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public WebElement waitFor(WebElement element, int time){
        wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    public void waitForListOfElements(List<WebElement> elements, int time){
        wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.visibilityOfAllElements(elements));
    }
}
