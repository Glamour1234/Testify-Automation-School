package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task16 {
    WebDriver driver;

    @Test
    public void assertion() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/mac/IdeaProjects/P4B/src/chromedriver");
        //launch browser
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.testifyltd.com/");

        //scroll up
        JavascriptExecutor scrollUp = (JavascriptExecutor) driver;
        scrollUp.executeScript("window.scrollBy(0, 5500)");

//        WebElement ass = driver.findElement(By.xpath("//p[contains(text(),' (+234)905-882-0971')]"));
//        Assert.assertEquals(ass,"(+234)905-882-0971");

        // Locate the "Our Contact" section
        driver.findElement(By.xpath("//a[contains(text(),'Contact Us')]")).click();
        Thread.sleep(2000);
        // Assert the email address
        String expectedEmail = "info@testifyltd.com";
        String actualEmail = driver.findElement(By.cssSelector("div div div div div:nth-child(1) li:nth-child(1) span:nth-child(2)")).getText();
        System.out.println("Actual Email: " + actualEmail);
        System.out.println("Expected Email: " + expectedEmail);
        Assert.assertEquals(actualEmail, expectedEmail);

        // Assert the location
        String expectedLocation = "Nigeria";
        String actualLocation = driver.findElement(By.cssSelector("div:nth-child(3) li:nth-child(1) span:nth-child(2)")).getText();
        System.out.println("Actual Location: " + actualLocation);
        System.out.println("Expected Location: " + expectedLocation);
        Assert.assertTrue(actualLocation.contains(expectedLocation));

        // Assert the phone number
       String actualPhone = driver.findElement(By.xpath("//span[contains(text(),'(+234)905-882-0971')]")).getText();
        Assert.assertEquals(actualPhone, "(+234)905-882-0971");



    }
}
