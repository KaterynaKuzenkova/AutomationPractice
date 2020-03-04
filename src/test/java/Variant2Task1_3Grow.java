import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Variant2Task1_3Grow {
    private WebDriver driver;

    @BeforeClass
    public void init() {
        driver = new ChromeDriver();
    }

    @AfterClass
    public void cleanup() {
        driver.quit();
    }

    @Test
    public void storeCategoryTextAndSearchIt() {
        driver.get("https://www.bbc.com/");
      driver.findElement(By.xpath("//*[@id=\"orb-nav-links\"]/ul/li[2]/a")).click();
        String newPage = driver.getWindowHandle();
        WebElement categoryText = driver.switchTo().window(newPage).findElement(By.xpath
                ("//a[@class= 'gs-c-section-link gs-c-section-link--truncate nw-c-section-link nw-o-link nw-o-link--no-visited-state']/span"));
        String textToSearch = categoryText.getText();
        WebElement searchBar = driver.findElement(By.id("orb-search-q"));
        searchBar.sendKeys(textToSearch);
        searchBar.submit();
        WebElement articleTittle = driver.switchTo().window(newPage).findElement(By.xpath
                ("//*[@id=\"search-content\"]/ol/li[1]/article/div/h1/a"));
        Assert.assertEquals(articleTittle.getText(), "World's End: World's End",
                "Tittle of article is not matching with adjusted text");

    }
}
