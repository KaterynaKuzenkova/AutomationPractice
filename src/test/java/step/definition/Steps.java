package step.definition;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Steps {
    private WebDriver driver;

    @Given("^Open the Chrome and open Linkedin Login Page$")
    public void open_the_Chrome_and_launch_the_application() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");

    }

    @When("^Enter the Username and Password$")
    public void enter_the_Username_and_Password() {
        driver.findElement(By.id("username")).sendKeys("test111");
        driver.findElement(By.id("password")).sendKeys("testpassword123");
    }

    @Then("^Click Sign In button$")
    public void click_Sign_In_Button() {
        driver.findElement(By.xpath("//*[@class='btn__primary--large from__button--floating']")).click();
    }

    @Then("^Close chrome driver$")
    public void close_chrome_driver() {
        driver.quit();
    }

}
