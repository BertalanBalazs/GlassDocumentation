package com.codecool.tw6.glass.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

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
}
