package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task18checkOut {
    WebDriver Sdriver = null;
    public Task18checkOut(WebDriver driver){
    Sdriver = driver;
        PageFactory.initElements(Sdriver,this);
}

    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement checkOut;
    public WebElement getCheckOut(){
        return checkOut;
    }

    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement fName;
    public WebElement getfName(){
        return fName;
    }

    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement lName;
    public WebElement getlName(){
        return lName;
    }

    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement Pcode;
    public WebElement getPcode(){
        return Pcode;
    }

    @FindBy(xpath = "//input[@id='continue']")
    private WebElement cont;
    public WebElement getCont(){
        return cont;
    }

    @FindBy(xpath = "//button[@id='finish']")
    private WebElement finish;
    public WebElement getFinish(){
        return finish;
    }
}
