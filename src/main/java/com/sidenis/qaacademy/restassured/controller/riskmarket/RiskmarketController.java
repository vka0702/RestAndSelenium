package com.sidenis.qaacademy.restassured.controller.riskmarket;

import com.sidenis.qaacademy.common.Constants;

import java.util.Map;

import static io.restassured.RestAssured.given;

/**
 * Started by ML on 9/12/2018.
 */
public abstract class RiskmarketController {
    protected static Map<String, String> auth() {
        return given()
                .params("username", Constants.USERNAME, "password", Constants.PASSWORD, "grant_type", "password")
                .auth().preemptive().basic(Constants.USERNAME, Constants.PASSWORD)
                .when()
                .post("https://riskmarket-ext.sidenis.com/gateway/user-service/oauth/token?remember-me=true")
                .then().extract().cookies();
    }
}
