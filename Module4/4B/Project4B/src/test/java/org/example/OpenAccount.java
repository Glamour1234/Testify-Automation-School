package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenAccount {

    @Test
    public void openNewAccount() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/mac/IdeaProjects/P4B/src/chromedriver");
        //launch browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //navigates to url
        driver.get("https://parabank.parasoft.com");
        //enter username
        driver.findElement(By.name("username")).sendKeys("mantra123");
        //enter password
        driver.findElement(By.name("password")).sendKeys("Password@12");
        //click on login button
        driver.findElement(By.xpath("//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[3]/input[1]")).click();

        //open account
        driver.findElement(By.xpath("//a[contains(text(),'Open New Account')]")).click();
        //right click on account type dropdown
        WebElement accType = driver.findElement(By.xpath("//select[@id='type']"));
        Actions mouse = new Actions(driver);
        mouse.contextClick(accType).build().perform();
        Thread.sleep(3000);
        Select select = new Select(accType);
        select.selectByVisibleText("CHECKING");
        //click on open new account button
        driver.findElement(By.xpath("//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='rightPanel']/div[1]/div[1]/form[1]/div[1]/input[1]")).click();
        //assert that account has been created
        String newAcc = driver.findElement(By.xpath("//h1[contains(text(),'Account Opened!')]")).getText();
         //newAcc.getText();
        System.out.println(newAcc);

        //Assert.assertEquals(idText,newAcc.getText());

    }
}
