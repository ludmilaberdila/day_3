package Homework;

import com.github.javafaker.Faker;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import utilities.Config;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PetXML {
    /**Petstore api : https://petstore.swagger.io/
     Use API automation and create new dog(Pet).
     POST NEW DOG==> test_1
     use class level id Ex: static String id = "";
     GET created dog by id ==> test_2
     Delete dog by id  */

 static String id = "";
    @Test
    public void test_1_createPet() {
        String url = "https://petstore.swagger.io/v2/pet";

        Faker faker = new Faker();
        String name = faker.dog().name();


        String requestBody = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<Pet>\n" +
                "    <id>0</id>\n" +
                "    <Category>\n" +
                "        <id>0</id>\n" +
                "        <name>Dog</name>\n" +
                "    </Category>\n" +
                "    <name> "+name+ "</name>\n" +
                "    <photoUrls>\n" +
                "        <photoUrl>string</photoUrl>\n" +
                "    </photoUrls>\n" +
                "    <tags>\n" +
                "        <Tag>\n" +
                "            <id>0</id>\n" +
                "            <name>string</name>\n" +
                "        </Tag>\n" +
                "    </tags>\n" +
                "    <status>available</status>\n" +
                "</Pet>";

        Response response = RestAssured.given()
                .contentType(ContentType.XML)
                .body(requestBody)
                .post(url);

       id = response.jsonPath().getString("id");
        System.out.println(id);
        response.prettyPrint();

    }
      @Test
     public void test_2_getPet() {
          String url = "https://petstore.swagger.io/v2/pet/";
          Response response = RestAssured
                  .given()
                  .get(url + id);
          response.prettyPeek();

      }

      @Test
    public void test_3_deletePet(){
          String url = "https://petstore.swagger.io/v2/pet/" + id;
          Response response = RestAssured
                  .delete(url);

            System.out.println(id);

            response.prettyPeek();

      }
    }

