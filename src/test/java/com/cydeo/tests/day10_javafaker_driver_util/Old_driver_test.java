package com.cydeo.tests.day10_javafaker_driver_util;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Old_driver_test {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        // set up chrome and create WebDriver instance
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @Test
    public void googleTitle(){
        driver.get("https://google.com");
        System.out.println("google test driver = " + ((RemoteWebDriver) driver).getSessionId());
    }

    @Test
    public void yahooTitle(){
//        WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
//        searchBox.sendKeys(ConfigurationReader.getProperty("search.keyword") + Keys.ENTER);

        driver.get("https://yahoo.com");
        System.out.println("yahoo test driver = " + ((RemoteWebDriver) driver).getSessionId());
    }

    @Test
    public void etsyTitle(){
//        String actualTitle = driver.getTitle();
//        String expectedTitle = ConfigurationReader.getProperty("search.keyword") + " - Google Search";
//        Assert.assertEquals(actualTitle,expectedTitle);

        driver.get("https://etsy.com");
        System.out.println("etsy test driver = " + ((RemoteWebDriver) driver).getSessionId());
    }



}
