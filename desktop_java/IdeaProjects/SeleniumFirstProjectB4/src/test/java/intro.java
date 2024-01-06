import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class intro {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://blazedemo.com/");

        WebElement departure = driver.findElement(By.name("fromPort"));
        Select departureDropDown = new Select(departure);
        departureDropDown.selectByValue("Boston");

        System.out.println(departureDropDown.getAllSelectedOptions().get(0).getText());

        WebElement destination = driver.findElement(By.name("London"));
        Select destinationDropDown = new Select(destination);
        destinationDropDown.selectByValue("London");

        WebElement findFligtsButton = driver.findElement(By.cssSelector("input.btn"));
        findFligtsButton.click();

        String actualText = driver.findElement(By.xpath(
                "//table[@class='preceding::h3")).getText() ;

        if(actualText.equals("fligts fron boston to london:")) {
            System.out.println("found fligts");
        }
        else {
            System.out.println(":fligts dosent exist");
        }

    }
}
