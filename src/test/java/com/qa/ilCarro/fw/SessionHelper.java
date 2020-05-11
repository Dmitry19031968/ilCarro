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



    }
    public void initLogin() {
        click(By.cssSelector("[href='/login']"));
    }

    public void confirmLogin() {
        confirm();
    }

    public void fillLoginForm(UserData user) {
        type(By.cssSelector("#email"), user.getEmail());
        type(By.cssSelector("#password"), user.getPassword());
    }
}
