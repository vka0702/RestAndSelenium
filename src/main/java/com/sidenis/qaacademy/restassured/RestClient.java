package com.sidenis.qaacademy.restassured;

import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.apache.http.HttpStatus;

/**
 * Started by ML on 9/2/2018.
 */
public class RestClient {
    public ValidatableResponse readByGet(RequestSpecification rs, String url) {
        return rs.get(url).then().statusCode(HttpStatus.SC_OK).contentType(ContentType.JSON);
    }

    public ValidatableResponse createByPost(RequestSpecification rs, String url, Object body) {
        return rs.body(body).post(url).then().contentType(ContentType.JSON);
    }
}
