package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationBarPage extends BasePage {

    private WebDriver driver;

    private NavigationBarPage(WebDriver driver){
        super(driver);
    }

    By appLogo = By.xpath("//img[@alt='EShop']");
    By searchBar = By.xpath("//input[@id='searchBar']");
    By searchBtn = By.xpath("//span[@class='k-autocomplete k-input k-input-solid k-input-md k-rounded-md']");
    By categoriesMenu = By.xpath("//body/div[@class='header']/div[@class='header-menu']/ul[@id='menu']/li[1]/span[1]");
    By accessoriesCat1 = By.linkText("Accessories");
    By bikesCat2 = By.linkText("Bikes");
    By clothesCat3 = By.linkText("Clothes");
    By componentsCat4 = By.linkText("Components");
    By favourites = By.xpath("//a[@href='/kendo-ui/eshop/Account/Favorites']");
    By favouritesCounter = By.xpath("//span[@id='favourites-badge']");
    By contacts = By.xpath("//a[normalize-space()='Contacts']");
    By about = By.xpath("//a[normalize-space()='About']");
    By personIcon = By.xpath("//li[@id='profile-btn']//span[@role='none']");
    By profileOption = By.linkText("Profile");
    By ordersOption = By.linkText("Orders");
    By logoutOption = By.linkText("Logout");
    By cart = By.xpath("//span[@class='k-icon k-font-icon k-i-cart']");
    By cartItemCounter = By.xpath("//span[@id='shopping-cart-badge']");

    public void clickOnLogo(){
        click(appLogo);
    }

    public void searchProduct(String productName){
        clearText(searchBar);
        enterText(searchBar, productName);
        click(searchBtn);
    }

    public void chooseAccessories(){
        toHoverAndSelect(categoriesMenu, accessoriesCat1);
    }

    public void chooseBike(){
        toHoverAndSelect(categoriesMenu, bikesCat2);
    }

    public void chooseClothes(){
        toHoverAndSelect(categoriesMenu, clothesCat3);
    }

    public void chooseComponent(){
        toHoverAndSelect(categoriesMenu, componentsCat4);
    }

    public void openFavourites(){
        click(favourites);
    }

    public int getFavourites(){
        return getCounter(favouritesCounter);
    }

    public void openContacts(){
        click(contacts);
    }

    public void openAbout(){
        click(about);
    }

    public void openProfile(){
        toHoverAndSelect(personIcon, profileOption);
    }

    public void openOrders(){
        toHoverAndSelect(personIcon, ordersOption);
    }

    public void toLogout(){
        toHoverAndSelect(personIcon, logoutOption);
    }

    public void openCart(){
        click(cart);
    }

    public int getCartItemCounter(){
        return getCounter(cartItemCounter);
    }

}
