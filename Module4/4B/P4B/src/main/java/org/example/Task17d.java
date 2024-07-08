package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task17d {
    @Test
    public void interactionsTile() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/mac/IdeaProjects/P4B/src/chromedriver");
        //launch browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com");
        Thread.sleep(5000);

        driver.findElement(By.xpath("//h5[contains(text(),'Interactions')]")).click();
        WebElement textBox = driver.findElement(By.xpath("//span[contains(text(),'Sortable')]"));
        String textBoxVisible = textBox.getText();
        Assert.assertEquals(textBoxVisible, "Sortable");
    }
}
