import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class DropdownPage extends PageObject{

    public DropdownPage(WebDriver driver) {
        super(driver);
    }
   public void checkAllDropdownLinks(String i, String urlName) {
       driver.findElement(By.xpath("html/body/div/div/div/a["+i+"]")).click();
       String newPage = driver.getWindowHandle();
       driver.navigate().refresh();
       Assert.assertEquals(driver.getCurrentUrl(), "https://formy-project.herokuapp.com/"+ urlName, "URLs are not matching");
   }
}
