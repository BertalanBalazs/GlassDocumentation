package com.codecool.tw6.glass.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePageObject {
    private static String url = "https://jira2.codecool.codecanvas.hu/login.jsp";
    private WebDriver driver;
    WebDriverWait wait;


    @FindBy(id = "login-form-username")
    private static WebElement username;
    @FindBy(id = "login-form-password")
    private static WebElement password;
    @FindBy(id = "login-form-submit")
    private static WebElement loginBtn;
    @FindBy(id = "logo")
    private static WebElement logo;

    public LoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }


    public void login() {
        driver.get(url);
        wait.until(ExpectedConditions.visibilityOf(username));
                username.sendKeys(System.getenv("JIRAUSER"));
        wait.until(ExpectedConditions.visibilityOf(password));
                password.sendKeys(System.getenv("PASSWORD"));
                loginBtn.click();
        wait.until(ExpectedConditions.visibilityOf(logo));
    }

}
