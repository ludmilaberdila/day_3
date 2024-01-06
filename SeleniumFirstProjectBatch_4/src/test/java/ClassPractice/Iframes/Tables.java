package ClassPractice.Iframes;

import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Tables {
    public static void main(String[] args) {

    }
    public static void table1(){
        /* go to https://www.w3schools.com/html/html_tables.asp
        * find the table
        * print all rows and columns */

        WebDriver driver = Driver.getDriver();
        driver.get("go to https://www.w3schools.com/html/html_tables.asp");

        // 1st way - easy way
//        WebElement element = driver.findElement(By.xpath("//table[@class='ws-table-all']"));
//        System.out.println(element.getText());

        // 2nd way
//        List<WebElement> element = driver.findElements(By.xpath("//table[@class='ws-table-all']/tbody/tr/td"));
//        int k = 1;
//
//        for(int i =0; i < element.size();i++) {
//            k++;
//            System.out.print(element.get(i).getText() + " ");
//
//            if(k==3){
//                System.out.println();
//                k=1;
//            }
//        }

        // 3rd way
        WebElement table = driver.findElement(By.id("customers"));
        List<WebElement> tRows = table.findElements(By.xpath("./tbody/tr"));

        for (int i = 1; i < tRows.size(); i++) {
            WebElement row = tRows.get(i);
            List<WebElement> tCells = row.findElements(By.xpath(".//td"));
            for(WebElement cell: tCells){
                System.out.print(cell.getText()+ " ");
            }
            System.out.println();
        }
    }
}
