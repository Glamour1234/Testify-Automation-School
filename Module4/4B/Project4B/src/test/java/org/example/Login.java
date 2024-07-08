package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Login {

    @Test
    public void login() {
        System.setProperty("webdriver.chrome.driver", "/Users/mac/IdeaProjects/P4B/src/chromedriver");
        //launch browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //navigates to url
        driver.get("https://parabank.parasoft.com");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        //enter username
        driver.findElement(By.name("username")).sendKeys("mantra123");
        //enter password
        driver.findElement(By.name("password")).sendKeys("Password@12");
        //click on login button
         driver.findElement(By.xpath("//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[3]/input[1]")).click();
         //Assert that user is on the logged in and can see the welcome message
        String welcomeMessage = driver.findElement(By.xpath("//b[contains(text(),'Welcome')]")).getText();
        System.out.println(welcomeMessage);

        Assert.assertEquals(welcomeMessage,"Welcome");
    }


}
