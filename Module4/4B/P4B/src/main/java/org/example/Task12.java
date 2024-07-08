package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task12 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/mac/IdeaProjects/P4B/src/chromedriver");
        //launch browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //navigates to url
        driver.get("https://jqueryui.com/resizable/");
        Thread.sleep(3000);
        driver.switchTo().frame(driver.findElement(By.xpath("//body/div[@id='container']/div[@id='content-wrapper']/div[1]/div[1]/iframe[1]")));
        Thread.sleep(3000);
//        String text = driver.findElement(By.xpath("//div[@id='resizable']")).getText() ;
//        System.out.println(" Text is: " + text);
        Thread.sleep(5000);
        WebElement resizeBox = driver.findElement(By.xpath("//body/div[@id='resizable']/div[1]"));

        Actions resize = new Actions(driver);
        resize.clickAndHold(resizeBox).moveByOffset(368,222).build().perform();
        Thread.sleep(5000);
    }
}
