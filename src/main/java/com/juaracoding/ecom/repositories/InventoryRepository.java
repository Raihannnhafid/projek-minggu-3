package com.juaracoding.ecom.repositories;

import org.openqa.selenium.By;

public class InventoryRepository {
    public static By inventoryItem = By.xpath("//div[@class='inventory_item']");
    public static By inventoryItemName = By.xpath("//div[@class='inventory_item_name']");
    public static By productSortContainer = By.xpath("//select[@class='product_sort_container']");
    public static By inventoryAddToCart = By.xpath("//button[contains(text(),'ADD TO CART')]");
    public static By inventoryRemoveToCart = By.xpath("//button[contains(text(),'REMOVE')]");
    public static By inventoryCartBadge = By.xpath("//*[@id='shopping_cart_container']/a/span");

}
