package tests;

import Utilities.Driver;
import Utilities.UtilWait;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.CommonPage;

//import static Utilities.Driver.driver;

//import static Utilities.Driver.driver;

public class CommonTest {
    static WebDriver driver;
    static CommonPage commonPage;

    @BeforeClass
    public static void initialize() {
        driver = Driver.getDriver();
        driver.get("//www.gadgetarium.us/");
        commonPage = new CommonPage(driver);

    }
    /*
     * go tohttps://www.gadgetarium.us
     * click on About Store
     * verify URL is https://www.gadgetarium.us/about
     *click on Contacts
     * verify UPL is https://www.gadgetarium.us/contacts */


    @Test
    public void verifyURLs() throws InterruptedException {
        driver.get("https://www.gadgetarium.us/");

        CommonPage commonPage = new CommonPage(driver);

        commonPage.aboutStoreTab.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("about"));

        commonPage.contactsTab.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("contact"));
    }

    /* go to https://www.gadgetarium.us/
    click on "cart"*/

    @Test
    public void cartVerify() {
        commonPage.cart.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("cart"));

        commonPage.contactsTab.click();
        Assert.assertEquals("https://gadgetarium.us/contacts", driver.getCurrentUrl());



    }
}
//
//    @FindBy(xpath = "//button[@type='button']/a[@href='/contacts']")
//    public WebElement contactsTab;
//    FluentWait fluentWait = new WebDriverWait(driver, Duration.ofSeconds(30));
//        fluentWait.pollingEvery(Duration.ofSeconds(3))
//                .ignoring(ElementClickInterceptedException.class)
//        .until(ExpectedConditions.elementToBeClickable(commonPage.contactsTab));

