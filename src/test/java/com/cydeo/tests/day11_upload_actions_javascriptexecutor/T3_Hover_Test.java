package com.cydeo.tests.day11_upload_actions_javascriptexecutor;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T3_Hover_Test {

    @Test
    public void  hover_test(){
        //1. Go to https://practice.cydeo.com/hovers
        Driver.getDriver().get("https://practice.cydeo.com/hovers");

        // Locate all images:
        WebElement image1 = Driver.getDriver().findElement(By.xpath("(//img)[1]"));
        WebElement image2 = Driver.getDriver().findElement(By.xpath("(//img)[2]"));
        WebElement image3 = Driver.getDriver().findElement(By.xpath("(//img)[3]"));

        WebElement user1 = Driver.getDriver().findElement(By.xpath("//h5[text()='name: user1']"));
        WebElement user2 = Driver.getDriver().findElement(By.xpath("//h5[text()='name: user2']"));
        WebElement user3 = Driver.getDriver().findElement(By.xpath("//h5[text()='name: user3']"));


        //2. Hover over to first image


        //3. Assert:
        //a. “name: user1” is displayed
        //b. “view profile” is displayed


        //   4. Hover over to second image


        //   5. Assert:
        //a. “name: user2” is displayed
        //b. “view profile” is displayed


        //   6. Hover over to third image


        //   7. Confirm:
        //a. “name: user3” is displayed
        //b. “view profile” is displayed


    }
}
