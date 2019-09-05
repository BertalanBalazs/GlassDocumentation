package com.codecool.tw6.glass.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class PeoplePage extends BasePageObject {

    @FindBy(xpath = "//td[@class='roles-group-name js-role-group-name']/aui-badge[1]")
    WebElement jiraAdministratorQuantity;

    @FindBy(id = "glass-people-nav")
    WebElement peopleSite;

    @FindBy(xpath = "//*[@href='/plugins/servlet/project-config/DEMO/roles']/span")
    WebElement usersAndRolesLink;

    @FindBy(xpath = "//span[@class='aui-icon aui-icon-large glass-project-icon']")
    WebElement glassDocumentation;


    public PeoplePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public int saveAdministratorData() {
        return Integer.parseInt(jiraAdministratorQuantity.getText());
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
        wait.until(ExpectedConditions.visibilityOf(peopleSite));
        wait.until(ExpectedConditions.elementToBeClickable(peopleSite));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        peopleSite.click();
    }

    public void clickOnGlassDocumentation() {
        glassDocumentation.click();
    }
}
