package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Task11 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/mac/IdeaProjects/P4B/src/chromedriver");
        //launch browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //navigates to url
        driver.get("https://www.google.com/");
        //search for testify limited on google
        driver.findElement(By.name("q")).sendKeys("testify ltd");
        driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/img[1]")).click();
        driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[4]/center[1]/input[1]")).click();
        //click on testify website from google search result
        driver.findElement(By.xpath("//a[@href='https://www.testifyltd.com/']//h3[@class='LC20lb MBeuO DKV0Md'][normalize-space()='Testify Limited']")).click();
        Thread.sleep(3000);
        //scroll down the page
        JavascriptExecutor scrollUp = (JavascriptExecutor) driver;
        scrollUp.executeScript("window.scrollBy(0, 5500)");
        //click on linked Icon
        driver.findElement(By.xpath("//body/div[@id='__next']/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]/*[1]")).click();
        Thread.sleep(3000);
        //cancel pop up
        String mainWindow = driver.getWindowHandle();

        Set<String> windows = driver.getWindowHandles();
          for (String window: windows){
              driver.switchTo().window(window);
          }
          Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[5]/div/div/section/button/icon")).click();

    }
}

