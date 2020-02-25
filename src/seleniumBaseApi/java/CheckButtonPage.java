import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CheckButtonPage {
    WebDriver driver = new ChromeDriver();

    @Test(priority = 1)
    public void clickButtonPrimary() {
        driver.get("https://formy-project.herokuapp.com/buttons");
        WebElement firstButton = (driver).findElement(By.xpath("//*[@class='btn btn-lg btn-primary']"));
        Actions builder = new Actions(driver);
        Action doubleClick = builder.doubleClick(firstButton).build();
        doubleClick.perform();
    }

    @Test(priority = 2)
    public void clickButtonSuccess() {
        WebElement firstButton = (driver).findElement(By.xpath("//*[@class='btn btn-lg btn-success']"));
        Actions builder = new Actions(driver);
        Action doubleClick = builder.doubleClick(firstButton).build();
        doubleClick.perform();
    }

    @Test(priority = 3)
    public void clickButtonInfo() {
        WebElement firstButton = (driver).findElement(By.xpath("//*[@class='btn btn-lg btn-info']"));
        Actions builder = new Actions(driver);
        Action doubleClick = builder.doubleClick(firstButton).build();
        doubleClick.perform();
    }

    @Test(priority = 4)
    public void clickButtonWarning() {
        WebElement firstButton = (driver).findElement(By.xpath("//*[@class='btn btn-lg btn-warning']"));
        Actions builder = new Actions(driver);
        Action doubleClick = builder.doubleClick(firstButton).build();
        doubleClick.perform();

    }

    @Test(priority = 5)
    public void clickButtonDanger() {
        WebElement firstButton = (driver).findElement(By.xpath("//*[@class='btn btn-lg btn-danger']"));
        Actions builder = new Actions(driver);
        Action doubleClick = builder.doubleClick(firstButton).build();
        doubleClick.perform();
    }

    @Test(priority = 6)
    public void clickLink() {
        WebElement firstButton = (driver).findElement(By.xpath("//*[@class='btn btn-lg btn-link']"));
        Actions builder = new Actions(driver);
        Action doubleClick = builder.doubleClick(firstButton).build();
        doubleClick.perform();
    }

    @Test(priority = 7)
    public void clickButtonLeft() {
        WebElement firstButton = (driver).findElement(By.xpath("//button[contains(text(),'Left')]"));
        Actions builder = new Actions(driver);
        Action doubleClick = builder.doubleClick(firstButton).build();
        doubleClick.perform();
    }

    @Test(priority = 8)
    public void clickButtonMiddle() {
        WebElement firstButton = (driver).findElement(By.xpath("//button[contains(text(),'Middle')]"));
        Actions builder = new Actions(driver);
        Action doubleClick = builder.doubleClick(firstButton).build();
        doubleClick.perform();
    }

    @Test(priority = 9)
    public void clickButtonRight() {
        WebElement firstButton = (driver).findElement(By.xpath("//button[contains(text(),'Right')]"));
        Actions builder = new Actions(driver);
        Action doubleClick = builder.doubleClick(firstButton).build();
        doubleClick.perform();
    }

    @Test(priority = 10)
    public void clickButton1() {
        WebElement firstButton = (driver).findElement(By.xpath("//button[contains(text(),'1')]"));
        Actions builder = new Actions(driver);
        Action doubleClick = builder.doubleClick(firstButton).build();
        doubleClick.perform();
    }

    @Test(priority = 11)
    public void clickButton2() {
        WebElement firstButton = (driver).findElement(By.xpath("//button[contains(text(),'2')]"));
        Actions builder = new Actions(driver);
        Action doubleClick = builder.doubleClick(firstButton).build();
        doubleClick.perform();
    }

    @Test(priority = 12)
    public void clickDropdownLink1() {
        WebElement firstButton = (driver).findElement(By.xpath("//*[@id='btnGroupDrop1']"));
        Actions builder = new Actions(driver);
        Action click = builder.click(firstButton).build();
        click.perform();
        WebElement dropdownLink1 = (driver).findElement(By.xpath("//*[contains(text(), 'Dropdown link 1')]"));
        builder.click(dropdownLink1).build();
        click.perform();
    }

    @Test(priority = 13)
    public void clickDropdownLink2() {
        WebElement firstButton = (driver).findElement(By.xpath("//*[@id='btnGroupDrop1']"));
        Actions builder = new Actions(driver);
        Action click = builder.click(firstButton).build();
        click.perform();
        WebElement dropdownLink2 = (driver).findElement(By.xpath("//*[contains(text(), 'Dropdown link 2')]"));
        builder.click(dropdownLink2).build();
        click.perform();
    }
}






