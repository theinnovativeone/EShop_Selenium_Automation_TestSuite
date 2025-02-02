package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utils.FrameworkConstants;

public class BaseTest {

    public WebDriver driver;

    public WebDriver getDriver(){
        driver = new ChromeDriver();
        return driver;
    }

    @BeforeTest
    public void setup(){
        driver = getDriver();
        driver.manage().window().maximize();
        driver.get(FrameworkConstants.getVariable("BASE_URL"));
    }

    @AfterTest
    public void teardown(){
        driver.quit();
    }
}
