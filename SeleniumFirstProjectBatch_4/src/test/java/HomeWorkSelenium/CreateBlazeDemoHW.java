package HomeWorkSelenium;

import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateBlazeDemoHW {
    public static void main(String[] args) throws InterruptedException {
        /*
            Create BlazeDemoHW class
            1. go to https://www.blazedemo.com/
            2. choose San-Diego as departure city
            3. choose Rome as destination city
            4. click on "Find flights"
            5. choose flight #234
            6. verify new page url is https://www.blazedemo.com/purchase.php
            7. provide all of your details (name,address,city,state,zipcode,carType,cardNumber,
               month,year,name on card)
            8. click on "Purchase flight"
            9. verify new page url is "https://www.blazedemo.com/confirmation.php"   */

        //1. go to https://www.blazedemo.com/
        WebDriver driver = Driver.getDriver();
        driver.get("https://www.blazedemo.com/");

           //2. choose San-Diego as departure city
        WebElement departure = driver.findElement(By.xpath("//select[@class='form-inline'][1]"));
        departure.click();
        WebElement city = driver.findElement(By.xpath("//option[@value='San Diego']"));
        city.click();
        System.out.println("Departure San-Diego selected");

        //3. choose Rome as destination city
        WebElement destination = driver.findElement(By.xpath("//select[@class='form-inline']"));
        System.out.println("Destination selector");
        destination.click();
        WebElement city2 = driver.findElement(By.xpath("//option[@value='Rome']"));
        city2.click();
        System.out.println("Destination Roma selected");

          //4. click on "Find flights"
        WebElement findFlights = driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
        findFlights.click();
        System.out.println("Find flights, success");
        Thread.sleep(2000);

          //5. choose flight #234
        driver.findElement(By.xpath(
                "//table//tbody//tr[2]//input[contains(@class, 'btn')]")).click();
        System.out.println("flight #234 was selected");


          //6. verify new page url is https://www.blazedemo.com/purchase.php
        if (driver.getCurrentUrl().equals("https://www.blazedemo.com/purchase.php")) {
            System.out.println("Test Passed! Checkout was successful.");
        } else {
            System.out.println("Test Failed! Checkout was not successful.");
        }

          //7. provide all of your details
        driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("Ludmila");
        driver.findElement(By.xpath("//input[@id='address']")).sendKeys("123 Main");
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Des Plaines");
        driver.findElement(By.xpath("//input[@id='state']")).sendKeys("IL");
        driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("60016");
        driver.findElement(By.xpath("//select[@id='cardType']")).click();
        driver.findElement(By.xpath("//option[@value='visa']")).click();
        driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys("123456789");
        driver.findElement(By.xpath("//input [@id='creditCardMonth']")).sendKeys("12");
        driver.findElement(By.xpath("//input [@id='creditCardYear']")).sendKeys("2025");
        driver.findElement(By.xpath("//input [@id='nameOnCard']")).sendKeys("Ludmila Berbila");
        System.out.println("The form was submitted");

         // 8. click on "Purchase flight"
        driver.findElement(By.xpath("//input [@class='btn btn-primary']")).click();
        System.out.println("Flight ticket was purchased");

          //9. verify new page url is "https://www.blazedemo.com/confirmation.php"   */
        if (driver.getCurrentUrl().equals("https://www.blazedemo.com/confirmation.php")) {
            System.out.println("Test Passed! confirmation was successful.");
        } else {
            System.out.println("Test Failed! Checkout was not successful.");
        }
    }
}
