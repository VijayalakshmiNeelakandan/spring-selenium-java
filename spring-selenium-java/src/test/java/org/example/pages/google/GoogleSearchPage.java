package org.example.pages.google;

import org.example.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

@Component
@Scope(SCOPE_CUCUMBER_GLUE)
public class GoogleSearchPage extends PageObject {

    @Autowired
    GoogleCookiePopup googleCookiePopup;

    @Value("${aut.url}")
    private String url;

    @FindBy(name = "q")
    WebElement searchBox;

// method to open the Google url and accept the cookies
    public void openURL() {
        driver.get(url);
        googleCookiePopup.acceptCookie();
    }

    // method to search for 'J.P. Morgan' search term
    public void searchFor(String searchTerm) {
        typeText(searchBox, searchTerm + Keys.ENTER);
    }
}
