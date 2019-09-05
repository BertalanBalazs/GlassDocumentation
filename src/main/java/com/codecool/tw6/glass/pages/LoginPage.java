package com.codecool.tw6.glass.pages;

import com.codecool.tw6.glass.utility.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    private static String url = "https://jira2.codecool.codecanvas.hu/";
    private WebDriver driver;
    private WebDriverWait wait;


    @FindBy(id = "login-form-username")
    private static WebElement username;
    @FindBy(id = "login-form-password")
    private static WebElement password;
    @FindBy(id = "login")
    private static WebElement loginBtn;
    @FindBy(id = "logo")
    private static WebElement logo;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }

    public void login() {
        driver.get(url);
        wait.until(ExpectedConditions.visibilityOf(username)).sendKeys(System.getenv("JIRAUSER"));
        wait.until(ExpectedConditions.visibilityOf(password)).sendKeys(System.getenv("PASSWORD"));
        wait.until(ExpectedConditions.visibilityOf(loginBtn)).click();
        wait.until(ExpectedConditions.visibilityOf(logo));
    }

}
