package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task8 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/mac/IdeaProjects/P4B/src/chromedriver");
        //launch browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //navigates to url
        driver.get("https://idorenyinankoh.github.io/loginPage/");
        Thread.sleep(5000);
        boolean state = driver.findElement(By.xpath("//button[@id='create']")).isEnabled();
        System.out.println(state);

        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Ela");
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Martins");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("el@gmail.com");
        driver.findElement(By.xpath("//input[@id='female']")).click();
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password@12");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password@12");
        driver.findElement(By.xpath("//input[@id='xpLevel']")).sendKeys("Coming soon!");
        Thread.sleep(5000);
        boolean state2 = driver.findElement(By.xpath("//button[@id='create']")).isEnabled();
        System.out.println(state2);
    }
}
