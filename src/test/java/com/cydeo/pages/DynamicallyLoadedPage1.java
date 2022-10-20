package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicallyLoadedPage1 {

    public DynamicallyLoadedPage1(){
        // this: will give access to all object/webElements from this class to other classes
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//button[.='Start']")
    public WebElement startButton;

    @FindBy (css = "div#loading")
    public  WebElement loadingBar;

    @FindBy (css = "#username")
    public WebElement inputUsername;

    @FindBy (id ="pwd")
    public WebElement inputPassword;

    @FindBy (xpath = "//button[.='Submit']")
    public WebElement submitButton;

    @FindBy (xpath = "//div[@id='flash']")
    public WebElement errorMessage;
}
