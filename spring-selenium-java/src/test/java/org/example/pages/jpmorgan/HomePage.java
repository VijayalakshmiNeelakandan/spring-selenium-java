package org.example.pages.jpmorgan;

import org.example.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.testng.Assert;

import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

@Component
@Scope(SCOPE_CUCUMBER_GLUE)
public class HomePage extends PageObject {

    @Autowired
    JPMorganCookiePopup jpMorganCookiePopup;

    @FindBy(css = ".site-nav .first-logo")
    public WebElement logo;

    // method to accept the J.P.Morgan Home Page cookies and to get the current url
    public String getUrl(){
        jpMorganCookiePopup.acceptCookie();
        return getCurrentUrl();
    }

    // method to get the current Ad url
    public String getAdUrl(){
        return getCurrentUrl();
    }

    // method to validate the presence of J.P Morgan's Logo
    public boolean isLogoDisplayed(){
        return isElementDisplayed(logo);
    }
}
