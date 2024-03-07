package Homework;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;

public class Pet_XML {
    /**Petstore api : https://petstore.swagger.io/
     Use API automation and create new dog(Pet).
     POST NEW DOG==> test_1
     use class level id Ex: static String id = "";
     GET created dog by id ==> test_2
     Delete dog by id  */
    @Test
    public void test_1_createPet(){
        String url = "https://petstore.swagger.io/v2/pet";

        String requestBody = "<?xml version=1.0 encoding=UTF-8?>" +
                "<Pet>" +
                "    <id>0</id>" +
                "    <Category>" +
                "        <id>0</id>" +
                "        <name>Dog</name>" +
                "    </Category>" +
                "    <name>Bob</name>" +
                "    <photoUrls>" +
                "        <photoUrl>string</photoUrl>" +
                "    </photoUrls>";

        Response response = RestAssured.given()
                .contentType(ContentType.XML)
                .body(requestBody)
                .post(url);

        response.prettyPrint();



    }
}
