package com.cydeo.tests.day3_locators_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_getText_cssSelector_Practice {

    public static void main(String[] args) {
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        //3- Verify “Reset password” button text is as expected:
        //Expected: Reset password
        WebElement resetPasswordBtn = driver.findElement(By.cssSelector("button.login-btn"));

        String expectedResetBtnText = "Reset password";
        String actualResetBtnText = resetPasswordBtn.getText();

        if(actualResetBtnText.equals(expectedResetBtnText)){
            System.out.println("Reset button text verification passed!");
        }else{
            System.out.println("Reset button text verification failed!");
        }

     driver.quit();

    }
}
