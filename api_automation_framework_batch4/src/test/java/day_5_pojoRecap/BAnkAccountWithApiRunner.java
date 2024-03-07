package day_5_pojoRecap;

import org.junit.Test;
import utilities.APIRunner;

public class BAnkAccountWithApiRunner {


    @Test //1291
    public void test_1_getSingleBAnkAccount(){
        String path = "/api/myaccount/bankaccount/1291";

        APIRunner.runGET(   path  );
        String bankAccountName =  APIRunner.getCustomResponse().getBank_account_name() ;

        System.out.println(  "Bank account name: "+  bankAccountName );


    }
}
