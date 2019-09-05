package com.codecool.tw6.glass.utility;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

    public static WebDriver getWebDriver(String browser) {

//        System.setProperty("webdriver.gecko.driver", "C:\\Codecool\\geckodriver.exe"); //TODO: remove this
        System.setProperty("webdriver.chrome.driver", "E:\\TestAutomation\\chromedriver_win32\\chromedriver.exe"); //TODO: remove this

        switch (browser) {
            case "CHROME":
                return new ChromeDriver();
            case "FIREFOX":
                return new FirefoxDriver();
            case "IE":
                throw new IllegalArgumentException("C'mon nobody uses IE");
            default:
                throw new InvalidArgumentException("Sorry " + browser + " is not an option.");
        }
    }
}

