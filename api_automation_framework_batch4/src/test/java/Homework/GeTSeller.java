package Homework;


         /*
        GET List of Sellers
        Find size of array
        With jsonPath finder find below data and AssertNotNull:
                "seller_id": 3441,
                "company_name": "Car dealerw",
                "seller_name": "Klara Jacob"
        As an example use bank account test:
        */

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;
import utilities.CashwiseAuthorization;
import utilities.Config;

import java.util.HashMap;
import java.util.Map;

public class GeTSeller {
    @Test
    public void test_1_createNew_seller(){
        String token = "Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJjb2Rld2lzZV9iYXRjaDRfYXBpQGdtYWlsLmNvbSIsImV4cCI6MTcwNzE4MDQ4MSwiaWF0IjoxNzA2NTc1NjgxfQ.LRzXdKBz4Ym8TnaNyk3xrWouIpm5M4AoCeyZJ0ZGMbUmu0CDLvibnvCZQUrBeinrSwHyd5D0i3LB9Sr1kyp8uw";

        String url = "https://backend.cashwise.us/api/myaccount/sellers";

        Map<String, Object> requestBody = new HashMap<>();
        requestBody.put("company name:", "CodeBest" );
        requestBody.put("seller name:", "Juli");
        requestBody.put("email", "Jongroop@gamil.com");
        requestBody.put("phone number",77356557 );
        requestBody.put("address", "oh" );

        Response response = RestAssured.given()
                .auth().oauth2(token)
                .contentType(ContentType.JSON)
                .body(requestBody)
                .post(url);

        System.out.println(response.statusCode());
    }


    @Test
    public void test_2_getListOfSellers() {
        String token = CashwiseAuthorization.getToken();

        String url = Config.getProperty("baseUrl") + "/api/myaccount/sellers/all";

        Response response = RestAssured.given()
                .auth().oauth2(token)
                .get(url);
        System.out.println("seller code: " + response.statusCode());

        // response.prettyPrint();

        int sizeOfSellers = response.jsonPath().getList("").size();
        System.out.println(sizeOfSellers);

        for (int i = 0; i < sizeOfSellers; i++) {
            System.out.println("===========================================================================");

            String id  = response.jsonPath().getString("[" + i + "].seller_id");
            String companyName = response.jsonPath().getString("[" + i + "].company_name");
            String sellerName = response.jsonPath().getString("[" + i + "].seller_name");
            String sellerSurname = response.jsonPath().getString("[" + i + "].seller_surname");

            System.out.println("seller id: " + id );
            System.out.println("companyName: " + companyName);
            System.out.println("sellerName: " + sellerName);

            Assert.assertNotNull("id is null" , id);
            Assert.assertNotNull("companyName is null" , companyName);
            Assert.assertNotNull("sellerName is null" , sellerName);
            Assert.assertNull("sellerSurname is null" , sellerSurname);



            System.out.println("===============================================================================");
        }
    }
    @Test
    public void test_3_getSingleSeller(){
        String url = Config.getProperty("baseUrl") + "/api/myaccount/sellers/3476";

        String token = CashwiseAuthorization.getToken();
        Response response = RestAssured.given()
                .auth().oauth2(token)
                .get( url );

        response.prettyPrint();

        System.out.println("test============start=====================");

        String companyName = response.jsonPath().getString("companyName");
        Assert.assertNull(companyName);
        System.out.println(companyName);
        System.out.println("========test passe================");
    }

}


