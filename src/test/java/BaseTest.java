import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.ContextMenuPage;
import pages.DynamicControlsPage;
import pages.FileUploadPage;
import pages.MenuPage;

import java.util.concurrent.TimeUnit;

    public class BaseTest {
        WebDriver driver;
        MenuPage menuPage;
        ContextMenuPage contextMenuPage;
        DynamicControlsPage dymanicControlsPage;
        FileUploadPage fileUploadPage;

        @BeforeMethod
        public void initTest() {
            WebDriverManager.chromedriver().setup();
            driver = (WebDriver) new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            menuPage = new MenuPage(driver);
            contextMenuPage = new ContextMenuPage(driver);
            dymanicControlsPage = new DynamicControlsPage(driver);
            fileUploadPage = new FileUploadPage(driver);
        }

        @AfterMethod
        public void finishTest() {
            driver.quit();
        }
    }
