package com.tekparams.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class Base {
    public static WebDriver driver;


    public WebDriver getDriverInstance(String strBrowserType){
        switch (strBrowserType){
            case "chrome":
            {
                ChromeOptions chromeOptions = new ChromeOptions();
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver(chromeOptions);
                driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
                break;
            }
            case "edge":
            {
                EdgeOptions edgeOptions = new EdgeOptions();
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver(edgeOptions);
                break;
            }
            case "firefox":
            {
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver(firefoxOptions);
                break;
            }
            default:{
                System.out.println("invalid broser...");
            }
        }
        return driver;
    }

}
