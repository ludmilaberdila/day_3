package ClassPractice.WebTables;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.HashMap;
import java.util.List;

public class PracticeWebTable {
    static WebDriver driver;
        /*go to "https://omayo.blogspot.com/"
        * create HashMap<String, Integer> users
        * get all names from table and put them as String key
        * get all ages from table and put them as Integer value*/
    @BeforeClass
    public  static  void getUsersInfo() {
        driver.get("https://omayo.blogspot.com/");
        HashMap<String, Integer> users = new HashMap<>();
        List<WebElement> names = driver.findElements(By.xpath("//table[@id='table1']//tr//td[1]"));
        List<WebElement> ages = driver.findElements(By.xpath("//table[@id='table1']//tr//td[2]"));

        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i).getText();
            int age = Integer.parseInt(ages.get(i).getText());
            users.put(name, age);
        }
        for (String key : users.keySet()) {
            System.out.println(key + " " + users.get(key));
        }


       /* 1. go to https://blazedemo.com/
        2. choose Mexico as departure, London as destination
        3. click on Search Flights
        4. print all values from table
        Flight #    Airline            Departs: Mexico City   Arrives: London    Price
        43      Virgin America     1:43 AM        9:45 PM    $472.56
        234     United Airlines        7:43 AM    10:45 PM   $432.98
        9696    Aer Lingus         5:27 AM    8:22 PM    $200.98
        12      Virgin America     11:23 AM   1:45 PM    $765.32
        4346    Lufthansa          1:45 AM    8:34 PM    $233.98  */

        WebElement departureCity = driver.findElement(By.name("fromPort"));
        Select select = new Select(departureCity);
        select.selectByVisibleText("Mexico City");

        WebElement destinationCity = driver.findElement(By.name("toPort"));
        Select select1 = new Select(destinationCity);
        select1.selectByVisibleText("London");

        WebElement findFlightButton = driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
        findFlightButton.click();
//        Actions actions =new Actions(driver);
//        WebElement choose234Flight = driver.findElement(By.xpath("(//input[@class='btn btn-small'])[2]"));
//        actions.moveToElement(choose234Flight).click().perform();
//        System.out.println(tableHead.getText());
//        System.out.println(table.gettext());
    }
}
