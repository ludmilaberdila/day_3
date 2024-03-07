package day_3_xml_fileUpload_recap;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;
import utilities.CashwiseAuthorization;

import java.io.File;

public class Upload {
    @Test
    public void fileUpload(){

        String url = "https://backend.cashwise.us/api/myaccount/file/v2";
        String token = CashwiseAuthorization.getToken();

        String filePath = "dataToUpload.csv";

        File file = new File(  filePath );

        Response response = RestAssured.given()
                .auth().oauth2( token )
                .multiPart( "file", file, "multiple/form-data" )
                .post( url);

        System.out.println("My status code is: " + response.statusCode());


    }
}
