package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestClass1 {

    public static WebDriver driver;

    @BeforeMethod
    public void launchDriver(){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Lasan Rashmika\\OneDrive\\Documents\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void Test1() {

        driver.navigate().to("https://automationtalks.com/");
        System.out.println(driver.getTitle());
    }

    @Test
    public void Test2() {

        driver.navigate().to("https://automationtalks.com/");
        System.out.println(driver.getTitle());
    }

    @AfterMethod
    public void Test3() {

        driver.quit();
        System.out.println("Lasan001 the Browser");
    }

}
