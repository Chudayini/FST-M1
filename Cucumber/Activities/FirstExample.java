package stepDefinition;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FirstExample extends Baseclass {

    @BeforeAll
    public static void setUP() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    @Given("the user is on homepage")
    public void openBrowser() {
        driver.get("https://v1.training-support.net");
        Assertions.assertEquals("Training Support", driver.getTitle());
    }

    @When("they click on about us link")
    public void clicklink() {
        driver.findElement(By.id("about-link")).click();
    }

    @Then("the user redirected to about page")
    public void aboutpage() {
        Assertions.assertEquals("About Training Support", driver.getTitle());
    }

    @AfterAll
    public static void closebrowser() {
        driver.quit();
    }

}
