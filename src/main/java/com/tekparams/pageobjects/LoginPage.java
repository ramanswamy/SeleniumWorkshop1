package com.tekparams.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    public WebElement txtEmail;
    public WebElement txtPassword;
    public WebElement btnLogin;

    public void email(WebDriver driver){
        txtEmail=driver.findElement(By.xpath("//input[@id='email']"));
        txtEmail.sendKeys("ramanswamy@rediffmail.com");
    }
    public void password(WebDriver driver){
        txtPassword=driver.findElement(By.xpath("//input[@id='password']"));
        txtPassword.sendKeys("EKY9GJ");
    }

    public WebElement login(WebDriver driver){
        btnLogin=driver.findElement(By.xpath("//button[contains(text(),\"Login\")]"));
        btnLogin.click();
        return btnLogin;
    }
}
