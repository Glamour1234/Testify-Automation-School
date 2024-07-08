package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Register {

    @Test
    public static void registerUser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/mac/IdeaProjects/P4B/src/chromedriver");
        //launch browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //navigates to url
        driver.get("https://parabank.parasoft.com");
        Thread.sleep(5000);
        //click on registration button
        driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
        //fill sign-up form
        driver.findElement(By.name("customer.firstName")).sendKeys("Elohor");
        driver.findElement(By.name("customer.lastName")).sendKeys("Evwrujae");
        driver.findElement(By.id("customer.address.street")).sendKeys("9 Adebowale");
        driver.findElement(By.id("customer.address.city")).sendKeys("Ikeja");
        driver.findElement(By.id("customer.address.state")).sendKeys("Lagos");
        driver.findElement(By.name("customer.address.zipCode")).sendKeys("100101");
        driver.findElement(By.name("customer.phoneNumber")).sendKeys("08067158436");
        driver.findElement(By.name("customer.ssn")).sendKeys("9898778654333");
        driver.findElement(By.name("customer.username")).sendKeys("mantra123"); //mantra123
        driver.findElement(By.name("customer.password")).sendKeys("Password@12");
        driver.findElement(By.name("repeatedPassword")).sendKeys("Password@12");
        driver.findElement(By.xpath("//tbody/tr[13]/td[2]/input[1]")).click();


    }
}

