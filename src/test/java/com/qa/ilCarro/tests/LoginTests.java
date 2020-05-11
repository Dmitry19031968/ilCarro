package com.qa.ilCarro.tests;

import com.qa.ilCarro.model.UserData;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {

    @Test
    public void loginFromHeader(){
        app.getUser().clickLogInButton();
        app.getUser().fillLoginForm(new UserData().withEmail("b@b.com").withPassword("12345Aa"));
        app.getUser().confirm();
    }
}
