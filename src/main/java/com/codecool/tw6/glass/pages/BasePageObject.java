package com.codecool.tw6.glass.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePageObject {
    private static final String BROWSER = System.getenv("BROWSER");

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

    public void waitForElement(WebElement element, int waitTime){
        WebDriverWait wait = new WebDriverWait(driver, waitTime);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
