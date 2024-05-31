
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class projectActivity7_TNG {
    WebDriver driver;

    @BeforeTest
    public void beforeMethod() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs");
    }

    @Test
    public void testCase1() {
        driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/jobs/post-a-job/']")).click();
        String abc = driver.getTitle();
        System.out.println(" page title: " + abc);
        driver.findElement(By.xpath("//input[@id='create_account_email']")).sendKeys("123122@gmail.com");
        driver.findElement(By.xpath("//input[@id='job_title']")).sendKeys("ApplicationTester");
        driver.findElement(By.xpath("//input[@id='job_location']")).sendKeys("Pune");
        driver.findElement(By.xpath("//iframe[@id='job_description_ifr']")).sendKeys("Applicantes have knowledge on mediaton appliaction and have minimum 2 years experience");
        driver.findElement(By.xpath("//input[@id='application']")).sendKeys("uchallag@in.ibm.com");
        driver.findElement(By.xpath("//input[@id='company_name']")).sendKeys("IBM");
        driver.findElement(By.xpath("//input[@value='Preview']")).click();
        driver.findElement(By.xpath("//input[@value='Submit Listing']")).click();
        driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/jobs/jobs/']")).click();
        driver.findElement(By.id("search_keywords")).sendKeys("ApplicationTester");
        driver.findElement(By.xpath("//input[@value='Search Jobs']")).click();

    }

    @AfterTest
    public void afterMethod() {
        driver.quit();
    }
}
