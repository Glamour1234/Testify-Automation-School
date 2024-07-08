package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2a
{
    public static void main( String[] args )
    {
        System.setProperty("webdriver.chrome.driver", "/Users/mac/IdeaProjects/P4B/src/chromedriver");
        //launch browser
        WebDriver driver = new ChromeDriver();
        //navigates to url
        driver.get("Http://www.google.com");


    }

}
