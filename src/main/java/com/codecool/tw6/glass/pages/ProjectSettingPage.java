package com.codecool.tw6.glass.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ProjectSettingPage extends BasePageObject {
    public ProjectSettingPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
