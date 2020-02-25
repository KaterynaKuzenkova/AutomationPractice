import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Variant3Task1Grow {
    WebDriver driver = new ChromeDriver();
    @Test
            public void clickNews(){
        driver.get("https://www.bbc.com/");
        WebElement news = driver.findElement(By.xpath("//*[@id=\"orb-nav-links\"]/ul/li[2]/a"));
        Actions builder = new Actions(driver);
        Action click = builder.click(news).build();
        click.perform();
        String elementText = news.getText();
        Assert.assertEquals("Tenerife", news.getText());
    }


}
