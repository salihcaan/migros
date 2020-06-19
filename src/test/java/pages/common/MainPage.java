package pages.common;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbstractPage;
import utils.Browser;

public class MainPage extends AbstractPage
{
    public MainPage(Browser browser)
    {
        super(browser);
    }

    @FindBy(id = "membership-login-link")
    public WebElement loginButton;

    @FindBy(linkText = "Et, Balık, Kümes")
    public WebElement meatFishChichkenMenu;

    @FindBy(css = "a[data-monitor-ga-action='Kırmızı Et']")
    public WebElement meatCategory;
    
    // Enter the "Bebek, Oyuncak" menü
    @FindBy(linkText = "Bebek, Oyuncak")
    public WebElement bebekOyuncakMenu;

    // Select the Category "Bebek Bezi"
    @FindBy(css = "a[data-monitor-ga-action='Bebek Bezi']")
    public WebElement bebekBeziCategory;

   // Select the Brand -Prima-
    @FindBy(css = "a[href='prima-b-390/bebek-bezi-c-ab']")
    public WebElement selectBebekBeziBrand;

    // Select the 4-Beden
    @FindBy(css = "a[data-monitor-ga-label='4 Beden']")
    public WebElement check4BedenClick;

    // Open the Sorting List
    @FindBy(css = ".priority-sort-bar .others-button")
    public WebElement openSortingList;

    // Sorting Max Price
    @FindBy(xpath = "//*[@id='product-list-sort']/nav/ul[1]/li[5]/a")
    public WebElement sortingMaxPrice;

    @FindBy(css = ".shoping-cart-icon-block .fa-shopping-cart")
    public WebElement shoppingBasketButton;

    @FindBy(className = "progress-bar-text")
    public WebElement progressBarText;

    @FindBy(css = ".action-td .plus-orange")
    public WebElement plusButton;

    @FindBy(className = "rubbish")
    public WebElement trashButton;

    @FindBy(className = "go-to-basket-button")
    public WebElement goToBasketButton;
}
