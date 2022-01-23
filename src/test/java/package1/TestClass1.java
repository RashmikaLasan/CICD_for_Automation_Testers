package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestClass1 {

    public static WebDriver driver;

    @BeforeMethod
    public void launchDriver(){

        System.setProperty("webdriver.chroe.driver","C:\\Users\\Lasan Rashmika\\OneDrive\\Documents\\Automation_Projects\\Selenium-Advance-Framework\\src\\test\\java\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void Test1(){

        driver.navigate().to("https://automationtalks.com/");
        System.out.println("Test 1 Title is "+ driver.getTitle());
    }

    public void Test2(){

    }

    public void Test3(){

    }


}
