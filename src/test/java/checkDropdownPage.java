import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class checkDropdownPage {
    private WebDriver driver;

    @BeforeClass
    public void init() {
        driver = new ChromeDriver();
    }

    @AfterClass
    public void cleanUp() {
        driver.quit();
    }

    @BeforeMethod
    public void clickDropdownButton() {
        driver.get("https://formy-project.herokuapp.com/dropdown");
        driver.findElement(By.xpath("//*[@class='btn btn-primary dropdown-toggle']")).click();
    }

    @AfterMethod
    public void goBack() {
        driver.navigate().back();
    }

    @DataProvider(name = "DataProviderForDropdownLoop")
    public static Object[][] dataForDropdownLoop() {
        return new Object[][]{
                {"//*[contains(text(), 'Autocomplete')]", "https://formy-project.herokuapp.com/autocomplete"},
                {"//*[contains(text(), 'Buttons')]", "https://formy-project.herokuapp.com/buttons"},
                {"//*[contains(text(), 'Checkbox')]", "https://formy-project.herokuapp.com/checkbox"},
                {"//*[contains(text(), 'Datepicker')]", "https://formy-project.herokuapp.com/datepicker"},
                {"//*[contains(text(), 'Drag and Drop')]", "https://formy-project.herokuapp.com/dragdrop"},
                {"//*[contains(text(), 'Dropdown')]", "https://formy-project.herokuapp.com/dropdown"},
                {"//*[contains(text(), 'Enabled and disabled elements')]", "https://formy-project.herokuapp.com/enabled"},
                {"//*[contains(text(), 'File Upload')]", "https://formy-project.herokuapp.com/fileupload"},
                {"//*[contains(text(), 'File Download')]", "https://formy-project.herokuapp.com/filedownload"},
                {"//*[contains(text(), 'Key and Mouse Press')]", "https://formy-project.herokuapp.com/keypress"},
                {"//*[contains(text(), 'Modal')]", "https://formy-project.herokuapp.com/modal"},
                {"//*[contains(text(), 'Page Scroll')]", "https://formy-project.herokuapp.com/scroll"},
                {"//*[contains(text(), 'Radio Button')]", "https://formy-project.herokuapp.com/radiobutton"},
                {"//*[contains(text(), 'Switch Window')]", "https://formy-project.herokuapp.com/switch-window"},
                {"//*[contains(text(), 'Complete Web Form')]", "https://formy-project.herokuapp.com/form"}
        };
    }

    @Test(dataProvider = "DataProviderForDropdownLoop")
    public void checkAllDropdownLinks(String xPathDataForInput, String expectedUrl) {
        driver.findElement(By.xpath(xPathDataForInput)).click();
        String newPage = driver.getWindowHandle();
        WebDriver pageUrl = driver.switchTo().window(newPage);
        Assert.assertEquals(expectedUrl, pageUrl.getCurrentUrl(), "URLs are not matching");
    }
}


