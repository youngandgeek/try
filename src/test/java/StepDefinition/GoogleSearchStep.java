package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class GoogleSearchStep {

    WebDriver driver=null;

    @Given("browse is open")
    public void browse_is_open() {
System.out.println("Inside step browser is open");
        System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver-win64/chromedriver.exe");
   driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
     //   driver.manage().window().fullscreen();
    }

    @Given("User is on google search page")
    public void user_is_on_google_search_page() {
        // Write code here that turns the phrase above into concrete actions
        driver.get("https://www.google.com");

    }

    @When("user enters a text in search text area")
    public void user_enters_a_text_in_search_text_area() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
      driver.findElement(By.name("q")).sendKeys("Automation step by step");
      Thread.sleep(2000);
    }

    @When("hits enter")
    public void hits_enter() throws InterruptedException {
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);

    }

    @Then("User Navigated to search result")
    public void user_navigated_to_search_result() {
        driver.getPageSource().contains("Online courses");

    }

}
