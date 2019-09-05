package com.codecool.tw6.glass.pages;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AuthenticatePage {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(xpath = "//*[@id='login-form-authenticatePassword']")
    private static WebElement passwordField;

    @FindBy(xpath = "//*[@id='login-form-submit']")
    private static WebElement confirmBtn;

    public AuthenticatePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }

    public void authenticate(){
        try {
            wait.until(ExpectedConditions.visibilityOf(passwordField)).sendKeys(System.getenv("PASSWORD"));
            confirmBtn.click();
        } catch (TimeoutException e){
            System.out.println("No authentication needed");
        }
    }
}
