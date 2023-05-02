package org.example.stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pages.jpmorgan.HomePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;

public class JPMorganStepDefs {

    @Autowired
    HomePage homePage;

    @Then("I landed on J. P. Morgan Home page")
    public void onJPMorganPage() {
        Assert.assertTrue(homePage.getUrl().startsWith("https://www.jpmorgan.com"));
    }

    @Then("the logo should be displayed on the page")
    public void logoDisplayed() {
        Assert.assertTrue(homePage.isLogoDisplayed());
    }

    @And("the J. P. Morgan Home page and the logo should not be displayed on the page")
    public void homePageLogoNotDisplayed() {
        Assert.assertFalse(homePage.getAdUrl().startsWith("https://www.jpmorgan.com"));
        Assert.assertFalse(homePage.isLogoDisplayed());
    }
}