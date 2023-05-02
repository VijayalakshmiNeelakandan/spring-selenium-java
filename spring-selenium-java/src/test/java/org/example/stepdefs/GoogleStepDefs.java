package org.example.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.example.pages.google.GoogleSearchPage;
import org.example.pages.google.SearchResultsPage;
import org.springframework.beans.factory.annotation.Autowired;

public class GoogleStepDefs {

    @Autowired
    GoogleSearchPage googleSearchPage;

    @Autowired
    SearchResultsPage searchResultsPage;

    @Given("I am on the Google search page")
    public void onGooglePage() {
        googleSearchPage.openURL();
    }

    @When("I search for {string} into the search box")
    public void searchFor(String term) {
        googleSearchPage.searchFor(term);
    }

    @When("I click on the first search result link on the page")
    public void clickFirstResult() {
        searchResultsPage.clickFirstResult();
    }
}