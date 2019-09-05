package com.codecool.tw6.glass.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdministrationGroupPage extends BasePageObject {
    public AdministrationGroupPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@href='UserBrowser.jspa?atl_token=B8JJ-D9OM-EFAD-NSMZ_d07dadf19c59f4bee4e0901e85a58dcbe8149575_lin&group=jira-administrators&emailFilter=']")
    WebElement numOfJiraAdministratorQuantity;


    public int getNunOfJiraAdministratorQuantity() {
        return Integer.parseInt(numOfJiraAdministratorQuantity.getText());
    }
}
