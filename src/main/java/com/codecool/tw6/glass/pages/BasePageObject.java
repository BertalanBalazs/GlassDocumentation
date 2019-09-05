package com.codecool.tw6.glass.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePageObject {
    private static final String BROWSER = System.getenv("BROWSER");
    WebDriver driver;


    public BasePageObject(WebDriver driver){
        this.driver = driver;
    }

    public static String getBrowser(){
        return BROWSER;
    }

    public void navigate(String location){
        driver.get(location);
    }

    public void waitForElement(WebElement element, int time){
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForListOfElements(List<WebElement> element, int time){
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.visibilityOfAllElements(element));
    }
}
