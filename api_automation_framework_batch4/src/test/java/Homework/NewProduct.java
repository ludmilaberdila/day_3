package Homework;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import pojo.CustomResponse;
import pojo.RequestBody;
import utilities.Config;

import static utilities.CashwiseAuthorization.getToken;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class NewProduct {
    Faker faker = new Faker();
    static String productID = "";

    // https://backend.cashwise.us/api/myaccount/products
    @Test
    public void test_1_createNewProduct() throws JsonProcessingException {

        String url = Config.getProperty("baseUrl") + "/api/myaccount/products/";


        RequestBody requestBody = new RequestBody();

        requestBody.setProduct_title(faker.commerce().productName() + "Product name");
        requestBody.setProduct_price(faker.number().numberBetween(2, 99));
        requestBody.setService_type_id(2);
        requestBody.setCategory_id(806);
        requestBody.setProduct_description(faker.name().title());


        Response response = RestAssured.given()
                .auth().oauth2(getToken())
                .contentType(ContentType.JSON)
                .body(requestBody)
                .post(url);


        System.out.println("My status code: " + response.statusCode());
        Assert.assertEquals("Status code ", 201, response.statusCode());

        System.out.println("=====RESPONSE BODY===============================");
        response.prettyPrint();

        System.out.println("=============use ObjectMapper= and =get id===================");
        ObjectMapper mapper = new ObjectMapper();


        CustomResponse customResponse = mapper.readValue(response.asString(), CustomResponse.class);


        productID = customResponse.getProduct_id() + "";


        System.out.println("Product id:" + productID);

    }

    @Test
    public void test_2_getSingleProduct() throws JsonProcessingException {

        String url = Config.getProperty("baseUrl") + "/api/myaccount/products/" + productID;

        // Step -2  Hit Get request with RestAssured
        Response response = RestAssured.given()
                .auth().oauth2(getToken())
                .get(url);

        System.out.println("My status code: " + response.statusCode());

        Assert.assertEquals(200, response.statusCode());

        System.out.println("======================================");
        ObjectMapper mapper = new ObjectMapper();

        CustomResponse customResponse = mapper.readValue(response.asString(), CustomResponse.class);

        System.out.println(customResponse.getProduct_id());
        System.out.println(customResponse.getProduct_title());

        Assert.assertNotNull(customResponse.getProduct_id());
        Assert.assertNotNull(customResponse.getProduct_title());
    }

    @Test
    public void test_3_getListOfProducts() throws JsonProcessingException {

        String url = Config.getProperty("baseUrl") + "/api/myaccount/products/all";

        Response response = RestAssured.given()
                .auth().oauth2(getToken())
                .get(url);

        //System.out.println("My status code: " + response.statusCode());

        Assert.assertEquals(200, response.statusCode());
        System.out.println(response);
        response.prettyPeek();

        ObjectMapper mapper = new ObjectMapper();

        CustomResponse[] customResponses = mapper.readValue(response.asString(), CustomResponse[].class);


        for (int i = 0; i < customResponses.length; i++) {

            System.out.println(customResponses[i].getSeller_id());
            Assert.assertNotNull(customResponses[i].getSeller_id());

            System.out.println(customResponses[i].getProduct_title());

        }
    }

    @Test
    public void test_4_deleteProduct() throws JsonProcessingException {

        String url = Config.getProperty("baseUrl") + "/api/myaccount/products/" + productID;

        Response response = RestAssured.given()
                .auth().oauth2(getToken())
                .delete(url);

        System.out.println("My status code: " + response.statusCode());

        // Step -4 Assert status code
        Assert.assertEquals(200, response.statusCode());

        System.out.println("======================================");
    }
}
