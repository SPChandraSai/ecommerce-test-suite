package com.selenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EcommerceTest {
    WebDriver driver;
    
    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTestingProject\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    
    @Test(priority = 1)
    public void testLogin() {
        driver.get("https://www.saucedemo.com/");
        WebElement username = driver.findElement(By.id("user-name"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));
        
        username.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
        loginButton.click();
        
        WebElement inventoryPage = driver.findElement(By.className("inventory_list"));
        Assert.assertTrue(inventoryPage.isDisplayed(), "Login failed!");
    }
    
    @Test(priority = 2)
    public void testCheckout() {
        driver.get("https://www.saucedemo.com/inventory.html");
        WebElement addToCart = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        WebElement cart = driver.findElement(By.className("shopping_cart_link"));
        WebElement checkout = driver.findElement(By.id("checkout"));
        
        addToCart.click();
        cart.click();
        checkout.click();
        
        WebElement checkoutPage = driver.findElement(By.className("checkout_info"));
        Assert.assertTrue(checkoutPage.isDisplayed(), "Checkout failed!");
    }
    
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
