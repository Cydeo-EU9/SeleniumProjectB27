package com.cydeo.tests.day3_locators_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {

    public static void main(String[] args) {

        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Verify “remember me” label text is as expected:
        //Expected: Remember me on this computer
        WebElement rememberMeLabel = driver.findElement(By.className("login-item-checkbox-label"));
        String expectedRememberMeLabel = "Remember me on this computer";
        String actualRememberMeLabel = rememberMeLabel.getText();

        if(actualRememberMeLabel.equals(expectedRememberMeLabel)){
            System.out.println("Remember me label text verification passed!");
        }else{
            System.out.println("Remember me label text verification failed!");
        }


        //4- Verify “forgot password” link text is as expected:
        //Expected: FORGOT YOUR PASSWORD?
        WebElement forgotPasswordLink = driver.findElement(By.className("login-link-forgot-pass"));
        String expectedForgotPasswordLinkText = "FORGOT YOUR PASSWORD?";
        String actualForgotPasswordLinkText = forgotPasswordLink.getText();

        if(actualForgotPasswordLinkText.equals(expectedForgotPasswordLinkText)){
            System.out.println("Forgot password link text verification passed!");
        }else{
            System.out.println("actualForgotPasswordLinkText = " + actualForgotPasswordLinkText);
            System.out.println("expectedForgotPasswordLinkText = " + expectedForgotPasswordLinkText);
            System.out.println("Forgot password link text verification failed!");
        }


        //5- Verify “forgot password” href attribute’s value contains expected:
        //Expected: forgot_password=yes
        String expectedInHref = "forgot_password=yes";
        String actualInHref = forgotPasswordLink.getAttribute("href");

        if(actualInHref.contains(expectedInHref)){
            System.out.println("Href attribute value verification passed!");
        }else{
            System.out.println("Href attribute value verification failed!");
        }

        driver.quit();
    }
}
