package testclasses;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.AccessoriesPage;
import pages.LoginPage;
import pages.NavigationBarPage;
import utils.FrameworkConstants;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AccessoriesTest extends BaseTest {

    @Test
    public void testAccessoriesPageLoads() {
        LoginPage lp = new LoginPage(driver);
        NavigationBarPage np = new NavigationBarPage(driver);
        AccessoriesPage ap = new AccessoriesPage(driver);

        lp.login(FrameworkConstants.getVariable("VALID_USERNAME"), FrameworkConstants.getVariable("VALID_PASSWORD"));
        np.chooseAccessories();

        String actualTitle = ap.getWebPageTitle();
        String expectedTitle = "Accessories - Web";

        assertEquals(actualTitle, expectedTitle);
        assertTrue(ap.isAccessoriesHeadingPresent());
    }

    @Test
    public void testBottlesAndCagesLoads(){
        LoginPage lp = new LoginPage(driver);
        NavigationBarPage np = new NavigationBarPage(driver);
        AccessoriesPage ap = new AccessoriesPage(driver);

        lp.login(FrameworkConstants.getVariable("VALID_USERNAME"), FrameworkConstants.getVariable("VALID_PASSWORD"));
        np.chooseAccessories();
        ap.goToBottlesAndCages();

        String actualTitle = ap.getWebPageTitle();
        String expectedTitle = "Bottles and Cages - Web";

        assertEquals(actualTitle, expectedTitle);
//        assertTrue(ap.isAccessoriesHeadingPresent());

    }

    @Test
    public void testLightsLoads(){
        LoginPage lp = new LoginPage(driver);
        NavigationBarPage np = new NavigationBarPage(driver);
        AccessoriesPage ap = new AccessoriesPage(driver);

        lp.login(FrameworkConstants.getVariable("VALID_USERNAME"), FrameworkConstants.getVariable("VALID_PASSWORD"));
        np.chooseAccessories();
        ap.goToLights();

        String actualTitle = ap.getWebPageTitle();
        String expectedTitle = "Lights - Web";

        assertEquals(actualTitle, expectedTitle);

    }

    @Test
    public void testLocksLoads(){
        LoginPage lp = new LoginPage(driver);
        NavigationBarPage np = new NavigationBarPage(driver);
        AccessoriesPage ap = new AccessoriesPage(driver);

        lp.login(FrameworkConstants.getVariable("VALID_USERNAME"), FrameworkConstants.getVariable("VALID_PASSWORD"));
        np.chooseAccessories();
        ap.goToLocks();

        String actualTitle = ap.getWebPageTitle();
        String expectedTitle = "Locks - Web";

        assertEquals(actualTitle, expectedTitle);

    }

    @Test
    public void testPumpsLoads(){
        LoginPage lp = new LoginPage(driver);
        NavigationBarPage np = new NavigationBarPage(driver);
        AccessoriesPage ap = new AccessoriesPage(driver);

        lp.login(FrameworkConstants.getVariable("VALID_USERNAME"), FrameworkConstants.getVariable("VALID_PASSWORD"));
        np.chooseAccessories();
        ap.goToPumps();

        String actualTitle = ap.getWebPageTitle();
        String expectedTitle = "Pumps - Web";

        assertEquals(actualTitle, expectedTitle);

    }

    @Test
    public void testTiresAndTubesLoads(){
        LoginPage lp = new LoginPage(driver);
        NavigationBarPage np = new NavigationBarPage(driver);
        AccessoriesPage ap = new AccessoriesPage(driver);

        lp.login(FrameworkConstants.getVariable("VALID_USERNAME"), FrameworkConstants.getVariable("VALID_PASSWORD"));
        np.chooseAccessories();
        ap.goToTiresAndTubes();

        String actualTitle = ap.getWebPageTitle();
        String expectedTitle = "Tires and Tubes - Web";

        assertEquals(actualTitle, expectedTitle);


    }
}
