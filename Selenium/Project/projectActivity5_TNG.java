
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class projectActivity5_TNG {
    WebDriver driver;

    @BeforeTest
    public void beforeMethod() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs");
    }

    @Test
    public void testCase1() {
        String expected="Jobs – Alchemy Jobs";
        driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/jobs/jobs/']")).click();
        String abc= driver.getTitle();
        System.out.println(" page title: " + abc);
        if(expected.equals(abc)) {
            System.out.println("page tittle and expected titles are same");

        }
        else{
            System.out.println(" page tittle and  expected page titles are not same");

        }

    }

    @AfterTest
    public void afterMethod() {
        driver.quit();
    }
}
