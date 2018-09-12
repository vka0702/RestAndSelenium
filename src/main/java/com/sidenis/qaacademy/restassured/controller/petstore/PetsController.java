package com.sidenis.qaacademy.restassured.controller.petstore;

import com.sidenis.qaacademy.restassured.vo.petstore.Pet;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/**
 * Started by ML on 9/2/2018.
 */
public final class PetsController {
    private static String BASE_PATH = "/pet";
    private final static RequestSpecification rs = given().basePath(BASE_PATH).contentType(ContentType.JSON).log().all();


    public static Pet getPet(Long id) {
        return rs.get("/" + id + "/").then().log().all().extract().as(Pet.class);
    }

    public static Pet postRequestTest(String pet){
        return rs.body(pet).post().then().log().all().extract().as(Pet.class);
    }

    public static Pet updatePet(String pet){
        //return rs.body(pet).put("name", "Bob").then().log().all().extract().as(Pet.class);
        return rs.body(pet).put().then().log().all().extract().as(Pet.class);
    }

    public static Pet[] findStatus(boolean isAvailable, boolean pending, boolean sold){

        //return rs.get("findByStatus?status=sold").then().log().all().extract().as(Pet[].class);
        String status = "findByStatus?status=";
        if (isAvailable){
            status += "available";
            if (pending){
                status += "&status=pending";
                if (sold){
                    status += "&status=sold";
                }
            }
        }
        if(pending){
            status += "pending";
            if(sold){
                status += "&status=sold";
            }
        }

        return rs.get(status).then().log().all().extract().as(Pet[].class);
    }
}
