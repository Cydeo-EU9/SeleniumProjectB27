package com.cydeo.tests.day11_upload_actions_javascriptexecutor;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class T6_Scroll_JavaScriptExecutor {

    @Test
    public void scroll_javascriptexecutor_test(){

        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://practice.cydeo.com/infinite_scroll
        driver.get("https://practice.cydeo.com/infinite_scroll");

        //3- Use below JavaScript method and scroll



        //a. 750 pixels down 10 times.


        //b. 750 pixels up 10 times
    }
}
