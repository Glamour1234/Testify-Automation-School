package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task10 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/mac/IdeaProjects/P4B/src/chromedriver");
        //launch browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //navigates to url
        driver.get("https://jqueryui.com/");
        //navigate to dialog page
        driver.findElement(By.xpath("//a[contains(text(),'Dialog')]")).click();
        WebElement iframe =  driver.findElement(By.xpath("//body/div[@id='container']/div[@id='content-wrapper']/div[1]/div[1]/iframe[1]"));
        driver.switchTo().frame(iframe);
        driver.findElement(By.xpath("//body[1]/div[1]/div[1]/button[1]/span[1]")).click();

    }

}
