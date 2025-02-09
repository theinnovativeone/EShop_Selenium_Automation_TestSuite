package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

    private static WebDriver driver;

    public static WebDriver getDriver(){
        return driver;
    }

    public static void setDriver(){
        DriverManager.driver = new ChromeDriver();
    }

    public static void closeDriver(){
        if(DriverManager.getDriver() != null){
            DriverManager.getDriver().quit();
        }
    }



}
