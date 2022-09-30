package com.cydeo.tests.day6_alerts_iframe_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownPractices {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        // 1. Set up browser
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");

    }

    @Test
    public void dropdownTask4() throws InterruptedException {

        Select selectState = new Select(driver.findElement(By.xpath("//select[@id='state']")));

//        3. Select Illinois using visible text
        selectState.selectByVisibleText("Illinois");

        Thread.sleep(3000);

//        4. Select Virginia using value
        selectState.selectByValue("VA");

//        5. Select California using index
        selectState.selectByIndex(5);

//        6. Verify final selected option is California.
        String actualFinalOption = selectState.getFirstSelectedOption().getText();
        String expectedFinalOption = "California" ;

        Assert.assertEquals(actualFinalOption,expectedFinalOption,"Final selected option verification is failed!");


        //finding index number from options
        int index=-1;
        for (WebElement eachState : selectState.getOptions()) {
            index++;
            if(eachState.getText().equals("California")){
                System.out.println(index);
            }
        }

    }





}
