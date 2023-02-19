package stepDefinitions.uiStepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CommonPage;

import static stepDefinitions.Hooks.driver;

public class US01_StepDefs {


    @Given("User goes to {string}")
    public void userGoesTo(String url) {
        driver.get(url);

    }

    @Then("User verifies the url is {string}")
    public void userVerifiesTheUrlIs(String url) {
        Assert.assertEquals(url, driver.getCurrentUrl());
    }


}
