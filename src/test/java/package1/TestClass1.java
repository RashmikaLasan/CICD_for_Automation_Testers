package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

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

    public void Test1(){

    }

    public void Test2(){

    }

    public void Test3(){

    }


}
