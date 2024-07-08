package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Task14 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/mac/IdeaProjects/P4B/src/chromedriver");
        //launch browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //navigates to url
        driver.get("https://www.toolsqa.com/");

        // Wait for the dialogue box to appear and then close it
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement closeButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='accept-cookie-policy']")));

        Thread.sleep(3000);

        driver.findElement(By.xpath("//span[contains(text(),'Tutorials')]")).click();
    }
}
