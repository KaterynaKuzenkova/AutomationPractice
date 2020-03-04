import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CheckCheckboxesPage {
    private WebDriver driver;

    @BeforeClass
    public void init() {
        driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/checkbox");
    }

    @AfterClass
    public void cleanUp() {
        driver.quit();
    }
    @DataProvider(name = "DataForCSSCheckboxPage")
    public static Object[][] dataForCSS() {
        return new Object[][]{
                {"#checkbox-1"},
                {"#checkbox-2"},
                {"#checkbox-3"}
        };
    }

    @DataProvider(name = "DataForXpathCheckboxPage")
    public static Object[][] dataForXPath() {
        return new Object[][]{
                {"//*[@id ='checkbox-1']"},
                {"//*[@id ='checkbox-2']"},
                {"//*[@id ='checkbox-3']"}
        };
    }
    @Test(dataProvider = "DataForCSSCheckboxPage")
    public void clickAllCheckboxesByCSS(String dataCssSelector) {
        WebElement checkBox = driver.findElement(By.cssSelector(dataCssSelector));
        driver.findElement(By.cssSelector(dataCssSelector));
        checkBox.click();
    }

    @Test(dataProvider = "DataForXpathCheckboxPage")
    public void clickAllCheckboxesByXPath(String dataXPathSelector) {
        WebElement checkBox = (driver).findElement(By.xpath(dataXPathSelector));
        checkBox.click();
    }
}
