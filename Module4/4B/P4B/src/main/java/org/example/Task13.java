package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Task13 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/mac/IdeaProjects/P4B/src/chromedriver");
        //launch browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //navigates to url
        driver.get("https://selenium08.blogspot.com/");
        driver.findElement(By.xpath("//div[contains(text(),'Search')]")).click();
        driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys("Demo dropdown");
        driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/label[1]/div[1]/*[1]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Demo Dropdown List')]")).click();
        //right click country dropdown
        WebElement country = driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[3]/div[1]/div[1]/select[1]"));
        Actions mouse = new Actions(driver);
        mouse.contextClick(country).build().perform();
        //select an option from dropdown
        Thread.sleep(3000);
        Select select = new Select(country);
        select.selectByVisibleText("Nigeria");
        //Scoll up the page
        JavascriptExecutor scrollUp = (JavascriptExecutor) driver;
        scrollUp.executeScript("window.scrollBy(0, 5500)");


    }
}


