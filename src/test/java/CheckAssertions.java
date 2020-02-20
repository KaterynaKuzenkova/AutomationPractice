import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class CheckAssertions {

    @Test
    public void checkAssertions() {
        System.setProperty("webdriver.chrome.driver", "/Users/katerynakuzenkova/Desktop/Drivers/chromedriver");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.youtube.com/");

        Assert.assertEquals(chromeDriver.getTitle(), "YouTube");
        Assert.assertEquals(chromeDriver.getTitle(), "YouTube", "Strings are not matching" );
        Assert.assertEquals(chromeDriver.getTitle().startsWith("You"), true);
        Assert.assertTrue(chromeDriver.getTitle().endsWith("ube"));
        Assert.assertTrue(chromeDriver.getTitle().endsWith("Tube"), "Strings are not matching");
        Assert.assertFalse(chromeDriver.getTitle().startsWith("oi"));
        Assert.assertFalse(chromeDriver.getTitle().endsWith("de"), "AssertFalse test failed");
    }
}

