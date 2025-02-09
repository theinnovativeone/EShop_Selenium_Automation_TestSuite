package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClothesPage extends BasePage {

    private WebDriver driver;
    private NavigationBarPage navigationbar;

    public ClothesPage(WebDriver driver){
        super(driver);
        this.navigationbar = new NavigationBarPage(driver);
    }

    By clothesHeading = By.xpath("//div[@class='category-heading-large wrap-width']");
    By jerseys = By.xpath("//div[contains(text(),'Jerseys')]");
    By shorts = By.xpath("//div[contains(text(),'Shorts')]");

    public void goToJerseys(){
        click(jerseys);
    }

    public void goToShorts(){
        click(shorts);
    }
}
