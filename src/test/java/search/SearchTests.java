package search;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MyAccountPage;
import pages.SearchPage;
import static org.testng.Assert.assertTrue;

public class SearchTests extends BaseTests {

    @Test
    public void testSuccessfullSearch(){
        LoginPage loginPage = homePage.clickSignIn();
        loginPage.setEmailField("avantica.pruebas.qa@gmail.com");
        loginPage.setPasswordField("Avantica2015");
        MyAccountPage myAccountPage = loginPage.clickLoginButton();
        myAccountPage.setSearchField("Blouse");
        SearchPage searchPage = myAccountPage.clickSearch();
        assertTrue(searchPage.getSearch().contains("BLOUSE"), "Text search incorrect");
    }
}
