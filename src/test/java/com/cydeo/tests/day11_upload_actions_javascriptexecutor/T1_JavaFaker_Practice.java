package com.cydeo.tests.day11_upload_actions_javascriptexecutor;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class T1_JavaFaker_Practice {

    @Test
    public void registration_form(){
//        1. Open browser
//        2. Go to website: https://practice.cydeo.com/registration_form

        // driver --> Driver.getDriver()

          Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));

        Faker faker = new Faker();

//        3. Enter first name
        WebElement firstname = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        firstname.sendKeys(faker.name().firstName());

//        4. Enter last name --> HW

//        5. Enter username
         WebElement username = Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        // only using faker is giving me this way --> rosario.murphy
        // we have to use logic to change the way of returning
         String userName = faker.name().username().replace(".","");
         username.sendKeys(userName);

//        6. Enter email address  :    email.sendKeys(faker.internet().emailAddress())

//        7. Enter password    :      faker.internet().password()


//        8. Enter phone number  : faker.numerify("###-###-####)


//        9. Select a gender from radio buttons
        List<WebElement> genders = Driver.getDriver().findElements(By.xpath("//input[@type='radio']"));
        genders.get(faker.number().numberBetween(0,2)).click();


//        10. Enter date of birth
         WebElement dateOfBirth = Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
         dateOfBirth.sendKeys("10/03/1980");


//        11. Select Department/Office
           Select departmentDropdown = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
           departmentDropdown.selectByIndex(faker.number().numberBetween(1,9));

//        12. Select Job Title


//        13. Select programming language from checkboxes


//        14. Click to sign up button


//        15. Verify success message “You’ve successfully completed registration.” is
//        displayed.

    }
}
