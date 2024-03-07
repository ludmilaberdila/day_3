package day_3_xml_fileUpload_recap;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;
import utilities.CashwiseAuthorization;

import java.io.File;

public class fileUploadTest {

    @Test
    public void fileUploads(){
    String url = "https://backend.cashwise.us/api/myaccount/file/v2?file";

    String token = CashwiseAuthorization.getToken();
    String filePath = "dataToUpload.csv";

        File file = new File(filePath);
        Response response = RestAssured.given()
                .auth().oauth2(token)
                .multiPart("file", file, "multiple/form-data")
                .post(url);

        System.out.println("my status codeis : " + response.statusCode());

        String fileName = response.jsonPath().getString("fileName");

        System.out.println("my file name fron response body: " + fileName);
        response.prettyPrint();

    }
}
