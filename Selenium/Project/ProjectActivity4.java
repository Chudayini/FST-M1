package Activies;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProjectActivity4 {
    public static void main(String[] args) {
        String expected="Quia quis non";
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String abc=driver.findElement(By.tagName("h2")).getText();
        System.out.println("second heading of webpage : " + abc);
        if(expected.equals(abc)) {
            System.out.println("webpage 2nd heading and expected  heading  are same");
            driver.quit();
        }
        else{
            System.out.println("webpage 2nd heading and expected  heading  are not same");

        }
    }
}


