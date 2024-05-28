import org.testng.annotations.*;

public class TestNGExample {
    @BeforeClass
    public void setUpForClass(){
        System.out.println("before every test methoed");
    }
    @BeforeMethod
    public void setup(){
        System.out.println("before each test methoed");
    }
    @Test(priority=0)
    public void bsucessfulLoginTest(){
        System.out.println("this is method 1");

    }
    @Test(priority=1)
    public void aunsucessfulLoginTest() {
        System.out.println("this is method 2");
    }
    @AfterMethod
    public void teardown() {
        System.out.println("after each test methoed");
    }
    @AfterClass
    public void tesardownforclass() {
        System.out.println("after every test methoed");
    }
}
