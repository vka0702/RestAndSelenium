package com.sidenis.qaacademy.restassured.controller.riskmarket;

import com.sidenis.qaacademy.restassured.vo.riskmarket.RiskmarketUser;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

/**
 * Started by ML on 9/12/2018.
 */
public class InternalController extends RiskmarketController {

    private static String BASE_PATH = "/internal";
    private final static RequestSpecification rs = given()
            .basePath(BASE_PATH)
            .contentType(ContentType.JSON);

    public static RiskmarketUser getCurrentUser() {
        return rs.cookies(auth())
                .get("/current/user")
                .then().log().body().extract().as(RiskmarketUser.class);
    }
}
