package com.sidenis.qaacademy.restassured.controller.riskmarket;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Cookies;
import io.restassured.specification.RequestSpecification;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class InternalController {
    private static String BASE_PATH = "/internal";
    private final static RequestSpecification rs = given()
            .basePath(BASE_PATH)
            .contentType(ContentType.JSON)/*.log().all()*/;

    public  static Map<String, String> takeMeFull() {
        RestAssured.useRelaxedHTTPSValidation();
        return given()
                .header("X-XSRF-TOKEN", "null_csrf")
                .contentType("application/x-www-form-urlencoded")
                .formParam("grant_type","password")
                .formParam("username","kirill.vasilyev@sidenis.com")
                .formParam("password", "3KSa9uDGNA")
                .post("https://riskmarket-ext.sidenis.com/gateway/user-service/oauth/token?remember-me=true")
                .then()/*.log().all()*/.extract().cookies();

    }

    public static String getCurrentUser() {
        return rs.cookies(takeMeFull())
                .get("/current/user")
                .then()/*.log().all()*/.extract().response().asString();
    }

    public static String getCurrntUserEmail() {
        return rs.cookies(takeMeFull())
                .get("/current/user/email")
                .then()/*.log().all()*/.extract().response().asString();
    }
}
