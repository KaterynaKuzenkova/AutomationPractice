package page.object.practice;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import page.object.pages.ButtonsPage;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertTrue;

public class ButtonsPageSeleniumGridTest {
    private static WebDriver driver;

    @BeforeClass
    public static void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setBrowserName("chrome");
        capabilities.setPlatform(Platform.MAC);
        driver = new RemoteWebDriver(
                new URL("http://172.20.10.7:4444/wd/hub"), capabilities);
    }

    @AfterClass
    public static void tearDown() {
        driver.close();
    }

    @After
    public void cleanUp() {
        driver.manage().deleteAllCookies();
    }

    @Test
    public void clickAllButtons() {
        driver.get("https://formy-project.herokuapp.com/buttons");
        ButtonsPage buttonsPage = new ButtonsPage(driver);

        assertTrue(buttonsPage.isInitialized());

        buttonsPage.clickFirstButton();
        buttonsPage.clickSecondButton();
        buttonsPage.clickThirdButton();
        buttonsPage.clickFourthButton();
        buttonsPage.clickFifthButton();
        buttonsPage.clickSixthButton();
        buttonsPage.clickSeventhButton();
        buttonsPage.clickEightButton();
        buttonsPage.clickNinthButton();
        buttonsPage.clickTenthButton();
        buttonsPage.clickEleventhButton();
        buttonsPage.clickDropdownLink1();
        buttonsPage.clickDropdownLink2();
    }
}
