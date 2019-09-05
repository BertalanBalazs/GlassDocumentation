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
        this.driver=driver;
    }

    public static String getBrowser(){
        return BROWSER;
    }

    public void navigate(String location){
        driver.get(location);
    }

    public void waitForElement(WebElement element, int time){
        wait = new WebDriverWait(driver, time);
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
