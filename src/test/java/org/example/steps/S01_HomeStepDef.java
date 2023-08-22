package org.example.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P01_homePage;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.Locale;

public class S01_HomeStepDef {
    P01_homePage home= new P01_homePage();

    @Given("user select language as English")
    public void user_select_language_as_english() {
         home.changeLanToEnglish().click();
    }

    @When("user select country as {string}")
    public void user_select_country_as_egypt(String country) {
        home.getArrow().click();
        home.getCountry(country).click();
    }
    @Then("home Page reloaded and Packages will displayed {string} with {string} and {string}")
    public void home_page_reloaded_and_packages_will_displayed_with_and(String name, String price, String currency) {

        String namePac=home.getPackageName(name);
      //  SoftAssert s = new SoftAssert();

        Assert.assertEquals(name,namePac);
        Assert.assertEquals(price,home.getPrice(name));
        Assert.assertEquals(currency,home.getCurrency(name));



    }



}
