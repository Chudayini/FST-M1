
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class projectActivity9_TNG {
    WebDriver driver;

    @BeforeTest
    public void beforeMethod() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/wp-admin");
    }

    @Test
    public void testCase1() {
        driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("root");
        driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("pa$$w0rd");
        driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
        driver.findElement(By.xpath("//a[@href='edit.php?post_type=job_listing']")).click();
        driver.findElement(By.linkText("Add New")).click();
        driver.findElement(By.xpath("//textarea[@class='editor-post-title__input']")).sendKeys("Application Tester1");
        driver.findElement(By.xpath("//button[text()='Publish...']")).click();

    }

    @AfterTest
    public void afterMethod() {
        driver.quit();
    }
}
