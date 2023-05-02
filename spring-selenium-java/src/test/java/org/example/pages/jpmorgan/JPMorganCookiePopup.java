package org.example.pages.jpmorgan;

import org.example.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

@Component
@Scope(SCOPE_CUCUMBER_GLUE)
public class JPMorganCookiePopup extends PageObject {

    @FindBy(id = "onetrust-accept-btn-handler")
    public WebElement btnAcceptCookie;

// method to accept the Cookies in  J.P.Morgan's Home Page
    public void acceptCookie(){
        click(btnAcceptCookie);
    }
}
