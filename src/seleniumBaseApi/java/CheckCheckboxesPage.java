import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CheckCheckboxesPage {
    WebDriver driver = new ChromeDriver();

    @Test(dataProvider = "DataForCSSCheckboxPage", dataProviderClass = DataProviderCheckboxesPageChecking.class)
    public void clickAllCheckboxesByCSS(String dataCss) {
        driver.get("https://formy-project.herokuapp.com/checkbox");
        WebElement checkBox = (driver).findElement(By.cssSelector(dataCss));
        driver.findElement(By.cssSelector(dataCss));
        Actions builder = new Actions(driver);
        Action click = builder.click(checkBox).build();
        click.perform();
    }

    @Test(dataProvider = "DataForXpathCheckboxPage", dataProviderClass = DataProviderCheckboxesPageChecking.class)
    public void clickAllCheckboxesByXPath(String dataXPath) {
        WebElement checkBox = (driver).findElement(By.xpath(dataXPath));
        Actions builder = new Actions(driver);
        Action click = builder.click(checkBox).build();
        click.perform();
    }
}
