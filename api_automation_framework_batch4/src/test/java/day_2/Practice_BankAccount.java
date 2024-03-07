package day_2;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;
import utilities.CashwiseAuthorization;
import utilities.Config;

import java.util.HashMap;
import java.util.Map;

public class Practice_BankAccount {
    /*create new bank account
    * i have to get token*/
    @Test //junit annotation
    public void test_1_token_generator(){
    String url = "https://backend.cashwise.us/api/myaccount/auth/login";

    String requestBody = "{\n" +
            "    \"email\": \"ludmila.berdila@gmail.com\", \n" +
            "    \"password\" : \"PRn:u@ymdqJ5h6E\"\n" +
            "}";
        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .post(url);

        System.out.println("status code" + response.statusCode());

        response.prettyPrint();
//jwt_token
        String token = response.jsonPath().getString("jwt_token");
        System.out.println("my token: " + token);
    }


    @Test //junit annotation
    public void test_2_createNewBankAccount(){
        String token = "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJsdWRtaWxhLmJlcmRpbGFAZ21haWwuY29tIiwiZXhwIjoxNzA3MjgzNDc5LCJpYXQiOjE3MDY2Nzg2Nzl9.u0OKYlYOQNuQN9wAXEZpwnt56SZ5_xW4qc6oskZJpwQW-a8_d1_xQVUWirf23jitG9-jk-Mxwd8LlUFtNfMaTQ";

        String url = "https://backend.cashwise.us/api/myaccount/bankaccount";

            Map<String, Object> requestBody = new HashMap<>();
            requestBody.put("type_of_pay", "BANK");
            requestBody.put("bank_account_name" , "55Bank");
            requestBody.put("description", "financial");
            requestBody.put("balance",999000 );


//        String requestBody = "{\n" +
//                "    \"type_of_pay\": \"CASH\",\n" +
//                "    \"bank_account_name\": \"21 bank\",\n" +
//                "    \"description\": \"financial company\",\n" +
//                "    \"balance\": 999000\n" +
//                "  }";


        Response response = RestAssured.given()
                .auth().oauth2(token)
                .contentType(ContentType.JSON)
                .body( requestBody)
                .post(url);

        System.out.println("status code: " + response.statusCode());
    }
    @Test
    public void test_3_ListOfBankAccount() {
        String token = CashwiseAuthorization.getToken();
        String url = Config.getProperty("baseUrl") + "/api/myaccount/bankaccount";
//        System.out.println(token);
//        System.out.println(url);
        Response response = RestAssured.given()
                .auth().oauth2(token)
                .get(url);
        System.out.println(" my status code" + response.statusCode());
        response.prettyPrint();


    }
}
