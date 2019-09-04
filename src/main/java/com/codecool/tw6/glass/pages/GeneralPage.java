package com.codecool.tw6.glass.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GeneralPage extends BasePageObject{

    @FindBy(xpath = "//td[text() = 'Issue Types']")
    private WebElement IssueTypesLabel;

    public GeneralPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


//    public List<WebElement> getIssueTypeIcons() {
//        return driver.findElements(By.xpath("//h4[@class='card-title' and text()=\"%s\"]/../..//button"));
//    }

//    public boolean isIssueTypeIconPresent() {
//
//    }
}
