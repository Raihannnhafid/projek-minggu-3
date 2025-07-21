package com.juaracoding.ecom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
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

        WebElement addBtn = driver.findElement(By.xpath("(//button[contains(text(),'ADD TO CART')])[1]"));
        addBtn.click();

        WebElement cartBadge = driver.findElement(By.xpath("//*[@id='shopping_cart_container']/a/span"));
        Assert.assertEquals(cartBadge.getText(), "1");

        WebElement removeBtn = driver.findElement(By.xpath("(//button[contains(text(),'REMOVE')])[1]"));
        Assert.assertEquals(removeBtn.getText(), "REMOVE");

        driverManager.quitDriver();
    }
}
