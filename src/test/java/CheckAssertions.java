import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckAssertions {

    @Test
    public void checkAssertions() {
        System.setProperty("webdriver.chrome.driver", "/Users/katerynakuzenkova/Desktop/Drivers/chromedriver");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.youtube.com/");
        Assert.assertEquals("Youtube", chromeDriver.getTitle());
        Assert.assertEquals("Youtube", chromeDriver.getTitle(), "Strings are not matching" );
        Assert.assertEquals("Youtube",chromeDriver.getTitle());
        Assert.assertEquals("Youtube", chromeDriver.getTitle());
        Assert.assertTrue(true);

    }
}

