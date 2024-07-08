package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task9 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/mac/IdeaProjects/P4B/src/chromedriver");
        //launch browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //navigates to url
        driver.navigate().to("https://www.saucedemo.com/");
        //login
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(5000);

        driver.navigate().back();
        boolean login = driver.findElement(By.id("login-button")).isDisplayed();
        System.out.println(login);
        Thread.sleep(5000);

        driver.navigate().forward();
        boolean productIsPresent = driver.findElement(By.xpath("//span[contains(text(),'Products')]")).isDisplayed();
        System.out.println(productIsPresent);

    }
}
