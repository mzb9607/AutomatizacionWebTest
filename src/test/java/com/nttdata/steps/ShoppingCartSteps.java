package com.nttdata.steps;

import com.nttdata.page.InventoryPage;
import com.nttdata.page.LoginPage;
import com.nttdata.page.ShoppingCartPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ShoppingCartSteps {

    private WebDriver driver;

    public ShoppingCartSteps(WebDriver driver){
        this.driver = driver;
    }
    public int getItemSize(){
        List<WebElement> items = this.driver.findElements(ShoppingCartPage.cartList);
        return items.size();
    }

    public void addItemToCart(){
        this.driver.findElement(InventoryPage.itemAddToCart).click();
    }

    public void shoppingCartClick(){
        this.driver.findElement(InventoryPage.shoppingCartLink).click();
    }

    public String getNameOfFirstItem(){
        return this.driver.findElement(ShoppingCartPage.firstCart).getText();
    }

}
