package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class MenuPage extends BasePage{
    public MenuPage(WebElement driver){
        super((WebDriver) driver);
    }

    public MenuPage(WebDriver driver) {
        super(driver);
    }

    public void openMenuPage(){
        driver.get("http://the-internet.herokuapp.com/");
    }
}

