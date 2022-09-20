package com.everc.automation.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    @BeforeAll
    public void init(){
        System.out.println("base class setup");
    }
    @AfterAll
    public void tearDown(){
        System.out.println("after all");
    }

}
