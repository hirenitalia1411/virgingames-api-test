package com.virgingames.currencyinfo;

import com.virgingames.testbase.TestBase;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.annotations.Title;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class Roxor extends TestBase {
    @Steps
    RoxorSteps roxorSteps;

    @Title("Getting all jackport inforamtion")
    @Test
    public void test001(){
        ValidatableResponse response = roxorSteps.getAllJackPort();
        response.log().all().statusCode(200);

    }
}
