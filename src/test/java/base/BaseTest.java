package base;

import driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import utils.FrameworkConstants;

public class BaseTest {

    public static WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void setup(){
        DriverManager.setDriver();
        driver = DriverManager.getDriver();
        driver.manage().window().maximize();
        driver.get(FrameworkConstants.getVariable("BASE_URL"));
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        DriverManager.closeDriver();
    }
}
