package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task18addToCart {

    WebDriver Sdriver = null;
    public Task18addToCart(WebDriver driver){
        Sdriver = driver;
        PageFactory.initElements(Sdriver,this);
    }

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    private WebElement addToCart;
    public WebElement getAddToCart(){
        return addToCart;
    }

    @FindBy(xpath = "//span[contains(text(),'1')]")
    private WebElement openCart;
    public WebElement getOpenCart(){
        return openCart;
    }

}
