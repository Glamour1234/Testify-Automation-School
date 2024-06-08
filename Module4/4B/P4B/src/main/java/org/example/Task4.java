package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/mac/IdeaProjects/P4B/src/chromedriver");
        //launch browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //navigates to url
        driver.get("http://demo.guru99.com/");
        driver.findElement(By.linkText("Security Project")).click();
        driver.findElement(By.name("uid")).sendKeys("eevwrujae@gmail.com");
        driver.findElement(By.name("password")).sendKeys("password@123");

    }
}
