package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class BasePage {

    private final WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public void clearText(By locator){
        driver.findElement(locator).clear();
    }

    public void click(By locator){
        driver.findElement(locator).click();
    }

    public void enterText(By locator, String text){
        driver.findElement(locator).sendKeys(text);
    }

    public boolean isElementDisplayed(By locator){
        return driver.findElement(locator).isDisplayed();
    }

    public String getWebPageTitle(){
        return driver.getTitle();
    }

    public void toHoverAndSelect(By mainMenuLocator, By optionLocator){
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(mainMenuLocator));
        action.moveToElement(driver.findElement(optionLocator));
        action.click().build().perform();

    }

    public int getCounter(By locator){
        String text = driver.findElement(locator).getText();
        return Integer.parseInt(text);
    }
}
