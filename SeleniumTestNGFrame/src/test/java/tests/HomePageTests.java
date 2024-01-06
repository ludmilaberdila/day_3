package tests;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class HomePageTests {
    @Test (groups = "smokeGroup")
    public void test1() throws InterruptedException {
        /* go to eathismuch.com*/

        WebDriver driver = Driver.getDriver();
        driver.get("http://www.eatthismuch.com/");

        Thread.sleep(20000);
        System.out.println("this is the end of test 1");
    }
    @Test (groups = "regretion")
    public void test2() throws InterruptedException {
        /* go to amazon.com*/

        WebDriver driver = Driver.getDriver();
        driver.get("http://www.amazon.com/");

        Thread.sleep(15000);
        System.out.println("this is  test 2 ");
    }
}
