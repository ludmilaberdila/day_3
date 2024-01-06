package practice.waits;

import Utilities.Driver;
import Utilities.UtilWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WaitsA {
    public static void main(String[] args) throws InterruptedException {

    }

    public static void explicitClickable(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        driver.findElement(By.xpath("//form[@id='input-example']/button")).click();

    UtilWait.waitUntilElementIsClickable(driver, 10, By.xpath(
            "//form[@id='input-example']/input")).sendKeys("Hello");
    }

    public static void explicitVisibility(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        driver.findElement(By.xpath("//button[.='Start']")).click();

       // System.out.println(UtilWait.waitUntilElementIsVisible(driver, 5, By.xpath("//h4[.='Hello World!']")).getText());


    }

}
