package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task17a {
    @Test
    public void elementTile() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/mac/IdeaProjects/P4B/src/chromedriver");
        //launch browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com");
        Thread.sleep(5000);

        driver.findElement(By.xpath("//h5[contains(text(),'Elements')]")).click();
        WebElement textBox = driver.findElement(By.xpath("//span[contains(text(),'Text Box')]"));
        String textBoxVisible = textBox.getText();
        Assert.assertEquals(textBoxVisible, "Text Box");



    }
}
