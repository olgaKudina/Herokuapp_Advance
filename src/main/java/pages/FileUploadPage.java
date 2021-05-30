package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class FileUploadPage extends BasePage implements IConstants{
    public static By UPLOAD_BUTTON = By.xpath("//*[@id='file-upload']");
    public static By SUBMIT_BATTON = By.xpath("//*[@id='file-submit']");
    public static final By UPLOADED_FILE_TEXT = By.xpath("//*[@id='uploaded-files']");
    public static String FILE_PATH = System.setProperty("webdriver.chrome.driver", "C:\\projects\\Herokuapp_Advance\\src\\test\\Users.txt");
    public FileUploadPage(WebDriver driver) {
        super(driver);
    }
    public void uploadFile(){
            driver.get(FILE_UPLOAD_PAGE_URL);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(UPLOAD_BUTTON).click();
            driver.findElement(UPLOAD_BUTTON).sendKeys(FILE_PATH);
            driver.findElement(SUBMIT_BATTON).click();

        }
    }

