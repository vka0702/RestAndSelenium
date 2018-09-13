package com.sidenis.qaacademy.common;

import io.restassured.RestAssured;

public class BaseRiskMarketTest {
    static {
        RestAssured.useRelaxedHTTPSValidation();
        RestAssured.baseURI = "https://riskmarket-ext.sidenis.com/gateway";
    }
}
