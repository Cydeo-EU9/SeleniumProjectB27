package com.cydeo.tests.day9_properties_configuration_reader;

import org.testng.annotations.Test;

public class LearningProperties {

    @Test
    public void java_properties_read_test(){

        // key = value
        // getProperty("key") --> "value"
        System.out.println("System.getProperty(\"os.name\") = " + System.getProperty("os.name"));
        System.out.println("System.getProperty(\"user.name\") = " + System.getProperty("user.name"));
        System.out.println("System.getProperty(\"java.version\") = " + System.getProperty("java.version"));

    }
}
