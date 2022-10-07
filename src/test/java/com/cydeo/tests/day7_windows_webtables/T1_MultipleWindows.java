package com.cydeo.tests.day7_windows_webtables;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_MultipleWindows {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        // 1. Set up browser
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/windows");

    }

    @Test
    public void multiple_windows_test(){

        //3. Assert: Title is “Windows”


        //4. Click to: “Click Here” link


        //5. Click to: “CYDEO” link


        //6. Switch to Cydeo page.



        //7. Assert: Title is “Cydeo
    }

    @AfterMethod
    public void tearDown(){
        //driver.close();
        //driver.quit();
    }
}
