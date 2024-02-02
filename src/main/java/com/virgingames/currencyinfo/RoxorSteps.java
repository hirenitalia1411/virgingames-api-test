package com.virgingames.currencyinfo;

import com.virgingames.constants.EndPoints;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;

import static net.serenitybdd.rest.RestRequests.given;

public class RoxorSteps {

    @Step("Getting all JackPort information")
    public ValidatableResponse getAllJackPort() {
        return SerenityRest.given().log().all()
                .contentType(ContentType.JSON)
                .when()
                .get(EndPoints.GET_ALL_JACKPOT)
                .then();
    }

    @Step("Getting all JackPort information By currency GBP")
    public ValidatableResponse getAllJackPortCurrencyGBP() {
        return SerenityRest.given().log().all()
                .contentType(ContentType.JSON)
                .when()
                .get(EndPoints.GET_ALL_JACKPOT_GBP)
                .then().log().all();
    }

    @Step("Getting all JackPort information By currency EUR")
    public ValidatableResponse getAllJackPortCurrencyEUR() {
        return SerenityRest.given().log().all()
                .contentType(ContentType.JSON)
                .when()
                .get(EndPoints.GET_ALL_JACKPOT_EUR)
                .then().log().all();
    }

    @Step("Getting all JackPort information By currency SEK")
    public ValidatableResponse getAllJackPortCurrencySEK() {
        return SerenityRest.given().log().all()
                .contentType(ContentType.JSON)
                .when()
                .get(EndPoints.GET_ALL_JACKPOT_SEK)
                .then().log().all();
    }

    @Step("Getting name corresponding to the id")
    public ValidatableResponse getNameRelatedWithId() {
        return given()
                .when()
                .get(EndPoints.GET_ALL_JACKPOT_GBP)
                .then();
    }
}
