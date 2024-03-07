package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeworkDemoBlazeSignin {
    @Given("login web url {string}")
    public void accessWebUrl(String url){

        System.out.println(url);
    }
    @Given("user enters {string} and {string}")
    public void user_enters(String username, String password) {
        System.out.println(username + " " + password);
    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        System.out.println("click on login button");
    }
    @Then("verify user is logged in")
    public void verify_user_is_logged_in() {
        System.out.println("user is logIn");
    }
}
