import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class DynamicControlsTest extends BaseTest{

        @Test
        public void checkboxTest () {
            dymanicControlsPage.openDynamicControlsPage();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            dymanicControlsPage.selectCheckBoxAndRemove();
            dymanicControlsPage.waitForMessageDisplayedCheckboxGone();
            Assert.assertEquals(dymanicControlsPage.checkboxIsNotDisplayed(), 0);

        }
        @Test
        public void inputTest(){
            dymanicControlsPage.openDynamicControlsPage();
            dymanicControlsPage.isInputDisplayed();
            dymanicControlsPage.clickEnableButton();
            dymanicControlsPage.waitForTextDisplayedEnabledButton();
            Assert.assertTrue(dymanicControlsPage.isInputEnabled());
        }

    }

