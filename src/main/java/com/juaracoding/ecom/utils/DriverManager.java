package com.juaracoding.ecom.utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {
    private WebDriver driver;

    public DriverManager() {
        driver = new FirefoxDriver(); // Inisialisasi browser (bisa diganti ke ChromeDriver dll)
        driver.manage().window().maximize(); // // Memaksimalkan jendela browser
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1)); // Implicit wait
    }

    public WebDriver getDriver() {
        return driver; // Mengembalikan objek driver agar bisa digunakan di test
    }

    public void quitDriver() {
        if (driver != null) {
            driver.quit(); // Menutup browser
            driver = null; // Menghapus referensi dari memori (best practice)
        }
    }
}
