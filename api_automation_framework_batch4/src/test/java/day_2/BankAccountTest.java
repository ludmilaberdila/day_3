package day_2;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;
import utilities.CashwiseAuthorization;
import utilities.Config;

import java.util.HashMap;
import java.util.Map;

public class BankAccountTest {

/*create new bank account
* i have to get token*/

    @Test// Junit annotation
    public void test_1_tokenGenerator(){

        String url = "https://backend.cashwise.us/api/myaccount/auth/login";

        String requestBody = "{\n" +
                "    \"email\": \"ludmila.berdila@gmail.com\", \n" +
                "    \"password\" : \"PRn:u@ymdqJ5h6E\"\n" +
                "}" ;

        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .post(url);

        System.out.println("status code: " + response.statusCode());

        response.prettyPrint();

        //x.jwt_token

        String token =response.jsonPath().getString("jwt_token");

        System.out.println("my token: " + token);

    }
    @Test
    public void test_2_createNew_BankAccount(){
    String token = "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJsdWRtaWxhLmJlcmRpbGFAZ21haWwuY29tIiwiZXhwIjoxNz" +
            "A3MTgyNzUyLCJpYXQiOjE3MDY1Nzc5NTJ9.Nblxsykgx8uF-6PWPCV1gL-Cg19rS2zHHwLkgkYfvSTGhat5FFl9Q" +
            "opj5qEOikJb68bJbqeCyNEILIDQgKs7oQ\n";

        String url = "https://backend.cashwise.us/api/myaccount/bankaccount";

        Map<String, Object> requestBody = new HashMap<>();
        requestBody.put("type_of_pay", "BANK" );
        requestBody.put("bank_account_name", "Intellij Bank" );
        requestBody.put("description", "Financial company");
        requestBody.put("balance", 905 );

        Response response = RestAssured.given()
                .auth().oauth2(token)
                .contentType(ContentType.JSON)
                .body(requestBody)
                .post(url);

        System.out.println(response.statusCode());
    }


    //get all bank data Assert value is not null
    @Test
    public void test_3_getListOfBankAccount() {
        String token = CashwiseAuthorization.getToken();
        //  https://backend.cashwise.us    /api/myaccount/bankaccount
        String url = Config.getProperty("baseUrl") + "/api/myaccount/bankaccount";

        System.out.println( token );
        System.out.println( url );

        Response response = RestAssured .given()
                .auth().oauth2(token)
                .get(url);
        System.out.println("my status code: " + response.statusCode());

         response.prettyPrint();

        int sizeOfBankAccaunts = response.jsonPath().getList("").size();
        System.out.println(sizeOfBankAccaunts);
//
        for (int i = 0; i < sizeOfBankAccaunts; i++) {
            System.out.println("===========================================================================");

//            String id = response.jsonPath().getString("[" + i + "].id");
//            String bankAccountName = response.jsonPath().getString("[" + i + "].bank_account_name");
//            String description = response.jsonPath().getString("[" + i + "].description");
//            String typeOfPay = response.jsonPath().getString("[" + i +"].type_of_pay");
//            String balance = response.jsonPath().getString("[" + i + "].balance");

//            System.out.println("bank id:" + id);
//            System.out.println("bankAccountName:" + bankAccountName);
//            System.out.println("description:" + description);
//            System.out.println("typeOfPay:" + typeOfPay);
//            System.out.println("Balance: " + balance);
//
//            Assert.assertNotNull("id is null" , id);
//            Assert.assertNotNull("bankAccountName is null" , bankAccountName);
//            Assert.assertNotNull("description is null" , description);
//            Assert.assertNotNull("typeOfPay is null" , typeOfPay);
//            Assert.assertNotNull("balance is null" , balance);

            System.out.println("===============================================================================");
        }
    }
    @Test
    public void test_4_getingSingleBankAccount(){
        String url = Config.getProperty("baseUrl") + "/api/myaccount/bankaccount/904";

        String token = CashwiseAuthorization.getToken();
        Response response = RestAssured.given()
                .auth().oauth2(token)
                .get( url );

        response.prettyPrint();

        System.out.println("test============start=====================");

        String bankAccountName = response.jsonPath().getString("bank_account_name");
        Assert.assertNotNull(bankAccountName);
        System.out.println(bankAccountName);
        System.out.println("========test passe================");
    }

}