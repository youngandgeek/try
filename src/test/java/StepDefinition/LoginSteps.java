package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginSteps {
WebDriver driver=null;

    @Given("browser is open")
    public void browser_is_open() {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver-win64/chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @And("user is on Login Page")
public void user_is_on_login_page() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
driver.get("https://cirro.io/users/sign_in");
    Thread.sleep(3000);
    }

    @When("user enters username and password")
    public void user_enters_username_and_password() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
driver.findElement(By.id("user_email")).sendKeys("eman@gmail.com");
driver.findElement(By.id("user_password")).sendKeys("123456");
Thread.sleep(3000);
    }

    @And("clicks on Login Button")
    public void clicks_on_login_button() {
        // Write code here that turns the phrase above into concrete actions
driver.findElement(By.name("commit")).click();

    }

    @Then("user is navigated to Home Page")
    public void user_is_navigated_to_home_page() {
        // Write code here that turns the phrase above into concrete actions
System.out.println("done");

    }

}
