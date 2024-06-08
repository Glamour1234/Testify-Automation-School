package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2b {

    public static void main(String[] args) {

                System.setProperty("webdriver.chrome.driver", "/Users/mac/IdeaProjects/P4B/src/chromedriver");
                //launch browser
                WebDriver driver = new ChromeDriver();
                //navigates to url
                driver.get("http://www.facebook.com");



    }
}
