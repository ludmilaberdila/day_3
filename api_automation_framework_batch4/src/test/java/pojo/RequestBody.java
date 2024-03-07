package pojo;

import lombok.Data;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
// Automatically will generate getter and setter method for me
public class RequestBody {
    /**
     *  RequestBody => purpose of this class is described all variables from our request body
     *we used this class to set value our variables(set all requiest body data
     */
   //cashWise autorization
    private String email;
    private String password;


    /***
     * Category-controller
     */
    private String category_title;
    private String category_description;
    private boolean flag;



    //BankAccount Request body variable
    private String type_of_pay;
    private String bank_account_name;
    private String description;
    private double balance;


    //seller controller request body variable
    private String company_name;
    private String seller_name;
    //private String email;
    private String phone_number;
    private String address;


    //product Request body variable
    private String product_title;
    private double product_price ;
    private int service_type_id;
    private int category_id;
    private String product_description;







}


