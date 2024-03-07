package day_6;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;
import pojo.CustomResponse;
import pojo.RequestBody;
import utilities.APIRunner;
import utilities.Config;

import static utilities.CashwiseAuthorization.getToken;

public class SellersApiRunner {
    @Test
    public void test_1_getListOfSeller(){
        //https://backend.cashwise.us    /api/myaccount/sellers/all
        String path = "/api/myaccount/sellers/all";
        APIRunner.runGET(path);
        CustomResponse[] customResponses = APIRunner.getCustomResponseArray();

        // System.out.println(   APIRunner.getCustomResponseArray()[0].getId() );

        int sizeOfArray = customResponses.length;

        for (int i = 0; i < sizeOfArray; i++) {
            System.out.println("ID: " + customResponses[i].getSeller_id());
            Assert.assertNotNull(customResponses[i].getSeller_id());


            System.out.println("Seller name: " + customResponses[i].getSeller_name());
            Assert.assertNotNull(customResponses[i].getSeller_name());
        }
    }
    @Test
    public void test_3_createNewSeller() throws JsonProcessingException {
        Faker faker = new Faker();
        // https://backend.cashwise.us   /api/myaccount/bankaccount    // STEP -==> set up your URL
        String path = "/api/myaccount/sellers";

        RequestBody requestBody = new RequestBody();
        requestBody.setCompany_name(faker.company().name() + "Company");
        requestBody.setSeller_name(faker.name().lastName() + "Ms");
        requestBody.setEmail(faker.internet().emailAddress());
        requestBody.setPhone_number(faker.phoneNumber().phoneNumber());
        requestBody.setAddress(faker.address().fullAddress());

        APIRunner.runPOST(path, requestBody);
        System.out.println( APIRunner.getCustomResponse().getSeller_id());
        System.out.println(APIRunner.getCustomResponse().getBank_account_name());

        Assert.assertNotNull(APIRunner.getCustomResponse().getSeller_id());
    }
}
