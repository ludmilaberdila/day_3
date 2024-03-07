package database_tests;

import org.junit.Assert;

import java.sql.*;

public class IntroToJDBC {

    public static void main(String[] args){
String url = "jdbc:postgresql://18.159.52.24:5434/postgres";
String username = "cashwiseuser";
String password = "cashwisepass";

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection(url, username, password);
            //create statment and execute statment

            statement = connection.createStatement();
            String sqlQuery = "select * from clients order by client_id";

            resultSet = statement.executeQuery(sqlQuery);

            while (resultSet.next()){
//                System.out.println( resultSet.getString("address"));
//                System.out.println(resultSet.getString("client_name"));
//
//                System.out.println(resultSet.getString(1));
//                System.out.println(resultSet.getString(2));

                //verify client_id column dosen't have null values
                Assert.assertNotNull(resultSet.getString("client_id"));

                Assert.assertNotNull(resultSet.getString("client_id")
                        + "missing client_name" , resultSet.getString("client_name"));

            }

        }catch (SQLException e){
           e.printStackTrace();
        }
//<dependency>
//            <groupId>org.postgresql</groupId>
//            <artifactId>postgresql</artifactId>
//            <version>42.7.2</version>
//        </dependency>
//                dbUrl=jdbc:postgresql://18.159.52.24:5434/postgres
//        dbUsername=cashwiseuser
//        dbPassword=cashwisepass
    }
}
