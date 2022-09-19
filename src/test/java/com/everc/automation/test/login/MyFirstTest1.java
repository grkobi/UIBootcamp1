package com.everc.automation.test.login;

import com.everc.automation.test.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.swing.interop.SwingInterOpUtils;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Date;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class MyFirstTest1 extends BaseTest {

    String bank;
    @AfterAll
    public void tearDown(){
        System.out.println("After all1");
    }

    @BeforeEach
    public void beforeTest(){
        System.out.println("Before each");
    }

    @AfterEach
    public void afterTest(){
        System.out.println("After test");
    }

    @Test
    public void myFirstTest() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        // WebDriverManager.firefoxdriver().setup();
        WebDriver webdriver = new ChromeDriver();
        webdriver.get("https://google.com");
        //Thread.sleep(millis: 10_000);
      //  Assertions.assertEquals(webdriver.getTitle(), actual);
        webdriver.close();

    }
    @Test
    public void newTest(){
        System.out.println("new test executed");
    }
    @BeforeAll
    public void setup(){
       bank = "testBank";
        System.out.println("This is setup");
    }
}
