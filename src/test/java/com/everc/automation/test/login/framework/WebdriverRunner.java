package com.everc.automation.test.login.framework;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverRunner {

    private static WebDriver webDriver;
    private WebdriverRunner(){

    }

    public static WebDriver getWebDriver(){
        if(webDriver == null){
            if(System.getProperty("browser").equals("chrome")){
                WebDriverManager.chromedriver().setup();
                webDriver = new ChromeDriver();
            } else if (System.getProperty("browser").equals("firefox")){
                WebDriverManager.firefoxdriver().setup();
                webDriver = new FirefoxDriver();
            } else {
                WebDriverManager.edgedriver().setup();
                webDriver = new EdgeDriver();
            }
        }
        return webDriver;
    }

}
