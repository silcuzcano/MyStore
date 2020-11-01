package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MyAccountPage;

import static org.testng.Assert.assertEquals;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfullLogin(){
        LoginPage loginPage = homePage.clickSignIn();
        loginPage.setEmailField("avantica.pruebas.qa@gmail.com");
        loginPage.setPasswordField("Avantica2015");
        MyAccountPage myAccountPage = loginPage.clickLoginButton();
        assertEquals(myAccountPage.getNamePage(), "MY ACCOUNT", "Name Page incorrect");

    }
}
