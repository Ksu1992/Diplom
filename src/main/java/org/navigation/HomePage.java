package org.navigation;
//Зайдите на сайт https://yapashka.com.ua/ и убедитесь, что на главной странице отображаются следующие элементы:
//         ◦ Логотип компании.
//         ◦ Меню навигации (Главная, О нас, Каталог товаров, Контакты).
//         ◦ Поиск товаров.
//         ◦ Список популярных товаров

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    // Локаторы
    private By logoLocator = By.xpath("//a[@class='logo']");
    private By navigationMenuLocator = By.xpath("//div[@class='header-menu-container']");
    private By homePageLocator = By.xpath("//div[@class='page-footer']");
    private By forUsLocator = By.xpath("//div[@class='footer-block footer-list footer-pages-nav']");
    private By productCatalogLocator = By.xpath("//div[@class='footer-block footer-list category-column']");
    private By contactsLocator = By.xpath("//div[@class='footer-block footer-list contacts-column']");
    private By searchBoxLocator = By.xpath("//div[@class='search-container']");
    private By popularProductsListLocator = By.xpath("//div[contains(@class, 'home-category-favorites-container')]");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Методы для проверки наличия элементов
    public boolean isLogoDisplayed() {
        return driver.findElement(logoLocator).isDisplayed();
    }

    public boolean isNavigationMenuDisplayed() {
        return driver.findElement(navigationMenuLocator).isDisplayed();
    }

    public boolean isHomePageDisplayed() {
        return driver.findElement(homePageLocator).isDisplayed();
    }

    public boolean isForUsDisplayed() {
        return driver.findElement(forUsLocator).isDisplayed();
    }

    public boolean isProductCatalogDisplayed() {
        return driver.findElement(productCatalogLocator).isDisplayed();
    }

    public boolean isContactsDisplayed() {
        return driver.findElement(contactsLocator).isDisplayed();
    }

    public boolean isSearchBoxDisplayed() {
        return driver.findElement(searchBoxLocator).isDisplayed();
    }

    public boolean isPopularProductsListDisplayed() {
        return driver.findElement(popularProductsListLocator).isDisplayed();
    }

    // Геттеры для локаторов
    public By getLogoLocator() {
        return logoLocator;
    }

    public By getNavigationMenuLocator() {
        return navigationMenuLocator;
    }

    public By getHomePageLocator() {
        return homePageLocator;
    }

    public By getForUsLocator() {
        return forUsLocator;
    }

    public By getProductCatalogLocator() {
        return productCatalogLocator;
    }

    public By getContactsLocator() {
        return contactsLocator;
    }

    public By getSearchBoxLocator() {
        return searchBoxLocator;
    }

    public By getPopularProductsListLocator() {
        return popularProductsListLocator;
    }
}
