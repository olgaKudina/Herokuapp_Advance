package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;
public class ContextMenuPage extends BasePage implements IConstants{
    public static By CONTEXT_MENU_BUTTON = By.xpath("//*[@href=\"/context_menu\"]");
    public static By HOT_SPOT_BOX = By.xpath("//*[@id='hot-spot']");

    public ContextMenuPage(WebDriver driver) {
        super(driver);
    }
    public void openContextMenuPage(){
        driver.get(CONTEXT_MENU_PAGE_URL);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(CONTEXT_MENU_BUTTON).click();
    }
    public void doubleClickOnBox(){
        Actions action = new Actions(driver);
        WebElement elementLocator = driver.findElement(HOT_SPOT_BOX);
        action.contextClick(elementLocator).perform();
    }
    public String getAlertMessageText(){
        driver.switchTo().alert();
        return driver.switchTo().alert().getText();
    }
    public void closeAlertPopup(){
        driver.switchTo().alert().accept();
    }
}
