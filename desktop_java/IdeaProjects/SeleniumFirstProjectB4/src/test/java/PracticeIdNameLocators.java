import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeIdNameLocators {
    public static void main(String[] args) {
        /*TC - verify invalid user cannot login to app
        Steps
        .1. go to https://www.saucedemo.com/
        enter invalid username and password
        click on login button
        verify following text appeared
        "Epic sadface: Username and password do not match any user in this service"
        verify url is https://www.saucedemo.com/

         */
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        WebElement userName= driver.findElement(By.id("user-name"));
        userName.sendKeys("bena");

       /* driver.findElement(By.id("abc"));
        driver.findElement(By.name("abcName"));
        driver.findElement(By.xpath("//button[@name='abcName' "));
        driver.findElement(By.xpath("//button[@type='apple' "));
        driver.findElement(By.xpath("//button[@style = 'true' ")); */

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("fmlf");

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        String errorMessage = driver.findElement(By.xpath("//h3[data-test='error']")).getText();

        if (errorMessage.equals("Epic sadFace: username and password do not match any user in this service")){
            System.out.println("pass");
        }else
            System.out.println("fail");


    }
}
