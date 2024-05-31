package Activies;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProjectActivity2 {
    public static void main(String[] args) {
        String expected="Welcome to Alchemy Jobs";
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String abc=driver.findElement(By.className("entry-title")).getText();
        System.out.println("heading of webpage : " + abc);
        if(expected.equals(abc)) {
            System.out.println("webpage heading and expected  heading  are same");
            driver.quit();
        }
        else{
            System.out.println("webpage heading and expected  heading  are not same");

        }
    }
}


