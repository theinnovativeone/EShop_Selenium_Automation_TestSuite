package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver driver;

    // loginpage constructor
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    //    Locators for login page
    By usernameInput = By.xpath("//input[@name= 'Email']");
    By passwordInput = By.id("Password");
    By bgElement = By.xpath("//div[@class='login-register-wrapper']");
    By loginButton = By.xpath("//button[@type='submit']");
    By errorMessageNoAccount = By.xpath("//span[contains(text(),'Account does not exists.')]");
    By errorMessageEmptyEmail = By.xpath("//div[contains(text(),'Please enter email')]");
    By errorMessageEmptyPassword = By.xpath("//div[contains(text(),'Please enter password')]");

    public void login(String username, String password){
        driver.findElement(usernameInput).clear();
        driver.findElement(passwordInput).clear();

        driver.findElement(usernameInput).sendKeys(username);
        driver.findElement(passwordInput).sendKeys(password);

        driver.findElement(bgElement).click();

        driver.findElement(loginButton).click();

    }

    public boolean isErrorMsgDisplayedAccountNotExists(){
        return driver.findElement(errorMessageNoAccount).isDisplayed();
    }

    public boolean isErrorMsgDisplayedEmptyEmail(){
        return driver.findElement(errorMessageEmptyEmail).isDisplayed();
    }

    public boolean isErrorMsgDisplayedEmptyPassword(){
        return driver.findElement(errorMessageEmptyPassword).isDisplayed();
    }

    public boolean isErrorMsgDisplayedBothEmpty(){
        return driver.findElement(errorMessageEmptyEmail).isDisplayed() && driver.findElement(errorMessageEmptyPassword).isDisplayed();
    }

}
