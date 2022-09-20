package com.everc.automation.framework;
import com.everc.automation.config.TestConfig;
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
            if(TestConfig.CONFIG.browser().equals("chrome")){
                WebDriverManager.chromedriver().setup();
                webDriver = new ChromeDriver();
            } else if (TestConfig.CONFIG.browser().equals("firefox")){
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
