package com.sidenis.qaacademy.restassured.controller.petstore;

import com.sidenis.qaacademy.restassured.vo.petstore.Pet;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

/**
 * Started by ML on 9/2/2018.
 */
public final class PetsController {
    private static String BASE_PATH = "/pet";
    private final static RequestSpecification rs = given()
            .basePath(BASE_PATH)
            .contentType(ContentType.JSON).log().all();


    public static Pet getPet(Long id) {
        return rs.get("/" + id + "/")
                .then().log().all().extract().as(Pet.class);
    }
}
