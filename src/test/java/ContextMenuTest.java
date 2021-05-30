import org.testng.Assert;
import org.testng.annotations.Test;

public class ContextMenuTest extends BaseTest {
    @Test
    public void alertOnContextMenuPageDisplayed(){
        contextMenuPage.openContextMenuPage();
        contextMenuPage.doubleClickOnBox();
        String alertText = contextMenuPage.getAlertMessageText();
        Assert.assertEquals(alertText, "You selected a context menu");
        contextMenuPage.closeAlertPopup();
    }
}
