
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class projectActivity4_TNG {
    WebDriver driver;

    @BeforeTest
    public void beforeMethod() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs");
    }

    @Test
    public void testCase1() {
        String expected="Quia quis non";
        String abc=driver.findElement(By.tagName("h2")).getText();
        System.out.println("second heading of webpage : " + abc);
        if(expected.equals(abc)) {
            System.out.println("webpage 2nd heading and expected  heading  are same");

        }
        else{
            System.out.println("webpage 2nd heading and expected  heading  are not same");

        }

    }

    @AfterTest
    public void afterMethod() {
        driver.quit();
    }
}
