package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccessoriesPage extends BasePage {

    private WebDriver driver;
    private NavigationBarPage navigationbar;

    public AccessoriesPage(WebDriver driver){
        super(driver);
        this.navigationbar = new NavigationBarPage(driver);
    }

    By accessoriesHeading = By.xpath("//div[@class='category-heading-large']");
    By bottlesAndCages = By.xpath("//div[contains(text(),'Bottles & Cages')]");
    By lights = By.xpath("//div[contains(text(),'Lights')]");
    By locks = By.xpath("//div[contains(text(),'Locks')]");
    By pumps = By.xpath("//div[contains(text(),'Pumps')]");
    By tiresAndTubes = By.xpath("//div[@class='category-heading heading-double']");

    public boolean isAccessoriesHeadingPresent(){
        return isElementDisplayed(accessoriesHeading);
    }

    public String getHeadingAccessories(){
//        return ((WebElement)accessoriesHeading).getText();
        return  getTextOfLocator(accessoriesHeading);
    }

    public void goToBottlesAndCages(){
        click(bottlesAndCages);
    }

    public void goToLights(){
        click(lights);
    }

    public void goToLocks(){
        click(locks);
    }

    public void goToPumps(){
        click(pumps);
    }

    public void goToTiresAndTubes(){
        click(tiresAndTubes);
    }

}
