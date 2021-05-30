package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class DynamicControlsPage extends BasePage implements IConstants{
    public static By DYNAMIC_CONTROLS_BUTTON = By.xpath("//*[@href=\"/dynamic_controls\"]");
    public static By CHECKBOX = By.xpath("//*[@type='checkbox']");
    public static By REMOVE_BUTTON = By.xpath("//*[text()='Remove']");
    public static By ENABLE_BUTTON = By.xpath("//*[text()='Enable']");

    public DynamicControlsPage(WebDriver driver) {
        super(driver);
    }


    public void openDynamicControlsPage() {
        driver.get(DYNAMIC_CONTROLS_PAGE_URL );
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(DYNAMIC_CONTROLS_BUTTON).click();
    }

    public void selectCheckBoxAndRemove() {
        driver.findElement(CHECKBOX).click();
        driver.findElement(REMOVE_BUTTON).click();
    }

    public void waitForMessageDisplayedCheckboxGone() {
        WebElement element = driver.findElement(By.id("message"));
        WebDriverWait wait = new WebDriverWait(driver, 10);
        // wait.until(textToBePresentInElement(element, "It's gone!"));
    }

    public int checkboxIsNotDisplayed() {
        int numberOfElements = driver.findElements(CHECKBOX).size();
        return numberOfElements;
    }

    public boolean isInputDisplayed() {
       return driver.findElement(By.xpath("//*[@type='text']")).isDisplayed();
    }

    public void clickEnableButton() {
        driver.findElement(ENABLE_BUTTON).click();
    }

    public void waitForTextDisplayedEnabledButton() {
        WebElement element = driver.findElement(By.id("message"));
        WebDriverWait wait = new WebDriverWait(driver, 10);
        //  wait.until(textToBePresentInElement(element, "It's enabled!"));
    }
    public boolean isInputEnabled(){
        return driver.findElement(By.xpath("//*[@type='text']")).isEnabled();

    }
}