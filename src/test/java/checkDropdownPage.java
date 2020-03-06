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
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void clickDropdownButton() {
        driver.get("https://formy-project.herokuapp.com/dropdown");
        driver.findElement(By.xpath("//button[@class='btn btn-primary dropdown-toggle']")).click();
    }

    @AfterMethod
    public void goBackToDropdownButtonPage() {
        driver.navigate().back();
    }

    @AfterClass
    public void cleanUp() {
        driver.quit();
    }

    @DataProvider
    public static Object[][] dataProviderForDropdownXpath() {
        return new Object[][]{
                {"1", "autocomplete"},
                {"2", "buttons"},
                {"3", "checkbox"},
                {"4", "datepicker"},
                {"5", "dragdrop"},
                {"6", "dropdown"},
                {"7", "enabled"},
                {"8", "fileupload"},
                {"9", "filedownload"},
                {"10", "keypress"},
                {"11", "modal"},
                {"12", "scroll"},
                {"13", "radiobutton"},
                {"14", "switch-window"},
                {"15", "form"}
        };
    }

    @Test(dataProvider = "dataProviderForDropdownXpath")
    public void checkAllDropdownLinks(String i, String urlName) {
        driver.findElement(By.xpath("html/body/div/div/div/a["+i+"]")).click();
        String newPage = driver.getWindowHandle();
       driver.navigate().refresh();
        Assert.assertEquals(driver.getCurrentUrl(), "https://formy-project.herokuapp.com/"+ urlName, "URLs are not matching");
    }
}


