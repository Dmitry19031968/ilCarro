package com.qa.ilCarro.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase{

    public SessionHelper(WebDriver wd) {
        super(wd);
    }

    public void login(String userEmail, String password) {
       // initLogin();


    }
    public void initLogin() {
        click(By.cssSelector("[href='/login']"));
    }

    public void fillLoginForm(String userEmail, String password) {
        type(By.name("user"), userEmail);
        type(By.name("password"), password);
    }
    public void confirmLogin() {
        waitForElementClickableAndClick(By.id("login"), 30);
    }
}
