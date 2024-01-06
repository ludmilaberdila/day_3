package ClassPractice.IntroToAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*go to https://the-internet.herokuapp.com/hovers
* hover over user1
* click on "View profile, " it will take you to new page
* navigate back
* hover over user2
* click on "View profile" it will take you to new page
* navigate back
* */

public class Hovers {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/hovers");

        WebElement user1 = driver.findElement(By.xpath("(//img[@alt='User Avatar'])[1]"));
        WebElement user2 = driver.findElement(By.xpath("(//img[@alt='User Avatar'])[2]"));
        WebElement user3 = driver.findElement(By.xpath("(//img[@alt='User Avatar'])[3]"));

        Actions hoverOver = new Actions(driver);
        /*metoda scurta de la codurile de mai jos*/
        clickOnUserProfile(driver, hoverOver, user1);
        clickOnUserProfile(driver, hoverOver, user2);
        clickOnUserProfile(driver, hoverOver, user3);






    }

    private static void clickOnUserProfile(WebDriver driver, Actions hoverOver, WebElement user1) {
        hoverOver.moveToElement(user1).click().perform();
        WebElement viewProfile = driver.findElement(By.linkText("View profile"));
        viewProfile.click();
        String url = driver.getCurrentUrl();
        System.out.println(url);

        driver.navigate().back();
    }
}
