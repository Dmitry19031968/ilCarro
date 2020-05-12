package com.qa.ilCarro.tests;

import com.qa.ilCarro.model.UserData;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogOutTests extends TestBase {
    @BeforeMethod
    public void loginFromHeader() {
        app.getUser().clickLogInButton();
        app.getUser().fillLoginForm(new UserData().withEmail("b@b.com").withPassword("12345Aa!"));
        app.getUser().confirm();
    }

    @Test
    public void logoutFromHeader() {
        app.getSession().click(By.cssSelector("[href='/login']"));
    }
}
