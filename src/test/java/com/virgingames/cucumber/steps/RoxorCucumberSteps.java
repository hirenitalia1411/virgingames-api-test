package com.virgingames.cucumber.steps;

import com.virgingames.currencyinfo.RoxorSteps;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;

import java.util.Objects;

public class RoxorCucumberSteps {
    static ValidatableResponse response;

    @Steps
    RoxorSteps roxorSteps;

    @When("I sends a GET request to get the pots with {string}")
    public void iSendsAGETRequestToGetThePotsWith(String currency) {
        if (Objects.equals(currency, "GBP")){
            response = roxorSteps.getAllJackPortCurrencyGBP();
        } else if (Objects.equals(currency, "EUR")) {
            response = roxorSteps.getAllJackPortCurrencyEUR();
        } else if (Objects.equals(currency, "SEK")){
            response = roxorSteps.getAllJackPortCurrencySEK();
        } else {
            System.out.println("No pot found with selected currency");
        }
    }

    @Then("I must get back a valid status code {int}")
    public void iMustGetBackAValidStatusCode(int statusCode) {
        response.statusCode(200);
    }

    @Then("I send {string} to find corresponding {string}")
    public void iSendToFindCorresponding(String id1, String name) {
        String name1 = response.extract().path("data.pots.findAll{it.id == '"+id1+"'}.name[0]");
        Assert.assertEquals("Name is not matched with ID", name1, name);
    }
}