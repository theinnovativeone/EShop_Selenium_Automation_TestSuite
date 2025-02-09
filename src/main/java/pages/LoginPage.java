package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WaitUtils;

public class LoginPage extends BasePage {

    private WebDriver driver;

    // loginpage constructor
    public LoginPage(WebDriver driver){
        super(driver);
    }

    //    Locators for login page
    By usernameInput = By.xpath("//input[@id='Email']");
    By passwordInput = By.id("Password");
    By bgElement = By.xpath("//div[@class='login-register-wrapper']");
    By loginButton = By.xpath("//button[@type='submit']");
    By errorMessageNoAccount = By.xpath("//span[contains(text(),'Account does not exists.')]");
    By errorMessageEmptyEmail = By.xpath("//div[contains(text(),'Please enter email')]");
    By errorMessageEmptyPassword = By.xpath("//div[contains(text(),'Please enter password')]");

    public void login(String username, String password){
//        driver.findElement(usernameInput).clear();
//        driver.findElement(passwordInput).clear();

        clearText(usernameInput);
        clearText(passwordInput);

//        driver.findElement(usernameInput).sendKeys(username);
//        driver.findElement(passwordInput).sendKeys(password);

        WaitUtils.waitForElementVisible(60, usernameInput);

        enterText(usernameInput, username);
        enterText(passwordInput, password);

//        driver.findElement(bgElement).click();
//        driver.findElement(loginButton).click();

        click(bgElement);
        click(loginButton);
    }

    public boolean isErrorMsgDisplayedAccountNotExists(){
        return isElementDisplayed(errorMessageNoAccount);
    }

    public boolean isErrorMsgDisplayedEmptyEmail(){
        return isElementDisplayed(errorMessageEmptyEmail);
    }

    public boolean isErrorMsgDisplayedEmptyPassword(){
        return isElementDisplayed(errorMessageEmptyPassword);
    }

    public boolean isErrorMsgDisplayedBothEmpty(){
        return isElementDisplayed(errorMessageEmptyEmail) && isElementDisplayed(errorMessageEmptyPassword);
    }

}
