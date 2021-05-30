import org.testng.annotations.Test;

public class FileUploadTest extends BaseTest{
    @Test
    public void fileUploadTest(){
        fileUploadPage.uploadFile();
    }

}
