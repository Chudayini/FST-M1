package Activies;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProjectActivity5 {
    public static void main(String[] args) {
        String expected="Jobs – Alchemy Jobs";
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/jobs/jobs/']")).click();
        String abc= driver.getTitle();
        System.out.println(" page title: " + abc);
        if(expected.equals(abc)) {
            System.out.println("page tittle and expected titles are same");
            driver.quit();
        }
        else{
            System.out.println(" page tittle and  expected page titles are not same");

        }
    }
}


