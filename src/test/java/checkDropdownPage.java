import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

public class checkDropdownPage {
    private WebDriver driver;

    @BeforeClass
    public void init() {
        driver = new ChromeDriver();
    }

    @AfterClass
    public void cleanUp() {
        driver.quit();
    }
    @DataProvider(name = "DataForDropdownLoop")
    public static Object[][] dataForDropdownLoop() {
        return new Object[][]{
                {""},
                {"//*[@id ='checkbox-2']"},
                {"//*[@id ='checkbox-3']"}
        };
    @Test
    public void checkAllDropdownLinks() throws InterruptedException {
        driver.get("https://formy-project.herokuapp.com/dropdown");
        for(int i=1; i <=15; i++  ){
            driver.findElement(By.id("dropdownMenuButton")).click();
            driver.wait(500);

        }

        int quantity = 15;
        for (int i = 1; i <= quantity; i++){

        }
    }

    }

