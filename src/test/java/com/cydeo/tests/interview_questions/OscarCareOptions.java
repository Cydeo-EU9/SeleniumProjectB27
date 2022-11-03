package com.cydeo.tests.interview_questions;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class OscarCareOptions {


    @Test
     public void oscar_care_options_test(){

        Driver.getDriver().get("https://www.hioscar.com/care-options");

        Driver.getDriver().findElement(By.xpath("//span[.='Search network']")).click();

        Set<String> allWindowHandles = Driver.getDriver().getWindowHandles();

        for(String each: allWindowHandles){
            Driver.getDriver().switchTo().window(each);
        }

        Driver.getDriver().findElement(By.xpath("//div[@class='Dropdown_visibleContent__NGHUm']")).click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.elementToBeClickable( Driver.getDriver().findElement(By.xpath("//li[@id='20232023']"))));
        Driver.getDriver().findElement(By.xpath("//li[@id='20232023']")).click();

        Driver.getDriver().findElement(By.xpath("(//div[@class='Dropdown_visibleContent__NGHUm'])[2]")).click();
        wait.until(ExpectedConditions.elementToBeClickable( Driver.getDriver().findElement(By.cssSelector("#SMALL_GROUPEmployer-provided"))));
        Driver.getDriver().findElement(By.cssSelector("#SMALL_GROUPEmployer-provided")).click();

        Driver.getDriver().findElement(By.xpath("(//div[@class='Dropdown_visibleContent__NGHUm'])[3]")).click();
        wait.until(ExpectedConditions.elementToBeClickable( Driver.getDriver().findElement(By.xpath("//div[.='Oscar']"))));
        Driver.getDriver().findElement(By.xpath("//div[.='Oscar']")).click();

        Driver.getDriver().findElement(By.xpath("(//div[@class='Dropdown_visibleContent__NGHUm'])[4]")).click();
        wait.until(ExpectedConditions.elementToBeClickable( Driver.getDriver().findElement(By.xpath("//div[.='New Jersey']"))));
        Driver.getDriver().findElement(By.xpath("//div[.='New Jersey']")).click();

        wait.until(ExpectedConditions.elementToBeClickable( Driver.getDriver().findElement(By.xpath("//button[@type='button'][2]"))));
        Driver.getDriver().findElement(By.xpath("//button[@type='button'][2]")).click();

        Assert.assertTrue(Driver.getDriver().getTitle().contains("Oscar"));

    }

}
