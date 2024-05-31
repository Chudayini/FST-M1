package Activies;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProjectActivity6 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs");
        driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/jobs/jobs/']")).click();
        String abc = driver.getTitle();
        System.out.println(" page title: " + abc);
        driver.findElement(By.id("search_keywords")).sendKeys("Banking");
        driver.findElement(By.xpath("//input[@value='Search Jobs']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.get("https://alchemy.hguy.co/jobs/job/ibm-2-banking/");
        driver.findElement(By.xpath("//input[@value='Apply for job']")).click();
        //String note=driver.findElement(By.xpath("//article/div/div/div/div/p/fallowing::after[]")).getText();
        //System.out.println(note);
        driver.quit();
    }
}


