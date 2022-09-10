package com.tekparams.actiondriver;


import com.tekparams.base.Base;
import com.tekparams.pageobjects.LoginPage;
import org.openqa.selenium.WebDriver;
import com.tekparams.base.Base.*;
import org.testng.annotations.Test;

public class ActonDriver extends Base {
    String browserType="chrome";
    WebDriver driver1;
    String url = "http://acme-test.uipath.com";

    public void setUp(){
        ActonDriver actonDriver = new ActonDriver();
        driver1=actonDriver.getDriverInstance(browserType);
    }

    @Test
    public void openApplication(){
         setUp();
         driver1.get(url);
         driver1.manage().window().maximize();
    }
    @Test
    public void loginToApplication(){
        LoginPage loginPage = new LoginPage();
        loginPage.email(driver1);
        loginPage.password(driver1);
        loginPage.login(driver1);
    }
    @Test
    public void closeApplication(){
        driver1.quit();
    }
}
