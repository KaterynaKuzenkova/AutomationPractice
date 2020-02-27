
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Variant2Task1_1Task1_2Grow {
    WebDriver driver = new ChromeDriver();

    @Test(priority = 1)
    public void clickNewsAndCheckHeadlineArticle() {
        driver.get("https://www.bbc.com/");
        WebElement news = driver.findElement(By.xpath("//*[@id=\"orb-nav-links\"]/ul/li[2]/a"));
        news.click();
        String newPage = driver.getWindowHandle();
        WebElement headlineArticle = driver.switchTo().window(newPage).findElement(By.xpath
                ("//h3[@class= 'gs-c-promo-heading__title gel-paragon-bold nw-o-link-split__text']"));
        Assert.assertEquals(headlineArticle.getText(), "Countries scramble to respond as virus spreads",
                "Tittle of article is not matching with adjusted text");


    }

    @Test(priority = 2, dataProvider = "DataForArticleTitles", dataProviderClass = DataProviderCheckOtherArticleTitles.class)
    public void checkOtherArticleTitles(String dataForXpath, String expectedText) {
        WebElement articleTitle = driver.findElement(By.xpath(dataForXpath));
        Assert.assertEquals(articleTitle.getText(), expectedText, "Tittle of article is not matching with adjusted text");
    }

}
