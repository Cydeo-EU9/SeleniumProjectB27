package com.cydeo.tests.day3_locators_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_Locators_getText {

    public static void main(String[] args) {
//        1- Open a chrome browser
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

//        2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

//        3- Enter incorrect username: “incorrect”
         // driver.findElement(By.name("USER_LOGIN")).sendKeys("incorrect");
        WebElement inputUserName = driver.findElement(By.name("USER_LOGIN"));
        inputUserName.sendKeys("incorrect");

//        4- Enter incorrect password: “incorrect”
        // Mac: option + enter
        // windows: alt + enter
        WebElement inputPassword = driver.findElement(By.name("USER_PASSWORD"));
        inputPassword.sendKeys("incorrect");

//        5- Click to login button.
        WebElement loginBtn = driver.findElement(By.className("login-btn"));
        loginBtn.click();

//        6- Verify error message text is as expected:
//        Expected: Incorrect login or password
        WebElement errorMessage = driver.findElement(By.className("errortext"));

         String expectedErrorMessage = "Incorrect login or password";
         String actualErrorMessage = errorMessage.getText();

         if(actualErrorMessage.equals(expectedErrorMessage)){
             System.out.println("Error message verification passed!");
         }else{
             System.out.println("Error message verification failed!");
         }

        driver.quit();
    }
}
