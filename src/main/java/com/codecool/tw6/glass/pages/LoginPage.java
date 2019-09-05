package com.codecool.tw6.glass.pages;

import com.codecool.tw6.glass.utility.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePageObject {
    @FindBy(id = "login-form-username")
    private static WebElement username;
    @FindBy(id = "login-form-password")
    private static WebElement password;
    @FindBy(id = "login")
    private static WebElement loginBtn;
    @FindBy(id = "logo")
    private static WebElement logo;
    @FindBy(id = "header-details-user-fullname")
    private WebElement header;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login() {
        navigateToLoginPage();
        wait.until(ExpectedConditions.visibilityOf(username)).sendKeys(System.getenv("JIRAUSER"));
        wait.until(ExpectedConditions.visibilityOf(password)).sendKeys(System.getenv("PASSWORD"));
        wait.until(ExpectedConditions.visibilityOf(loginBtn)).click();
        wait.until(ExpectedConditions.visibilityOf(header));
    }
}