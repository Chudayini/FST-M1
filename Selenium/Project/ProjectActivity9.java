package Activies;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProjectActivity9 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/wp-admin");
        driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("root");
        driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("pa$$w0rd");
        driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        driver.findElement(By.xpath("//a[@href='edit.php?post_type=job_listing']")).click();
        driver.findElement(By.linkText("Add New")).click();
        driver.findElement(By.xpath("//textarea[@class='editor-post-title__input']")).sendKeys("Application Tester1");
        driver.findElement(By.xpath("//button[text()='Publish...']")).click();
       // driver.findElement(By.xpath("//a[@href='edit.php?post_type=job_listing']")).click();
        driver.quit();
    }

}


