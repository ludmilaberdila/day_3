package step_definitions;

import Utilities.Driver;
import Utilities.UtilWait;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.CommonPage;

public class HomePageSteps {
    private Utilities.Driver Driver;
    WebDriver driver = Driver.getDriver();
    CommonPage commonPage = new CommonPage(driver);
    @Given("user is on {string} page")
    public void user_is_on_page(String string) {
        driver.get("url");
    }
    @When("user clicks  on facebook button")
    public void user_clicks_on_facebook_button() {
       // UtilWait.waitUntilElementIsClickable(driver, 20, commonPage.facebookIcon);
       commonPage.facebookIcon.click();
    }
    @Then("verify the url is {string}")
    public void verify_the_url_is(String string) {

        Assert.assertEquals("url", driver.getCurrentUrl());
    }

    @When("user clicks on {string} page")
    public void user_clicks_on_page(String pageName) throws InterruptedException {
        Thread.sleep(7000);
        //UtilWait.waitUntilElementIsClickable(driver, 15, By.linkText(pageName));
    driver.findElement(By.linkText(pageName)).click();
    }

}
