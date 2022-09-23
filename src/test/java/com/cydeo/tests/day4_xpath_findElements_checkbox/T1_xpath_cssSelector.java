package com.cydeo.tests.day4_xpath_findElements_checkbox;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_cssSelector {

    public static void main(String[] args) {
//        1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

//        2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");

//        3. Locate all the WebElements on the page using XPATH and/or CSS
//        locator only (total of 6)
//        a. “Home” link
        // Locate using cssSelector with class attribute syntax #2
        WebElement homeLInk1 = driver.findElement(By.cssSelector("a.nav-link"));

        // Locate using cssSelector with class attribute syntax #1
        WebElement homeLInk2 = driver.findElement(By.cssSelector("a[class='nav-link']"));

        // Locate using xpath with class attribute syntax #1
        WebElement homeLInk3 = driver.findElement(By.xpath("//a[@class='nav-link']"));


//        b. “Forgot password” header


//        c. “E-mail” text


//        d. E-mail input box


//        e. “Retrieve password” button


//        f. “Powered by Cydeo text


//        4. Verify all web elements are displayed.


    }
}
