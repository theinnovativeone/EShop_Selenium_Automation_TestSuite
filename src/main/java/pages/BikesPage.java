package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BikesPage extends BasePage {

    private WebDriver driver;
    private NavigationBarPage navigationbar;

    public BikesPage(WebDriver driver){
        super(driver);
        this.navigationbar = new NavigationBarPage(driver);
    }

    By bikesHeading = By.xpath("//div[@class='category-heading-large wrap-width']");
    By mountainBikes = By.xpath("//div[contains(text(),'Mountain Bikes')]");
    By roadBikes = By.xpath("//div[contains(text(),'Road Bikes')]");
    By touringBikes = By.xpath("//div[contains(text(),'Touring Bikes')]");

    public void goToMountainBikes(){
        click(mountainBikes);
    }

    public void goToRoadBikes(){
        click(roadBikes);
    }

    public void goToTouringBikes(){
        click(touringBikes);
    }

}
