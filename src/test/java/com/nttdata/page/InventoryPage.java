package com.nttdata.page;

import org.openqa.selenium.By;

public class InventoryPage {

    public static By productsTitle = By.cssSelector("span.title");
    public static By itemsCards = By.cssSelector("div.inventory_item");

    public static By itemAddToCart = By.cssSelector("#add-to-cart-sauce-labs-bike-light");
    public static By shoppingCartLink = By.cssSelector("a.shopping_cart_link");
}
