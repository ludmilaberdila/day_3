//package HomeWorkSelenium;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Wait;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//import java.util.concurrent.TimeUnit;
//
//public class RadioButton {
//    public static void main(String[] args) {
//        /*1. Go to http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html
//    2. From "Dropdown Menu(s)" select: Python, Maven, Javascript
//    3. From "Checkboxe(s)" select all 4 checkboxes
//    4. From "Radio Button(s)" select Blue
//    5. From "Selected & Disabled" select Pumpkin
//    6. From "Checkboxe(s)" deselect checkbox option 1 & 2
//    7. From "Radio Button(s)" select Green
//    8. From "Dropdown Menu(s)" select: Java  */
//
////        Thread.sleep(3000);
//
//        WebDriver driver = new ChromeDriver();
//        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        driver.get("http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//        Select language = new Select(driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']")));
//        language.selectByValue("python");
//        Select language2 = new Select(driver.findElement(By.xpath("//select[@id='dropdowm-menu-2']")));
//        language2.selectByValue("maven");
//        new Select(driver.findElement(By.xpath("//select[@id='dropdowm-menu-3']")))
//                .selectByValue("javascript");
//
//        driver.findElement(By.xpath("//div[@id='checkboxes']//input[@value='option-1']")).click();
//        driver.findElement(By.xpath("//div[@id='checkboxes']//input[@value='option-2']")).click();
//        driver.findElement(By.xpath("//div[@id='checkboxes']//input[@value='option-4']")).click();
//
//        driver.findElement(By.xpath("//form[@id='radio-buttons']//input[@value='blue']")).click();
//
//
//        driver.findElement(By.xpath(
//                "//form[@id='radio-buttons-selected-disabled']//input[@value='pumpkin']")).click();
//
//        driver.findElement(By.xpath("//div[@id='checkboxes']//input[@value='option-1']")).click();
//        driver.findElement(By.xpath("//div[@id='checkboxes']//input[@value='option-2']")).click();
//
//        driver.findElement(By.xpath("//form[@id='radio-buttons']//input[@value='green']")).click();
//
//        Select language3 = new Select(driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']")));
//        language.selectByValue("java");
//    }
//}


