package com.cydeo.tests.day5_testNG_dropdown;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Intro {

    @Test (priority = 1 )
    public void test1(){
        System.out.println("Test1 is running...");
    }

    @Test (priority = 2)
    public void mytest2(){
        System.out.println("test2 is running...");
    }


    @BeforeMethod
    public void setUpMethod(){
        System.out.println("--> Before Method is running");
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("-->After Method is running");
    }

}
