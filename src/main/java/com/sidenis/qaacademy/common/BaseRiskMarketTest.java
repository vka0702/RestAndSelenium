package com.sidenis.qaacademy.common;

import io.restassured.RestAssured;

/**
 * Started by ML on 9/8/2018.
 */
public class BaseRiskMarketTest {
    static {
        RestAssured.useRelaxedHTTPSValidation();
        RestAssured.baseURI = "https://riskmarket-ext.sidenis.com/gateway";
    }
}
