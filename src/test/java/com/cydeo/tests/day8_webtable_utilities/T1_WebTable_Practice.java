package com.cydeo.tests.day8_webtable_utilities;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_WebTable_Practice {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //1. Go to: https://practice.cydeo.com/web-tables
        driver.get("https://practice.cydeo.com/web-tables");

    }



    @Test
    public void order_name_verify_test(){

        //2. Verify Bob’s name is listed as expected.
        //Expected: “Bob Martin”

        WebElement bobMartinName =
                 driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']"));

        String expectedBobName = "Bob Martin";
        String actualBobName = bobMartinName.getText();

        Assert.assertEquals(actualBobName,expectedBobName);

        //3. Verify Bob Martin’s order date is as expected
        //Expected: 12/31/2021

        // You can also use this xpath:  //td[.='Bob Martin']/../td[5]
        WebElement bobMartinOrderDate =
                driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']/following-sibling::td[3]"));

        Assert.assertEquals(bobMartinOrderDate.getText(),"12/31/2021");


    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
