//package Automate_Test;
//
//import Utilities.Driver;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Dimension;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.ui.Wait;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.io.File;
//import java.time.Duration;
//import java.util.concurrent.TimeUnit;
//
//public class testing {
//    public static void main(String[] args) throws InterruptedException {
//        WebDriver driver = Driver.getDriver();
//        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//        Dimension browserSize = new Dimension(1400, 1000);
//        driver.manage().window().setSize(browserSize);
//
//        driver.get("https://codewiser.studymate.us/login");
//        // wait until page is loaded
//        wait.until(d -> driver.findElement(By.xpath("//input[@id=':r0:']")).isDisplayed());
//        System.out.println( "page loaded successfully");
//
//        System.out.println( "fill up login form...");
//        driver.findElement(By.xpath("//input[@id=':r0:']"))
//                .sendKeys("admin@codewise.com");
//        Thread.sleep(300);
//        driver.findElement(By.xpath("//input[@id=':r1:']"))
//                .sendKeys("codewise123");
//        Thread.sleep(300);
//
//        driver.findElement(By.xpath("//button[@type='submit']")).click();
//        wait.until(d -> driver.findElement(By.xpath("//li[contains(text(),'Student')]"))
//                .isDisplayed());
//        Thread.sleep(2000);
//        System.out.println( "User loged in");
//
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        driver.findElement(By.xpath("//li[contains(text(),'Student')]")).click();
//
//
//
//        // find file on machine and create an upload file by providing full absolute path
////        File uploadFile = new File("C:\\Users\\Aspire_R_14\\Desktop\\ptacrices\\SeleniumFirstProjectBatch_4" +
////                "\\src\\test\\java\\Automate_Test\\student_test.csv");
//        File uploadFile = new File("src\\test\\java\\Automate_Test\\student_test.csv");
//        System.out.println("????????????????????");
//        System.out.println(uploadFile.getAbsolutePath());
//        System.out.println("????????????????????");
//        Thread.sleep(3000);
//        // selected file inset it into input field
//        driver.findElement(By.xpath("//button[contains(text(), 'Import Excel')]")).click();
//        System.out.println("import excel click");
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//div[contains(@id, 'modal')]//div[@id='mui-component-select-groupId']"))
//                .click();
//        System.out.println("select group click");
//        driver.findElement(By.xpath("//ul[@role='listbox']//li[contains(text(), 'batch3')]")).click();
//        System.out.println("batch selected");
//        driver.findElement(By.xpath("//div[@id='content']//input[@type='file']"))
//                .sendKeys(uploadFile.getAbsolutePath());
//        System.out.println("file provided");
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//button[@type='submit']")).click();
//        Thread.sleep(1500);
////        compareAlertMessage(driver,
////                "errorSuccess",
////                "No valid entries or contents found, this is not a valid OOXML (Office Open XML) file");
//
//        Thread.sleep(5000);
//    }
//}
