package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/mac/IdeaProjects/P4B/src/chromedriver");
        //launch browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //navigates to url
        driver.get("https://www.saucedemo.com/");
        //login
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        ////add to cart
        driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
        ////click on cart
        driver.findElement(By.className("shopping_cart_link")).click();
        //checkout
        driver.findElement(By.cssSelector("button#checkout")).click();

    }
}
