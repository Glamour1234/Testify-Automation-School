package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class OtherActions {
    WebDriver driver;
    @BeforeTest
      public void beforeTest(){
        System.setProperty("webdriver.chrome.driver", "/Users/mac/IdeaProjects/P4B/src/chromedriver");
        //launch browser
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //navigates to url
        driver.get("https://parabank.parasoft.com");
        //enter username
        driver.findElement(By.name("username")).sendKeys("mantra123");
        //enter password
        driver.findElement(By.name("password")).sendKeys("Password@12");
        //click on login button
        driver.findElement(By.xpath("//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[3]/input[1]")).click();

    }

    @Test(priority = 1)
    public void transferFunds() throws InterruptedException {
        //click on transfer funds
        driver.findElement(By.xpath("//a[contains(text(),'Transfer Funds')]")).click();
        driver.findElement(By.xpath("//input[@id='amount']")).sendKeys("100");
        driver.findElement(By.xpath("//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='rightPanel']/div[@id='transferApp']/div[@id='showForm']/form[@id='transferForm']/div[2]/input[1]")).click();
        Thread.sleep(5000);
    }

    @Test(priority = 2)
    public void payBill() throws InterruptedException {
        //Pay Bill
        driver.findElement(By.xpath("//a[contains(text(),'Bill Pay')]")).click();
        //fill form for bill payment
        driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys("Lawal Johnson");
        driver.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("Abba Johnson");
        driver.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys("Ikeja");
        driver.findElement(By.xpath("//tbody/tr[4]/td[2]/input[1]")).sendKeys("Lagos");
        driver.findElement(By.xpath("//tbody/tr[5]/td[2]/input[1]")).sendKeys("100101");
        driver.findElement(By.name("payee.phoneNumber")).sendKeys("08067158436");
        driver.findElement(By.xpath("//tbody/tr[8]/td[2]/input[1]")).sendKeys("13844");
        driver.findElement(By.xpath("//tbody/tr[9]/td[2]/input[1]")).sendKeys("13844");
        driver.findElement(By.xpath("//tbody/tr[11]/td[2]/input[1]")).sendKeys("200");
        driver.findElement(By.xpath("//tbody/tr[14]/td[2]/input[1]")).click();
        Thread.sleep(5000);

    }

    @Test(priority = 3)
    public void findTransaction() throws InterruptedException {
        //Find transaction 1
        driver.findElement(By.xpath("//a[contains(text(),'Find Transactions')]")).click();
        //Scroll up the page
        JavascriptExecutor scrollUp = (JavascriptExecutor) driver;
        scrollUp.executeScript("window.scrollBy(0, 500)");

        driver.findElement(By.xpath("//input[@id='amount']")).sendKeys("200");
        driver.findElement(By.xpath("//button[@id='findByAmount']")).click();
        Thread.sleep(3000);

        // Assert that a transaction history is returned for $200
        driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).click();
        WebElement transactionHistory = driver.findElement(By.xpath("//td[contains(text(),'$200.00')]"));
        String transactionHistoryText = transactionHistory.getText();
        Assert.assertEquals(transactionHistoryText, "$200.00");

        //Find transaction 2
        driver.findElement(By.xpath("//a[contains(text(),'Find Transactions')]")).click();
        //Scroll up the page
        JavascriptExecutor scrollUp2 = (JavascriptExecutor) driver;
        scrollUp2.executeScript("window.scrollBy(0, 500)");

        driver.findElement(By.xpath("//input[@id='amount']")).sendKeys("102");
        driver.findElement(By.xpath("//button[@id='findByAmount']")).click();
        Thread.sleep(3000);

        // Assert that a transaction history is returned for $102
        WebElement table = driver.findElement(By.xpath("//th[contains(text(),'Transaction')]"));
        List<WebElement> rows = table.findElements(By.xpath("//tbody/tr[1]/td[2]"));
        // Assert that the table has no rows
        Assert.assertTrue(rows.isEmpty(), null);
    }

    @Test(priority = 4)
    public void updateContactInfo() throws InterruptedException {
        //clear zip code
        driver.findElement(By.xpath("//a[contains(text(),'Update Contact Info')]")).click();
        WebElement clearZipCode = driver.findElement(By.name("customer.address.zipCode"));
        clearZipCode.clear();
        Thread.sleep(3000);

        //Extract last 5 digits of phone number
        WebElement copyPhonenumber =  driver.findElement(By.xpath("//input[@id='customer.address.zipCode']"));
        String phoneNumber = copyPhonenumber.getAttribute("value");
        //System.out.println(phoneNumber);
        Thread.sleep(2000);

        String last5Digits = phoneNumber.substring(phoneNumber.length() - 5);
        // Paste the last 5 digits into the ZIP code field
        //System.out.println("Last 5 Digits: " + last5Digits);
        clearZipCode.sendKeys(last5Digits);
        driver.findElement(By.xpath("//tbody/tr[8]/td[2]/input[1]")).click();
        Thread.sleep(5000);

    }

    @Test(priority = 5)
    public void bookFlight() throws InterruptedException {

        // Launch a new window using JavaScriptExecutor
        ((JavascriptExecutor) driver).executeScript("window.open();");

        // Get the list of all window handles
        List<String> windowHandles = new ArrayList<>(driver.getWindowHandles());

        // Switch to the new window (the last window handle in the list)
        driver.switchTo().window(windowHandles.get(1));

        // Navigate to the new URL in the new window
        driver.get("https://blazedemo.com/");

        // -SelectBoston and Rome as departure and arrival destinations.

        driver.findElement(By.xpath("//select[@name='fromPort']")).click();
        WebElement departure = driver.findElement(By.xpath("//select[@name='fromPort']"));
        Thread.sleep(2000);
        Select select = new Select(departure);
        select.selectByVisibleText("Boston");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//select[@name='toPort']")).click();
        WebElement arrival = driver.findElement(By.xpath("//select[@name='toPort']"));
        Thread.sleep(2000);
        Select select1 = new Select(arrival);
        select1.selectByVisibleText("Rome");
        Thread.sleep(3000);
        // -Click on "FindFlights"
        driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
        Thread.sleep(2000);

        // -Select a flight
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/input[1]")).click();

        // -Fill all other fields with validinputs
        driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("Elohor");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='address']")).sendKeys("United States");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("New York");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='state']")).sendKeys("New York");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("UA954");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys("12345678910");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='nameOnCard']")).sendKeys("victor odogwu");
        Thread.sleep(2000);

        //-Copy the flightnumber and paste into the Zipcodefield
    Actions actions = new Actions(driver);

    WebElement zip = driver.findElement(By.xpath("//input[@id='zipCode']"));

    WebElement zip2 = driver.findElement(By.xpath("//p[normalize-space()='Flight Number: UA954']"));
    Thread.sleep(2000);

    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0, window.scrollHeight)");
    Thread.sleep(2000);

    //Enter Text in Zip
    actions.moveToElement(zip);
    // Press CTRL "a" and "c"
    actions.sendKeys("UA954").keyDown(Keys.CONTROL).sendKeys("a","c").build().perform();
    Thread.sleep(2000);
    //Press CTRL "v" to paste
    actions.moveToElement(zip2).click().keyDown(Keys.CONTROL).sendKeys("v").build().perform();
    //actions.keyUp(Keys.CONTROL).build().perform();

        // -Tick the'RememberMe'checkbox and Purchaseflight

        driver.findElement(By.xpath("//input[@id='rememberMe']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();

    }

    @AfterClass
    public void quitDriver() {
        driver.quit();
    }

}
