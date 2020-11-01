package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
    private WebDriver driver;
    private By nameSearch = By.cssSelector("span.lighter");

    public SearchPage(WebDriver driver) {
    this.driver=driver;
    }

    public String getSearch(){
        return driver.findElement(nameSearch).getText();
    }

}
