package com.juaracoding.ecom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.juaracoding.ecom.repositories.InventoryRepository;
import com.juaracoding.ecom.utils.DriverManager;
import com.juaracoding.ecom.utils.LoginUtil;

public class InventoryAddCartTest {

    @Test
    public void addToCartTest() throws InterruptedException {
        DriverManager driverManager = new DriverManager();
        WebDriver driver = driverManager.getDriver();
        driver.get("https://www.saucedemo.com/v1/index.html");

        LoginUtil.performLogin(driver);
        Thread.sleep(2000);

        WebElement addBtn = driver.findElement(InventoryRepository.inventoryAddToCart);
        addBtn.click();

        WebElement cartBadge = driver.findElement(InventoryRepository.inventoryCartBadge);
        Assert.assertEquals(cartBadge.getText(), "1");

        WebElement removeBtn = driver.findElement(InventoryRepository.inventoryRemoveToCart);
        Assert.assertEquals(removeBtn.getText(), "REMOVE");

        driverManager.quitDriver();
    }
}
