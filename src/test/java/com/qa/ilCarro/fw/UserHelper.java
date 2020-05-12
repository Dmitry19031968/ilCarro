package com.qa.ilCarro.fw;

import com.qa.ilCarro.model.UserData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends HelperBase{
    public UserHelper(WebDriver wd){
        super (wd);
    }

    public void clickSignUpButton() {
        click(By.cssSelector("[href^='/signup']"));
    }

    public void fillRegistrationForm(UserData user) {
        type(By.cssSelector("#first_name"), user.getfName());
        type(By.cssSelector("#second_name"), user.getlName());
        type(By.cssSelector("#email"), user.getEmail());
        type(By.cssSelector("#password"), user.getPassword());

        click(By.cssSelector("#check_policy"));
    }

    public void confirmRegistration(){
        click(By.cssSelector("[type='submit']"));
    }

    public void clickLogInButton() {
        click(By.cssSelector("[href^='/login']"));
    }

    public void fillLoginForm(UserData user) {
        type(By.cssSelector("[name='email']"), user.getEmail());
        type(By.cssSelector("[name='password']"), user.getPassword());
    }
}
