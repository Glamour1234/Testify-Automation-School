package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task7 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/mac/IdeaProjects/P4B/src/chromedriver");
        //launch browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //navigates to url
        driver.get("https://worldweather.wmo.int/en/home.html");
        Thread.sleep(5000);
        driver.findElement(By.name("query")).sendKeys("lagos, Nigeria");
        Thread.sleep(5000);
        driver.findElement(By.name("submit")).click();

        String weatherDetails = driver.findElement(By.xpath("//body/div[1]/div[6]/div[5]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]" )).getText();
        System.out.println(weatherDetails);



    }
}
