package day_5_pojoRecap;

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
@FixMethodOrder(MethodSorters.NAME_ASCENDING)//step 1 it will run in order

public class sellerPractice {
    Faker faker = new Faker();
    static String sellerId = "";

    @Test
    public void test_1_createNewseller() throws JsonProcessingException {
        String url = Config.getProperty("baseUrl") + "/api/myaccount/sellers/";

        RequestBody requestBody = new RequestBody();
        requestBody.setCompany_name(faker.company().name() + "Company");
        requestBody.setSeller_name(faker.name().lastName() + "Ms");
        requestBody.setEmail(faker.internet().emailAddress());
        requestBody.setPhone_number(faker.phoneNumber().phoneNumber());
        requestBody.setAddress(faker.address().fullAddress());

        Response response = RestAssured.given()
                .auth().oauth2(getToken())
                .contentType(ContentType.JSON)
                .body(requestBody)
                .post(url);

        System.out.println("My status code: " + response.statusCode());
        Assert.assertEquals("Status code", 201, response.statusCode());
        response.prettyPrint();

        ObjectMapper mapper = new ObjectMapper();

        CustomResponse customResponse = mapper.readValue(response.asString(), CustomResponse.class);

        sellerId = customResponse.getSeller_id() + "";

        System.out.println("my id:" + sellerId);
    }

    @Test
    public void test_2_getSingleSeller() throws JsonProcessingException {

        String url = Config.getProperty("baseUrl") + "/api/myaccount/sellers/" + sellerId;

        // Step -2  Hit Get request with RestAssured
        Response response = RestAssured.given()
                .auth().oauth2(getToken())
                .get(url);

        // Step -3 print out status code
        System.out.println("My status code: " + response.statusCode());

        // Step -4 Assert status code
        Assert.assertEquals(200, response.statusCode());

        System.out.println("======================================");
        // Step -5  Create class ObjectMapper
        ObjectMapper mapper = new ObjectMapper();

        // Step - 6  create class CustomResponse and read data(fetch data)
        CustomResponse customResponse = mapper.readValue(response.asString(), CustomResponse.class);

        System.out.println(customResponse.getSeller_id());
        System.out.println(customResponse.getSeller_name());
        System.out.println(customResponse.getEmail());
        System.out.println(customResponse.getAddress());


        Assert.assertNotNull(customResponse.getSeller_id());
        Assert.assertNotNull(customResponse.getSeller_name());
        Assert.assertNotNull(customResponse.getEmail());
    }

    @Test
    public void test_3_get_listSeller() throws JsonProcessingException {
        String url = Config.getProperty("baseUrl") + "/api/myaccount/sellers/all";

        Response response = RestAssured
                .given().auth()
                .oauth2(getToken())
                .get(url);

        System.out.println(response);
        response.prettyPrint();

        ObjectMapper mapper = new ObjectMapper();

        CustomResponse[] customResponses = mapper.readValue(response.asString(), CustomResponse[].class);

        // Step-6 Get size of Array
        int sizeOfSeller = customResponses.length;

        // Step-6 Print out All bank accounts and Assert them
        for (int i = 0; i < sizeOfSeller; i++) {

            System.out.println("seller ID: " + customResponses[i].getId());
            Assert.assertNotNull(customResponses[i].getSeller_id());

            System.out.println(customResponses[i].getSeller_id());
            Assert.assertNotNull(customResponses[i].getSeller_name());

        }
    }

}

