package pojo;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data

@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomResponse { // ResponseBody

    /**
     * CustomResponse=> we use ths class to read value of aur responses
     *
     *
     *
     * */

    //Category-controller
    private CustomResponse[] category_response;
    private int category_id;
    private  String category_title;
    private  String category_description;

  //BAnkAccount response body variable
    private String id;
    private String bank_account_name;
    private double balance;

  //seller response body
    private CustomResponse[] responses;
    private int seller_id;
    private String seller_name;
    private String email;
    private String address;
    private String phone_number;


    //product Response body variable
    private String product_title;
    private int product_id ;
    private double product_price;
    private String product_description;


    //payment controller
    private CustomResponse response;
    private String invoice_title;
    private double total_pay;






}
