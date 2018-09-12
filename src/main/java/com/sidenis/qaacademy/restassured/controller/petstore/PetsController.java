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
    private final static RequestSpecification rs = given().basePath(BASE_PATH).contentType(ContentType.JSON);


    public static Pet createPet(String pet) {
        return rs.body(pet).post().then().log().all().extract().as(Pet.class);
    }

    public static Pet updatePet(String pet) {
        return rs.body(pet).put().then().log().all().extract().as(Pet.class);
    }

    public static Pet[] getPetByStatus(boolean isAvailable, boolean pending, boolean sold) {
        String status = "findByStatus?status=";
        if (isAvailable) {
            status += "available";
            if (pending) {
                status += "&status=pending";
                if (sold) {
                    status += "&status=sold";
                }
            }
        }
        if (pending) {
            status += "pending";
            if (sold) {
                status += "&status=sold";
            }
        }
        return rs.get(status).then().log().all().extract().as(Pet[].class);
    }

    public static Pet getPetById(Long id) {
        return rs.get("/" + id)
                .then().log().all().extract().as(Pet.class);
    }


    public static Pet updatePetById(Long id, String name, String status) {
        return given().log().all()
                .basePath("/pet/" + id + "/").contentType(ContentType.URLENC)
                .formParam("name", name, "status", status)
                .when().post()
                .then().log().all().extract().as(Pet.class);
    }

    public static void deletePetById(Long id) {
        rs.delete("/" + id).then().contentType(ContentType.JSON).log().all();
    }
}
