package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ComponentsPage extends BasePage {

    private WebDriver driver;
    private NavigationBarPage navigationBarPage;

    public ComponentsPage(WebDriver driver){
        super(driver);
        this.navigationBarPage = new NavigationBarPage(driver);
    }

    By componentsHeading = By.xpath("//div[@class='category-heading-large']");
    By chains = By.xpath("//div[contains(text(),'Chains')]");
    By derailleurs = By.xpath("//div[contains(text(),'Derailleurs')]");
    By forks = By.xpath("//div[contains(text(),'Forks')]");
    By handlers = By.xpath("//div[contains(text(),'Handlebars')]");
    By mountainFrames = By.xpath("//div[@class='category-heading heading-double']");
    By pedals = By.xpath("//div[contains(text(),'Pedals')]");
    By saddles = By.xpath("//div[contains(text(),'Saddles')]");
    By touringFrames = By.xpath("//div[contains(text(),'Touring Frames')]");
    By wheels = By.xpath("//div[contains(text(),'Wheels')]");

    public void goToChains(){
        click(chains);
    }

    public void goToDerailleurs(){
        click(derailleurs);
    }

    public void goToForks(){
        click(forks);
    }

    public void goToHandlers(){
        click(handlers);
    }

    public void goToMountainFrames(){
        click(mountainFrames);
    }

    public void goToPedals(){
        click(pedals);
    }

    public void goToSaddles(){
        click(saddles);
    }

    public void goToTouringFrames(){
        click(touringFrames);
    }

    public void goToWheels(){
        click(wheels);
    }

}
