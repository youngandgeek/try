package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSetup {
//    public static void main(String[] args){

    @Test
    public void tes (){
    WebDriver driver= new ChromeDriver();
    driver.get("https://demoqa.com");
}
}
