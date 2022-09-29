package com.cydeo.tests.day5_testNG_dropdown;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T3_SimpleDropdowns {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        //        1. Open Chrome browser
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void simpleDropdown(){

//        2. Go to https://practice.cydeo.com/dropdown


//        3. Verify “Simple dropdown” default selected value is correct
//        Expected: “Please select an option”


//        4. Verify “State selection” default selected value is correct
//        Expected: “Select a State”

    }


}
