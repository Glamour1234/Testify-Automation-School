package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task17c {

    @Test
    public void widgetsTile() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/mac/IdeaProjects/P4B/src/chromedriver");
        //launch browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com");
        Thread.sleep(5000);

        driver.findElement(By.xpath("//h5[contains(text(),'Widgets')]")).click();
        WebElement textBox = driver.findElement(By.xpath("//span[contains(text(),'Accordian')]"));
        String textBoxVisible = textBox.getText();
        Assert.assertEquals(textBoxVisible, "Accordian");
    }
}
