package com.sidenis.qaacademy.restassured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static com.sidenis.qaacademy.common.Constants.BASE_URI;
import static com.sidenis.qaacademy.common.Constants.PASSWORD;
import static com.sidenis.qaacademy.common.Constants.USERNAME;
import static io.restassured.RestAssured.given;

/**
 * Started by ML on 9/2/2018.
 */
public class User {
    private RequestSpecification rs;

    private User(String login, String password) {
        RestAssured.reset();
        this.rs = given().auth().preemptive().basic(login, password).accept(ContentType.JSON);
    }

    public static User user() {
        User res = new User(USERNAME, PASSWORD);
        res.rs.baseUri(BASE_URI);
        return res;
    }
}
