package tests.purchase;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import pages.common.CategoryPage;
import pages.common.MainPage;
import pages.purchase.BasketPage;
import tests.AbstractTest;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class SearchTest extends AbstractTest
{
    /**
     * Positive
     *
     * Bebek, Oyuncak -> Bebek Bezi -> Selecting Brand -Prima- -> Sorting Max Price -> Added Basket Most Expensive product
     */
    @Test
    public void testBebekBeziPrima4Beden()
    {
        // create new attributes if needed in MainPage
        MainPage mainPage = new MainPage(browser);
        browser.waitAndClick(mainPage.bebekOyuncakMenu);
        browser.waitAndClick(mainPage.bebekBeziCategory);
        browser.waitAndClick(mainPage.selectBebekBeziBrand);
        browser.waitAndClick(mainPage.check4BedenClick);
        browser.waitAndClick(mainPage.openSortingList);
        browser.waitAndClick(mainPage.sortingMaxPrice);

        CategoryPage categoryPage = new CategoryPage(browser);
        browser.waitAndClick(categoryPage.addBasket);

    }

}
