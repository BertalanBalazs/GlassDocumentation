package com.codecool.tw6.glass.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePageObject {
    private static final String BROWSER = System.getenv("BROWSER");
    protected final WebDriver driver;
    protected WebDriverWait wait;

    public BasePageObject(WebDriver driver) {
        this.driver = driver;
        this.driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(this.driver, this);
    }

    public static String getBrowser() {
        return BROWSER;
    }

    public void navigateToLoginPage() {
        driver.navigate().to("https://jira2.codecool.codecanvas.hu/");
    }

    public void navigate(String location) {
        driver.get(location);
    }

    public void waitForElement(WebElement element, int time) {
        this.wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}