package com.sidenis.qaacademy.common;

import io.restassured.RestAssured;

/**
 * Started by ML on 9/8/2018.
 */
public class BasePetStoreTest {
    static {
        RestAssured.baseURI = "https://petstore.swagger.io/v2";
    }
}
