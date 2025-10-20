package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    @Given("user is on Login Page")
public void user_is_on_login_page() {
    // Write code here that turns the phrase above into concrete actions
        System.out.println("User is on the login page");
    }

    @When("user enters username and password")
    public void user_enters_username_and_password() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User enters username and password");

    }

    @And("clicks on Login Button")
    public void clicks_on_login_button() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User clicked login");
    }

    @Then("user is navigated to Home Page")
    public void user_is_navigated_to_home_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User is redirected to homepage");

    }

}
