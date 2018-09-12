package com.sidenis.qaacademy.restassured.controller.petstore;

import com.sidenis.qaacademy.restassured.vo.petstore.Pet;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.put;

/**
 * Started by ML on 9/2/2018.
 */
public final class PetsController {
    private static String BASE_PATH = "/pet";
    private final static RequestSpecification rs = given()
            .basePath(BASE_PATH)
            .contentType(ContentType.JSON).log().all();


    public static Pet getPet(Long id) {
        return rs.get("/" + id + "/").then().log().all().extract().as(Pet.class);
        //return rs.get("/" +id).then().log().all().extract().statusCode()==200;

    }

    public static Response postPetbyId(Long id, String name, String status) {
        return given().log().all()
                .basePath("/pet/"+id+"/").contentType("application/x-www-form-urlencoded")
                .formParam("name",name)
                .formParam("status",status)
                .when().post()
                .then().log().all().extract().response();
    }

    public static Pet postPet() {
        return given().log().all()
                .basePath("/pet")
                .contentType(ContentType.JSON)
                .body("{\n" +
                        "  \"id\": 57,\n" +
                        "  \"name\": \"elph\",\n" +
                        "  \"photoUrls\": [],\n" +
                        //"  \"tags\": [],\n" +
                        "  \"status\": \"true\"\n" +
                        "}")
                .when().post()
                .then().extract().as(Pet.class);

    }

    public static Pet postRequestTest(String pet){
        return rs.body(pet).post().then().log().all().extract().as(Pet.class);
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

//    public static Pet getPetWithStatus(boolean available, boolean pending, boolean sold) {
//        if (available==true){
//            RequestSpecification tr = rs.get("/pet/findByStatus?status=available").then().log().all().extract().as(Pet.class);
//        }
//        if (pending==true){
//            return rs.get("/pet/findByStatus?status=pending").then().log().all().extract().as(Pet.class);
//        }
//        if (sold==true){
//            return rs.get("/pet/findByStatus?status=available").then().log().all().extract().as(Pet.class);
//        }
//        return rt;
//    }
}
