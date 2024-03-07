package step_definitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class SampleSteps {

    @Given("admin is logged in to the system")
    public void admin_is_logged_in_to_the_system() {
        System.out.println("admin is logged id in the system");
    }

    @When("admin goes to students page")
    public void admin_goes_to_students_page() {
        System.out.println("admin goes to pages");
    }

    @Then("admin click on create new student button")
    public void admin_click_on_create_new_student_button() {
        System.out.println("admin goes to students page");
    }

    @Then("admin creates a student")
    public void admin_creates_a_student() {
        System.out.println("admin creates a student");
    }

    @Then("verify student is created")
    public void verify_student_is_created() {
        System.out.println("Student is successfully created");
    }

    @Then("admin creates {int} students")
    public void admin_creates_students(Integer int1) {
        System.out.println("success");
    }

    @Then("verify {int} students are created")
    public void verify_students_are_created(Integer int1) {
        System.out.println("success2");

    }
    @Given("user logs in")
    public void user_logs_in() {

        System.out.println("user logged in");
    }
    @When("user goes to home page")
    public void user_goes_to_home_page() {

        System.out.println("user goes to home page");
    }
    @Then("print number {int}")
    public void print_number(int int1) {
        System.out.println("printing " + int1);
    }
    @Then("print number {string}")
    public void print_number(DataTable dataTable) {

        List<Integer> numbers = dataTable.asList(Integer.class);

        for (int i : numbers){
            System.out.println(i);
        }
    }

    @Given("user is on homepage")
    public void user_is_on_homepage() {
        System.out.println("user is on homepage");
    }
    @Then("user logs in to system")
    public void user_logs_in_to_system(io.cucumber.datatable.DataTable dataTable) {

        List<String> users = dataTable.asList(String.class);

        for (String user : users){
            System.out.println(user + " logged in");
        }
    }



}
