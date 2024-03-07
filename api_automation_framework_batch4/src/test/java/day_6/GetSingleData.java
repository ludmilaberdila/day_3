package day_6;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;
import pojo.CustomResponse;
import utilities.APIRunner;
import utilities.Config;

import static utilities.CashwiseAuthorization.getToken;

public class GetSingleData {
    /**
     * Get single bank account
     * Create Object mapper
     * Create CustomResponse
     * GET bankID in class level
     * https://backend.cashwise.us   /api/myaccount/bankaccount/  564
     */

    String bankID = "";


    @Test
    public void test_1_getSingleBankAccount() throws JsonProcessingException {
        bankID = "564";
        System.out.println("====REGULAR method==============================");
        //Step - 1   // baseUrl                            path
        String url = Config.getProperty("baseUrl") + "/api/myaccount/bankaccount/" + bankID;

        //Step - 2 Hit GET request
        Response response = RestAssured.given()
                .auth().oauth2(getToken())
                .get(url);

        //response.prettyPrint();

        //Step - 3 create ObjectMapper
        ObjectMapper mapper = new ObjectMapper();

        //Step - 4 create CustomResponse class and Handle exception
        CustomResponse customResponse = mapper.readValue(response.asString(), CustomResponse.class);

        System.out.println("My ID: " + customResponse.getId());
        System.out.println("Bank account Name: " + customResponse.getBank_account_name());
        System.out.println("Balance: " + customResponse.getBalance());

    }

    @Test
    public void test_2_getSingleBankAccount() {
        // https://backend.cashwise.us  /api/myaccount/bankaccount/1202
        System.out.println("===========APIRunner =================================================");
        String path = "/api/myaccount/bankaccount/564";

        APIRunner.runGET(path);

        String bankId = APIRunner.getCustomResponse().getId();
        String bankAccountName = APIRunner.getCustomResponse().getBank_account_name();
        double balance = APIRunner.getCustomResponse().getBalance();

        System.out.println("My ID: " + bankId);
        System.out.println("Bank account Name: " + bankAccountName);
        System.out.println("Balance: " + balance);
    }

  /*  @Test
    public void exampleCustomMethod(){
        int a = 1;
        int b = 4;
        int c ;
        c =  a +b;
        System.out.println( "Concatenation: " + c );
        System.out.println("======Custom Method==============");
        System.out.println(  "Concatenation: " +   APIRunner.concatTwoNums(a, b));
    } */

    @Test
    public void test_3_getSingleSeller() throws JsonProcessingException {
        // https://backend.cashwise.us/api/myaccount/sellers/3468

        bankID = "3638";
        System.out.println("====REGULAR method==============================");
        //Step - 1   // baseUrl                            path
        String url = Config.getProperty("baseUrl") + "/api/myaccount/sellers/" + bankID;

        //Step - 2 Hit GET request
        Response response = RestAssured.given()
                .auth().oauth2(getToken())
                .get(url);

        //response.prettyPrint();

        //Step - 3 create ObjectMapper
        ObjectMapper mapper = new ObjectMapper();

        //Step - 4 create CustomResponse class and Handle exception
        CustomResponse customResponse = mapper.readValue(response.asString(), CustomResponse.class);

        //System.out.println(  "My ID: "+  customResponse.getId()  );
        System.out.println("Seller id: " + customResponse.getSeller_id());
        System.out.println("Seller Name: " + customResponse.getSeller_name());
    }
    @Test
    public void test_4_getSingleSeller() throws JsonProcessingException {
        String path = "/api/myaccount/sellers/3638";
        APIRunner.runGET(path);
        System.out.println(  "Seller id: " +  APIRunner.getCustomResponse().getSeller_id()   );
        System.out.println(  "Seller name: " +  APIRunner.getCustomResponse().getSeller_name()   );

    }

    @Test
    public  void test_5_getSingleProduct(){
        //https://backend.cashwise.us/api/myaccount/products/853
        String path = "/api/myaccount/products/853";
        APIRunner.runGET(path);

        System.out.println(  "Product id: " +  APIRunner.getCustomResponse().getProduct_id()   );

        System.out.println("Product title" + APIRunner.getCustomResponse().getProduct_title() );

        Assert.assertNotNull(APIRunner.getCustomResponse().getProduct_id());

        Assert.assertNotNull(APIRunner.getCustomResponse().getProduct_title());
    }

}