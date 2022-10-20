package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class LibraryLoginPageWithoutPOM {

//    public LibraryLoginPageWithoutPOM(){
//        PageFactory.initElements(Driver.getDriver(), this);
//    }

    public WebElement signInButton = Driver.getDriver().findElement(By.xpath("//button[.='Sign in']"));

    public WebElement fieldRequiredErrorMessage =  Driver.getDriver().findElement(By.xpath("//div[.='This field is required.']/div"));


}
