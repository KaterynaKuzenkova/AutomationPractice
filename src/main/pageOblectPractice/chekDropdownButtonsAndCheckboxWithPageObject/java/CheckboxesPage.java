import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckboxesPage extends PageObject {

    public CheckboxesPage(WebDriver driver) {
        super(driver);
    }
    public void clickAllCheckboxesByCSS(String dataCssSelector) {
        WebElement checkBox = driver.findElement(By.cssSelector(dataCssSelector));
        driver.findElement(By.cssSelector(dataCssSelector));
        checkBox.click();
    }

    public void clickAllCheckboxesByXPath(String dataXPathSelector) {
        WebElement checkBox = (driver).findElement(By.xpath(dataXPathSelector));
        checkBox.click();
    }
}
