package org.example.pages.google;

import org.example.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

@Component
@Scope(SCOPE_CUCUMBER_GLUE)
public class GoogleCookiePopup extends PageObject {

    @FindBy(id = "L2AGLb")
    WebElement btnAcceptCookie;

    @FindBy(id = "W0wltc")
    WebElement btnRejectCookie;

    // method to manage the cookies by clicking Accept button
    public void acceptCookie(){
        click(btnAcceptCookie);
    }
}
