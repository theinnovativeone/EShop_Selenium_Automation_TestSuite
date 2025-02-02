package testclasses;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.FrameworkConstants;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static utils.FrameworkConstants.*;

public class LoginTest extends BaseTest {

    @Test
    public void testLoginWithValidCredentials() {
        LoginPage lp = new LoginPage(driver);

        lp.login(FrameworkConstants.getVariable("VALID_USERNAME"), FrameworkConstants.getVariable("VALID_PASSWORD"));

        String actualTitle = lp.getWebPageTitle();
        String expectedTitle = "Home Page - Web";

        assertEquals(actualTitle, expectedTitle, "Login successful with valid credentials!");
    }

    @Test
    public void testLoginWithInvalidUsername() {
        LoginPage lp = new LoginPage(driver);

        lp.login(FrameworkConstants.getVariable("INVALID_USERNAME"), FrameworkConstants.getVariable("VALID_PASSWORD"));

        String actualTitle = lp.getWebPageTitle();
        String expectedTitle = "Login Page - Web";

        assertEquals(actualTitle, expectedTitle, "Login is failed with invalid username!");

        assertTrue(lp.isErrorMsgDisplayedAccountNotExists(), "Error message is displayed that Account does not exist!");
    }

    @Test
    public void testLoginWithInvalidPassword() {
        LoginPage lp = new LoginPage(driver);

        lp.login(FrameworkConstants.getVariable("VALID_USERNAME"), FrameworkConstants.getVariable("INVALID_PASSWORD"));

        String actualTitle = lp.getWebPageTitle();
        String expectedTitle = "Login Page - Web";

        assertEquals(actualTitle, expectedTitle, "Login is failed with invalid password!");

        assertTrue(lp.isErrorMsgDisplayedAccountNotExists(), "Error message is displayed that Account does not exist!");
    }

    @Test
    public void testLoginWithEmptyUsername() {
        LoginPage lp = new LoginPage(driver);

        lp.login("", FrameworkConstants.getVariable("VALID_PASSWORD"));

        String actualTitle = lp.getWebPageTitle();
        String expectedTitle = "Login Page - Web";

        assertEquals(actualTitle, expectedTitle, "Login is failed with empty username!");

        assertTrue(lp.isErrorMsgDisplayedEmptyEmail(), "Error message is displayed that Please enter username!");
    }

    @Test
    public void testLoginWithEmptyPassword() {
        LoginPage lp = new LoginPage(driver);

        lp.login(FrameworkConstants.getVariable("VALID_USERNAME"), "");

        String actualTitle = lp.getWebPageTitle();
        String expectedTitle = "Login Page - Web";

        assertEquals(actualTitle, expectedTitle, "Login is failed with empty password!");

        assertTrue(lp.isErrorMsgDisplayedEmptyPassword(), "Error message is displayed that Please enter password!");
    }

    @Test
    public void testLoginWithEmptyUsernamePassword() {
        LoginPage lp = new LoginPage(driver);

        lp.login("", "");

        String actualTitle = lp.getWebPageTitle();
        String expectedTitle = "Login Page - Web";

        assertEquals(actualTitle, expectedTitle, "Login is failed with empty username and password!");

        assertTrue(lp.isErrorMsgDisplayedBothEmpty(), "Error message is displayed that Please enter username and password!");
    }

}
