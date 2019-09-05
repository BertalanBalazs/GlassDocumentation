package com.codecool.tw6.glass.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GeneralPage extends BasePageObject{

    @FindBy(xpath = "//div[@id=\"glass-general-panel\"]//descendant::table[@class=\"aui\"]")
    private List<WebElement> summaryTable ;

    @FindBy(xpath = "//h2[contains(., 'Basic Summary')]/a")
    private WebElement quickLink;

    @FindBy(xpath = "project-edit")
    private WebElement detailsTitle;

    @FindBy(xpath = "//input")
    private List<WebElement> detailPageInputs;

    @FindBy(xpath = "//td[text() = 'Issue Types']")
    private WebElement issueTypesLabel;

    @FindBy(xpath = "//td[text() = 'Issue Types']/..//span")
    private List<WebElement> issueTypesIcons;


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

    public List<String> getIssueTypeIconTitles() {
        List<String> issueTypeIconTitles = new ArrayList<>();
        for (WebElement icon : issueTypesIcons) {
            issueTypeIconTitles.add(icon.getAttribute("title"));
        }
        return issueTypeIconTitles;
    }

    public boolean areIconsCorrect(List<String> actualIssueTypeIconTitles) {
        return new HashSet<>(getIssueTypeIconTitles()).equals(new HashSet<>(actualIssueTypeIconTitles));
    }


    public String getValueForKey(String expectedKey) {
        String result = "I am empty :(";
        for (WebElement row : summaryTable) {
            String key = row.findElement(By.xpath("./td[0]")).getText();
            if(key.equals(expectedKey)){
                result = row.findElement(By.xpath("./td[1]")).getText();
            }

        }
        return result;
    }

    public void clickToQuickLink() {
        quickLink.click();
        waitForElement(detailsTitle, 10);
    }

    public String getvalueFromDetails(String key) {
        String result = "";
        for (WebElement input : detailPageInputs) {
            if (input.getAttribute("name").equals(key.toLowerCase())) {
                result = input.getAttribute("value").toLowerCase();
            }
        }
        return result;
    }
}
