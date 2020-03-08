import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class FunctionalTestNGDropdownPage {
    protected static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
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

    @After
    public void cleanUp() {
        driver.manage().deleteAllCookies();
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
}

