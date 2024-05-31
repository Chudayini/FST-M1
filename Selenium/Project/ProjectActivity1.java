package Activies;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProjectActivity1 {
    public static void main(String[] args) {
        String expected="Alchemy Jobs – Job Board Application";
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String abc= driver.getTitle();
        System.out.println("Home page title: " + abc);
        if(expected.equals(abc)) {
            System.out.println(" get tittle and home page titles are same");
            driver.quit();
            }
        else{
            System.out.println(" get tittle and home page titles are not same");

        }
    }
}


