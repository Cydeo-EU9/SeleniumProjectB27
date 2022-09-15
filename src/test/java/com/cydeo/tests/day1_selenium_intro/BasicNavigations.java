package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) {

        // 1. set up web driver manager
        WebDriverManager.chromedriver().setup();

        // 2. opening an empty browser with creating instance driver
        WebDriver driver = new ChromeDriver();

        // 3. go to "https://www.tesla.com"
        driver.get("https://www.tesla.com");



    }
}
