package com.qa.ilCarro.fw;

import com.qa.ilCarro.model.UserData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase{

    public SessionHelper(WebDriver wd) {
        super(wd);
    }

    public void login(String userEmail, String password) {
       initLogin();
       fillLoginForm(userEmail, password);
       confirmLogin();
    }
    public void initLogin() {
        click(By.cssSelector("[href='/login']"));
    }

    public void fillLoginForm(String userEmail, String password) {
        type(By.cssSelector("[name='email']"), userEmail);
        type(By.cssSelector("[name='password']"), password);
    }

    public void confirmLogin() {
        confirm();
    }
}
