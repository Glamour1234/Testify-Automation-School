package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class Task15 {
    WebDriver driver;

    @BeforeTest
    public void launchBrowser() {
        System.setProperty("webdriver.chrome.driver", "/Users/mac/IdeaProjects/P4B/src/chromedriver");
        //launch browser
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void googleSearch(){
        //navigates to url
        driver.get("https://www.google.com/");
        //search for testify limited on google
        driver.findElement(By.name("q")).sendKeys("testify ltd");
        driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/img[1]")).click();
        driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[4]/center[1]/input[1]")).click();
    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }

    @Test
    public void printColorCode(){
        //navigates to second url
        driver.get("https://www.mcdonalds.com/us/en-us.html ");
        //print out the color code of the ORDER NOW button on https://www.mcdonalds.com/us/en-us.html
        WebElement color = driver.findElement(By.cssSelector("#button-ordernow"));
        String getColor = color.getCssValue("background-color");
        System.out.println(getColor);
    }

}
