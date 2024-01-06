package exceptions;

import Utilities.Driver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PracticeExceptionHandling {


    @Test
    public void test1(){


        WebDriver driver = Driver.getDriver();
        driver.get("https://magento.softwaretestingboard.com/");

        driver.findElement(By.id("ui-id-11"));

        System.out.println("hello this is message after click");
        System.out.println("this is the next step after we click on jacket ");
    }
}
