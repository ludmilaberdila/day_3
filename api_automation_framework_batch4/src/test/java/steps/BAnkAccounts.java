package steps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pojo.RequestBody;
import utilities.APIRunner;
public class BAnkAccounts {
    static String path = "/api/myaccount/bankaccount";
    static String id;
    static String bankAccount_Name;
    RequestBody requestBody = new RequestBody();


    @Given("Create {string} and  {string} and {string} and {double}")
    public void createAndAndAnd(String bankAccountName, String description, String typeOfPay, double balance) {
        requestBody.setType_of_pay( typeOfPay );
        requestBody.setBank_account_name( bankAccountName );
        requestBody.setDescription( description );
        //  requestBody.setBalance(  Double.parseDouble( balance )  );
        requestBody.setBalance(   balance  );

        APIRunner.runPOST(path,  requestBody );
        id = APIRunner.getCustomResponse().getId();
        bankAccount_Name = bankAccountName; // Expected data
        System.out.println("=======TEST PASSED===================");


    }
}
