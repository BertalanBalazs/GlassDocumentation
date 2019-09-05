package com.codecool.tw6.glass.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePageObject {
    private static final String BROWSER = System.getenv("BROWSER");
    protected WebDriverWait wait;

    protected WebDriver driver;

    @FindBy(id="login-form-username")
    WebElement usernameInput;

    @FindBy(id = "login-form-username")
    WebElement passwordInput;


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

    public void logIn() {
        usernameInput.sendKeys("username");
        passwordInput.sendKeys("password");
    }
}
