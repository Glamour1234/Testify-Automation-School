package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task18loginPage {

    WebDriver Sdriver = null;
    public Task18loginPage(WebDriver driver){
        Sdriver = driver;
        PageFactory.initElements(Sdriver,this);
    }

    @FindBy (xpath = "//input[@id='user-name']")
    private WebElement username;
    public WebElement getUsername(){
        return username;
    }

    @FindBy (xpath = "//input[@id='password']")
    private WebElement password;
    public WebElement getPassword(){
        return password;
    }

    @FindBy (xpath = "//input[@id='login-button']")
    private WebElement login;
    public WebElement getLogin(){
        return login;
    }

}
