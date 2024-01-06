import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practic_Css {
    public static void main(String[] args) {
        /* go to htpps://demoqa.com/books
        * in serch field , serch for "Git Pocket Guide"
        * verify Author is " Richard E. Silverman"
        *  verify "Login" button is dispalyed and clickable */
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/books");

        String bookName = "Git Pocket Guide";

       WebElement searchBox = driver.findElement(By.cssSelector("input#sershBox"));
        searchBox.sendKeys(bookName);

        String actualAuthorName = driver.findElement(By.xpath("//div[text()='Richard'")).getText();
        String expectedAuthorName = "Richard E. Silverman";

        if (actualAuthorName.equals(expectedAuthorName)){
            System.out.println("pass");
        }
        WebElement loginButton = driver.findElement(By.cssSelector("button.btu-primary"));

        if(loginButton.isDisplayed()){
            System.out.println("pass, the button is there");
        }

    }
}
