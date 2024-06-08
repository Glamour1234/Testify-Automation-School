package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task7 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/mac/IdeaProjects/P4B/src/chromedriver");
        //launch browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //navigates to url
        driver.get("https://worldweather.wmo.int/en/home.html.");
        driver.findElement(By.cssSelector("input[id=q_search]")).sendKeys("Lagos,Nigeria");
        driver.findElement(By.name("submit")).click();


    }
}
