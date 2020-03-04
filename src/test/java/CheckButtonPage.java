import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CheckButtonPage {
    private WebDriver driver;

    @BeforeClass
    public void init() {
        driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/buttons");
    }

    @AfterClass
    public void cleanUp() {
        driver.quit();
    }

    @Test(priority = 1)
    public void clickButtonPrimary() {
        WebElement firstButton = driver.findElement(By.xpath("//*[@class='btn btn-lg btn-primary']"));
        firstButton.click();
    }

    @Test(priority = 2)
    public void clickButtonSuccess() {
        WebElement secondButton = driver.findElement(By.xpath("//*[@class='btn btn-lg btn-success']"));
        secondButton.click();
    }

    @Test(priority = 3)
    public void clickButtonInfo() {
        WebElement thirdButton = driver.findElement(By.xpath("//*[@class='btn btn-lg btn-info']"));
        thirdButton.click();
    }

    @Test(priority = 4)
    public void clickButtonWarning() {
        WebElement fourthButton = driver.findElement(By.xpath("//*[@class='btn btn-lg btn-warning']"));
        fourthButton.click();

    }

    @Test(priority = 5)
    public void clickButtonDanger() {
        WebElement fifthButton = driver.findElement(By.xpath("//*[@class='btn btn-lg btn-danger']"));
        fifthButton.click();
    }

    @Test(priority = 6)
    public void clickLink() {
        WebElement sixthButton = driver.findElement(By.xpath("//*[@class='btn btn-lg btn-link']"));
        sixthButton.click();
    }

    @Test(priority = 7)
    public void clickButtonLeft() {
        WebElement seventhButton = driver.findElement(By.xpath("//button[contains(text(),'Left')]"));
        seventhButton.click();
    }

    @Test(priority = 8)
    public void clickButtonMiddle() {
        WebElement eightButton = driver.findElement(By.xpath("//button[contains(text(),'Middle')]"));
        eightButton.click();

    }

    @Test(priority = 9)
    public void clickButtonRight() {
        WebElement ninthButton = driver.findElement(By.xpath("//button[contains(text(),'Right')]"));
        ninthButton.click();
    }

    @Test(priority = 10)
    public void clickButton1() {
        WebElement tenthButton = driver.findElement(By.xpath("//button[contains(text(),'1')]"));
        tenthButton.click();
    }

    @Test(priority = 11)
    public void clickButton2() {
        WebElement eleventhButton = driver.findElement(By.xpath("//button[contains(text(),'2')]"));
        eleventhButton.click();
    }

    @Test(priority = 12)
    public void clickDropdownLink1() {
        WebElement dropdown = driver.findElement(By.id("btnGroupDrop1"));
        dropdown.click();
        WebElement dropdownLink1 = driver.findElement(By.xpath("//*[contains(text(), 'Dropdown link 1')]"));
        dropdownLink1.click();
    }

    @Test(priority = 13)
    public void clickDropdownLink2() {
        WebElement dropdown = driver.findElement(By.id("btnGroupDrop1"));
        dropdown.click();
        WebElement dropdownLink2 = driver.findElement(By.xpath("//*[contains(text(), 'Dropdown link 2')]"));
        dropdownLink2.click();

    }
}






