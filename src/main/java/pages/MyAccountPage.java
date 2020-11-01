package pages;

import com.sun.deploy.util.SearchPath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage {
    private WebDriver driver;
    private By namePage = By.cssSelector("h1");
    private By searchField = By.id("search_query_top");
    private By searchButton = By.cssSelector("button.btn.btn-default.button-search");

    public MyAccountPage(WebDriver driver) {
    this.driver = driver;
    }

    public String getNamePage(){
        return driver.findElement(namePage).getText();
    }

    public void setSearchField(String search){
        driver.findElement(searchField).sendKeys(search);
    }

    public SearchPage clickSearch(){
        driver.findElement(searchButton).click();
        return new SearchPage(driver);
    }

}
