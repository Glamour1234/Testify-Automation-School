package org.pom;

import org.example.Task18addToCart;
import org.example.Task18checkOut;
import org.example.Task18loginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest {
    WebDriver driver = null;

    @Test
    public void cartTest(){
        System.setProperty("webdriver.chrome.driver", "/Users/mac/IdeaProjects/P4B/src/chromedriver");
        //launch browser
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        //login
        Task18loginPage login = new Task18loginPage(driver);
        login.getUsername().sendKeys("standard_user");
        login.getPassword().sendKeys("secret_sauce");
        login.getLogin().click();

        //add to cart
        Task18addToCart add = new Task18addToCart(driver);
        add.getAddToCart().click();
        add.getOpenCart().click();

        //assert items added to cart are items you selected
        WebElement item = driver.findElement(By.xpath("//div[@class='inventory_item_name']"));
        String displayItem = item.getText();
        Assert.assertEquals(displayItem, "Sauce Labs Backpack");

        //checkout item
        Task18checkOut check = new Task18checkOut(driver);
        check.getCheckOut().click();
        check.getfName().sendKeys("Elohor");
        check.getlName().sendKeys("Evw");
        check.getPcode().sendKeys("9100119");
        check.getCont().click();
        //assert item selected is displayed on checkout page
        WebElement item2 = driver.findElement(By.xpath("//div[@class='inventory_item_name']"));
        String displayItem2 = item2.getText();
        Assert.assertEquals(displayItem2, "Sauce Labs Backpack");

        check.getFinish().click();
        //assert that customer sees thank you on final page
        WebElement tnx = driver.findElement(By.xpath("//h2[contains(text(),'Thank you for your order!')]"));
        String isDisplayed = tnx.getText();
        Assert.assertEquals(isDisplayed, "Thank you for your order!");


    }
}
