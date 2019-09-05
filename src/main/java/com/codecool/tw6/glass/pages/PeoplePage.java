package com.codecool.tw6.glass.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.w3c.dom.html.HTMLInputElement;


public class PeoplePage extends BasePageObject {
    @FindBy(xpath = "//a[text()='People']")
    WebElement peopleSite;

    @FindBy(xpath = "//*[@href='/plugins/servlet/project-config/DEMO/roles']/span")
    WebElement usersAndRolesLink;

    @FindBy(xpath = "//span[@class='aui-icon aui-icon-large glass-project-icon']")
    WebElement glassDocumentation;


    public PeoplePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void navigateToProjectSite(){
        driver.navigate().to("https://jira2.codecool.codecanvas.hu/projects/DEMO?selectedItem=com.codecanvas.glass:glass");
    }

    public UsersAndRolesPage clickOnUsersAndRolesLink() {
        usersAndRolesLink.click();
        return new UsersAndRolesPage(driver);
    }

    public void navigateToAdministrationGroupPage() {
        driver.navigate().to("https://jira2.codecool.codecanvas.hu/secure/admin/user/GroupBrowser.jspa");
    }

    public void clickOnPeopleSection() {
        peopleSite.click();
    }

    public void clickOnGlassDocumentation() {
        glassDocumentation.click();
    }
}
