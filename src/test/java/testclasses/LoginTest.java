package testclasses;

import org.testng.annotations.Test;
import pages.LoginPage;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest{

    @Test
    public void loginWithValidCredentials() {
        LoginPage lp = new LoginPage(driver);

        lp.login("jaxons.danniels@company.com", "User1234");

        String actualTitle = driver.getTitle();
        String expectedTitle = "Home Page - Web";

        assertEquals(actualTitle, expectedTitle, "Login successful with valid credentials!");
    }

    @Test
    public void loginWithInvalidUsername() {
        LoginPage lp = new LoginPage(driver);

        lp.login("jaxons.invalid@company.com", "User1234");

        String actualTitle = driver.getTitle();
        String expectedTitle = "Login Page - Web";

        assertEquals(actualTitle, expectedTitle, "Login is failed with invalid username!");

        assertTrue(lp.isErrorMsgDisplayedAccountNotExists(), "Error message is displayed that Account does not exist!");
    }

    @Test
    public void loginWithInvalidPassword() {
        LoginPage lp = new LoginPage(driver);

        lp.login("jaxons.danniels@company.com", "Invalid1234");

        String actualTitle = driver.getTitle();
        String expectedTitle = "Login Page - Web";

        assertEquals(actualTitle, expectedTitle, "Login is failed with invalid password!");

        assertTrue(lp.isErrorMsgDisplayedAccountNotExists(), "Error message is displayed that Account does not exist!");
    }

    @Test
    public void loginWithEmptyUsername() {
        LoginPage lp = new LoginPage(driver);

        lp.login("", "Invalid1234");

        String actualTitle = driver.getTitle();
        String expectedTitle = "Login Page - Web";

        assertEquals(actualTitle, expectedTitle, "Login is failed with empty username!");

        assertTrue(lp.isErrorMsgDisplayedEmptyEmail(), "Error message is displayed that Please enter username!");
    }

    @Test
    public void loginWithEmptyPassword() {
        LoginPage lp = new LoginPage(driver);

        lp.login("jaxons.danniels@company.com", "");

        String actualTitle = driver.getTitle();
        String expectedTitle = "Login Page - Web";

        assertEquals(actualTitle, expectedTitle, "Login is failed with empty password!");

        assertTrue(lp.isErrorMsgDisplayedEmptyPassword(), "Error message is displayed that Please enter password!");
    }

    @Test
    public void loginWithEmptyUsernamePassword() {
        LoginPage lp = new LoginPage(driver);

        lp.login("", "");

        String actualTitle = driver.getTitle();
        String expectedTitle = "Login Page - Web";

        assertEquals(actualTitle, expectedTitle, "Login is failed with empty username and password!");

        assertTrue(lp.isErrorMsgDisplayedBothEmpty(), "Error message is displayed that Please enter username and password!");
    }

}
