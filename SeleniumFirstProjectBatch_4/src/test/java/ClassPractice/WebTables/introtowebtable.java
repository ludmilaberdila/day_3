package ClassPractice.WebTables;

import Utilities.Driver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class introtowebtable {

    static WebDriver driver;

    public static void initializeDrive() {
        driver = Driver.getDriver();
        driver.get("https://the-internet.herokuapp.com/tables");
    }

    @Test
    public void printTin() {
        driver.get("https://the-internet.herokuapp.com/tables");

        WebElement element1 = driver.findElement(By.xpath(
                "//table[id='table1]/tbody/tr[4]/4]/td[5]"));
        String elementText = element1.getText();
        System.out.println(elementText);


       /* printSmith 	John
             Bach 	Frank
                Doe 	Jason
                 Conway */
        List<WebElement> firstNames = driver.findElements(By.xpath("//table[@id='table1']//tr//td[2]"));
        List<WebElement> lastNames = driver.findElements(By.xpath("//table[@id='table1']//tr//td[1]"));

        for (int i = 0; i < firstNames.size(); i++) {
            String firstName = firstNames.get(i).getText();
            String lastName = lastNames.get(i).getText();

            System.out.println(firstName + " " + lastName);
        }
    }
          /* print email due fo those people who du > 50,
           fbach@yahoo.com , jdoe@hotmail.com
           */

    @Test
    public void printEmailOver50() {
        List<WebElement> emails = driver.findElements(By.xpath("//table[@id='table1']//tr//td[3]"));
        List<WebElement> dues = driver.findElements(By.xpath("//table[@id='table1']//tr//td[4]"));

        for (int i = 0; i < emails.size(); i++) {
            String email = emails.get(i).getText();
            double due = Double.parseDouble(dues.get(i).getText().replace("$", ""));
            if (due > 50) {
                System.out.println(email + " " + due);
            }
        }
    }

    /*print email and website of those
   people whose first name starts with "J"*/
    @Test
    public void printPeopleWithJ() {
        List<WebElement> firstNames = driver.findElements(By.xpath("//table[@id='table1']//tr//td[2]"));
        List<WebElement> emails = driver.findElements(By.xpath("//table[@id='table1']//tr//td[3]"));
        List<WebElement> websites = driver.findElements(By.xpath("//table[@id='table1']//tr//td[5]"));

        for (int i = 0; i < firstNames.size(); i++) {
            String firstName = firstNames.get(i).getText();
            String website = websites.get(i).getText();
            String email = emails.get(i).getText();

            if (firstName.startsWith("J")) {
                System.out.println(firstName + " " + email + " " + website);
            }
        }
    }
}


