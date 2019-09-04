package com.codecool.tw6.glass.pages;

import com.codecool.tw6.glass.utility.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    private static WebDriver driver = BrowserFactory.getWebDriver(System.getenv("BROWSER"));
    private static WebDriverWait wait = new WebDriverWait(driver, 10);

    public static void login(){
        WebElement userWin = driver.findElement(By.id("login-form-username"));
        WebElement passwordWin = driver.findElement(By.id("login-form-password"));
        WebElement loginButton = driver.findElement(By.id("login-form-submit"));
        driver.get("https://jira2.codecool.codecanvas.hu/login.jsp");
        wait.until(ExpectedConditions.visibilityOf(userWin));
        userWin.sendKeys(System.getenv("USER"));    // todo: Make a "USER" environment variable
        passwordWin.sendKeys(System.getenv("PASSWORD"));    //todo: Make a "PASSWORD" environment variable
        loginButton.click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("logo"))));


    }

}