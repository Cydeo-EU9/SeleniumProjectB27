package com.cydeo.tests.day9_properties_configuration_reader;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T3_Config_Practice extends TestBase {


    @Test
    public void google_search_test_using_properties(){

//        2- Go to: https://google.com
         // driver.get("https://google.com");
          driver.get(ConfigurationReader.getProperty("google.url"));

//        3- Write “apple” in search box
        WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
        searchBox.sendKeys(ConfigurationReader.getProperty("search.keyword") + Keys.ENTER);

//        4- Verify title:
//        Expected: apple - Google Search
        String actualTitle = driver.getTitle();

      //  String expectedTitle = "apple" + " - Google Search";
        String expectedTitle = ConfigurationReader.getProperty("search.keyword") + " - Google Search";

        Assert.assertEquals(actualTitle,expectedTitle);

    }

}
