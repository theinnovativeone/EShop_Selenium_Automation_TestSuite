package testclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    WebDriver driver;

    public WebDriver getDriver(){
        driver = new ChromeDriver();
        return driver;
    }

    @BeforeTest
    public void setup(){
        driver = getDriver();
        driver.manage().window().maximize();
        driver.get("https://demos.telerik.com/kendo-ui/eshop/Account/Login");
    }

    @AfterTest
    public void teardown(){
        driver.quit();
    }
}
