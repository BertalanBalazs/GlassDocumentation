package com.codecool.tw6.glass.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;



public class PeoplePage extends BasePageObject {
    @FindBy(xpath = "//a[text()='People']")
    WebElement peopleSite;


    public PeoplePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void navigateToPeopleSite(){
        driver.navigate().to("https://jira2.codecool.codecanvas.hu/projects/DEMO?selectedItem=com.codecanvas.glass:glass");
        peopleSite.click();
    }
}
