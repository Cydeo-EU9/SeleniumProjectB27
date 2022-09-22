package com.cydeo.tests.day3_locators_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_getText_cssSelector {

    public static void main(String[] args) {
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Verify “Log in” button text is as expected:
        //Expected: Log In

        // Locate with using cssSelector by type attribite:
       // WebElement logInBtn = driver.findElement(By.cssSelector("input[type='submit']"));

        // Locate with using cssSelector by value attribute:
       // WebElement logInBtn =driver.findElement(By.cssSelector("input[value='Log In']"));

        // Locate with using cssSelector by class attribute: with Syntax #2:
       // WebElement logInBtn = driver.findElement(By.cssSelector("input.login-btn"));

        // Locate with using cssSelector by onclick attribute
        //WebElement logInBtn = driver.findElement(By.cssSelector("input[onclick=\"BX.addClass(this, 'wait');\"]"));

        // Locate with using cssSelector by class attribute:
        WebElement logInBtn = driver.findElement(By.cssSelector("input[class='login-btn']"));

        String expectedLoginBtnText = "Log In";
        String actualLoginBtnText = logInBtn.getAttribute("value");

        if(actualLoginBtnText.equals(expectedLoginBtnText)){
            System.out.println("Login text verification passed!");
        }else{
            System.out.println("Login text verification failed!");
        }

    driver.quit();

    }
}
