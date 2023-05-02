package org.example.pages.google;

import org.example.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

@Component
@Scope(SCOPE_CUCUMBER_GLUE)
public class SearchResultsPage extends PageObject {

    @FindBy(tagName = "h3")
    public List<WebElement> searchResults;

    // method to click on the First returned search result
    public void clickFirstResult(){
        WebElement firstResult = searchResults.stream().findFirst().get();
        click(firstResult);
        System.out.println( "*************** First Search Link is clicked *************");
    }

}
