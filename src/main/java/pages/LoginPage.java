package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By emailField = By.id("email");
    private By passwordField = By.id("passwd");
    private By loginButton = By.id("SubmitLogin");

    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    public void setEmailField(String email){
        driver.findElement(emailField).sendKeys(email);
    }

    public void setPasswordField(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public MyAccountPage clickLoginButton(){
        driver.findElement(loginButton).click();
        return new MyAccountPage(driver);
    }


}
