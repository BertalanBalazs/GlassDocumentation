package com.codecool.tw6.glass.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class IssueTypesPage extends BasePageObject {

    public IssueTypesPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
