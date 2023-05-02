package org.example.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.time.Duration;

public abstract class PageObject {

    @Autowired
    protected WebDriver driver;

    WebDriverWait wait;

    @PostConstruct
    public void init() {
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));
    }

    // Re-usable functions
    public void click(WebElement element){
        waitForElement(element);
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }

    public void typeText(WebElement element, String text){
        waitForElement(element);
        element.sendKeys(text);
    }

    public boolean isElementDisplayed(WebElement element){
        try {
            return element.isDisplayed();
        }catch (NoSuchElementException e){
            return false;
        }
    }

    public void waitForElement(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
