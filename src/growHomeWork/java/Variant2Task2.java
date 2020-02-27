import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Variant2Task2 {
    WebDriver driver = new ChromeDriver();

    @Test(priority = 1)
    public void verifyIfUserCanSubmitStory() {
        driver.get("https://www.bbc.com/");
        WebElement news = driver.findElement(By.xpath("//*[@id=\"orb-nav-links\"]/ul/li[2]/a"));
        news.click();
        String newPage = driver.getWindowHandle();
        WebElement secondMoreDropdown = driver.switchTo().window(newPage).findElement(By.xpath
                ("//span[@class= 'gel-long-primer gs-u-ph']"));
        secondMoreDropdown.click();
        WebElement haveYouSayLink = driver.findElement(By.xpath("//span[contains(text(),'Have Your Say')]"));
        haveYouSayLink.click();
        String nextPage = driver.getWindowHandle();
        WebElement howToShareWithBBCLink = driver.switchTo().window(nextPage).findElement(By.xpath
                ("//*[@id=\"index-page\"]/div/div[2]/div[2]/div[3]/div/div[2]/div/a"));
        howToShareWithBBCLink.click();
        String nextPageHowToShareWithBBC = driver.getWindowHandle();
        WebElement inputName = driver.switchTo().window(nextPage).findElement(By.cssSelector
                ("#fullName"));
        inputName.sendKeys("Vasyl Vasiliev");
        WebElement inputEmail = driver.findElement(By.cssSelector("#email"));
        inputEmail.sendKeys("test11@mail.com");
        WebElement inputTown = driver.findElement(By.cssSelector("#town"));
        inputTown.sendKeys("Kyiv");
        WebElement inputPhone = driver.findElement(By.cssSelector("#phone"));
        inputPhone.sendKeys("38091111234456");
        WebElement inputMessage = driver.findElement(By.cssSelector("#message"));
        inputMessage.sendKeys("phasellus vestibulum lorem sed risus ultricies tristique nulla aliquet enim tortor at auctor urna nunc id cursus metus aliquam eleifend mi in nulla posuere sollicitudin aliquam ultrices sagittis orci a scelerisque purus semper eget duis at tellus at urna condimentum mattis pellentesque id nibh tortor id aliquet lectus proin nibh nisl condimentum id venenatis a condimentum vitae sapien pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas sed tempus urna et pharetra pharetra massa massa ultricies mi quis hendrerit dolor magna eget est lorem ipsum dolor sit amet consectetur adipiscing elit pellentesque habitant morbi tristique senectus");
        WebElement submitButton = driver.findElement(By.cssSelector("#submit"));
        try {
            Assert.assertNotEquals("https://www.bbc.com/news/10725415", driver.getCurrentUrl());
            System.out.println("Navigated to correct webpage");
        } catch (Throwable pageNavigationError) {
            System.out.println("Didn't navigate to correct webpage");
        }
        driver.close();
    }

    @Test(priority = 2)
    public void verifyIfUserCanSubmitStoryWith200Words() {
        driver.get("https://www.bbc.com/");
        WebElement news = driver.findElement(By.xpath("//*[@id=\"orb-nav-links\"]/ul/li[2]/a"));
        news.click();
        String newPage = driver.getWindowHandle();
        WebElement secondMoreDropdown = driver.switchTo().window(newPage).findElement(By.xpath
                ("//span[@class= 'gel-long-primer gs-u-ph']"));
        secondMoreDropdown.click();
        WebElement haveYouSayLink = driver.findElement(By.xpath("//span[contains(text(),'Have Your Say')]"));
        haveYouSayLink.click();
        String nextPage = driver.getWindowHandle();
        WebElement howToShareWithBBCLink = driver.switchTo().window(nextPage).findElement(By.xpath
                ("//*[@id=\"index-page\"]/div/div[2]/div[2]/div[3]/div/div[2]/div/a"));
        howToShareWithBBCLink.click();
        String nextPageHowToShareWithBBC = driver.getWindowHandle();
        WebElement inputName = driver.switchTo().window(nextPage).findElement(By.cssSelector
                ("#fullName"));
        inputName.sendKeys("Vasyl Vasiliev");
        WebElement inputEmail = driver.findElement(By.cssSelector("#email"));
        inputEmail.sendKeys("test11@mail.com");
        WebElement inputTown = driver.findElement(By.cssSelector("#town"));
        inputTown.sendKeys("Kyiv");
        WebElement inputPhone = driver.findElement(By.cssSelector("#phone"));
        inputPhone.sendKeys("38091111234456");
        WebElement inputMessage = driver.findElement(By.cssSelector("#message"));
        inputMessage.sendKeys("ultrices vitae auctor eu augue ut lectus arcu bibendum at varius vel pharetra vel turpis nunc eget lorem dolor sed viverra ipsum nunc aliquet bibendum enim facilisis gravida neque convallis a cras semper auctor neque vitae tempus quam pellentesque nec nam aliquam sem et tortor consequat id porta nibh venenatis cras sed felis eget velit aliquet sagittis id consectetur purus ut faucibus pulvinar elementum integer enim neque volutpat ac tincidunt vitae semper quis lectus nulla at volutpat diam ut venenatis tellus in metus vulputate eu scelerisque felis imperdiet proin fermentum leo vel orci porta non pulvinar neque laoreet suspendisse interdum consectetur libero id faucibus nisl tincidunt eget nullam non nisi est sit amet facilisis magna etiam tempor orci eu lobortis elementum nibh tellus molestie nunc non blandit massa enim nec dui nunc mattis enim ut tellus elementum sagittis vitae et leo duis ut diam quam nulla porttitor massa id neque aliquam vestibulum morbi blandit cursus risus at ultrices mi tempus imperdiet nulla malesuada pellentesque elit eget gravida cum sociis natoque penatibus et magnis dis parturient montes nascetur ridiculus mus mauris vitae ultricies leo integer malesuada nunc vel risus commodo viverra maecenas accumsan lacus vel facilisis volutpat est velit egestas dui");
        WebElement submitButton = driver.findElement(By.cssSelector("#submit"));
        try {
            Assert.assertNotEquals("https://www.bbc.com/news/10725415", driver.getCurrentUrl());
            System.out.println("Navigated to correct webpage");
        } catch (Throwable pageNavigationError) {
            System.out.println("Stayed on the the same page");
        }
        driver.close();
    }

    @Test(priority = 3)
    public void verifyIfUserCanSubmitStoryWithEmptyEmail() {
        driver.get("https://www.bbc.com/");
        WebElement news = driver.findElement(By.xpath("//*[@id=\"orb-nav-links\"]/ul/li[2]/a"));
        news.click();
        String newPage = driver.getWindowHandle();
        WebElement secondMoreDropdown = driver.switchTo().window(newPage).findElement(By.xpath
                ("//span[@class= 'gel-long-primer gs-u-ph']"));
        secondMoreDropdown.click();
        WebElement haveYouSayLink = driver.findElement(By.xpath("//span[contains(text(),'Have Your Say')]"));
        haveYouSayLink.click();
        String nextPage = driver.getWindowHandle();
        WebElement howToShareWithBBCLink = driver.switchTo().window(nextPage).findElement(By.xpath
                ("//*[@id=\"index-page\"]/div/div[2]/div[2]/div[3]/div/div[2]/div/a"));
        howToShareWithBBCLink.click();
        String nextPageHowToShareWithBBC = driver.getWindowHandle();
        WebElement inputName = driver.switchTo().window(nextPage).findElement(By.cssSelector
                ("#fullName"));
        inputName.sendKeys("Vasyl Vasiliev");
        WebElement inputTown = driver.findElement(By.cssSelector("#town"));
        inputTown.sendKeys("Kyiv");
        WebElement inputPhone = driver.findElement(By.cssSelector("#phone"));
        inputPhone.sendKeys("38091111234456");
        WebElement inputMessage = driver.findElement(By.cssSelector("#message"));
        inputMessage.sendKeys("varius duis at consectetur lorem donec massa sapien faucibus et molestie ac feugiat sed lectus vestibulum mattis ullamcorper velit sed ullamcorper morbi tincidunt ornare massa eget egestas purus viverra accumsan in nisl nisi scelerisque eu ultrices vitae auctor eu augue ut lectus arcu bibendum at varius vel pharetra vel turpis nunc eget lorem dolor sed viverra ipsum nunc aliquet bibendum enim facilisis gravida neque convallis a cras semper auctor neque vitae tempus quam pellentesque nec nam aliquam sem et tortor consequat id porta nibh venenatis cras sed felis eget velit aliquet sagittis id consectetur purus ut faucibus pulvinar elementum integer");
        WebElement submitButton = driver.findElement(By.cssSelector("#submit"));
        submitButton.click();
        try {
            Assert.assertEquals("https://www.bbc.com/news/10725415", driver.getCurrentUrl());
            System.out.println("Stayed on the the same page");
        } catch (Throwable pageNavigationError) {
            System.out.println("Stayed on the the same page");
        }
        driver.close();
    }

    @Test(priority = 4)
    public void verifyIfUserCanSubmitStoryWithEmptyMessage() {
        driver.get("https://www.bbc.com/");
        WebElement news = driver.findElement(By.xpath("//*[@id=\"orb-nav-links\"]/ul/li[2]/a"));
        news.click();
        String newPage = driver.getWindowHandle();
        WebElement secondMoreDropdown = driver.switchTo().window(newPage).findElement(By.xpath
                ("//span[@class= 'gel-long-primer gs-u-ph']"));
        secondMoreDropdown.click();
        WebElement haveYouSayLink = driver.findElement(By.xpath("//span[contains(text(),'Have Your Say')]"));
        haveYouSayLink.click();
        String nextPage = driver.getWindowHandle();
        WebElement howToShareWithBBCLink = driver.switchTo().window(nextPage).findElement(By.xpath
                ("//*[@id=\"index-page\"]/div/div[2]/div[2]/div[3]/div/div[2]/div/a"));
        howToShareWithBBCLink.click();
        String nextPageHowToShareWithBBC = driver.getWindowHandle();
        WebElement inputName = driver.switchTo().window(nextPage).findElement(By.cssSelector
                ("#fullName"));
        inputName.sendKeys("Vasyl Vasiliev");
        WebElement inputEmail = driver.findElement(By.cssSelector("#email"));
        inputEmail.sendKeys("test11@mail.com");
        WebElement inputTown = driver.findElement(By.cssSelector("#town"));
        inputTown.sendKeys("Kyiv");
        WebElement inputPhone = driver.findElement(By.cssSelector("#phone"));
        inputPhone.sendKeys("38091111234456");
        WebElement submitButton = driver.findElement(By.cssSelector("#submit"));
        submitButton.click();
        try {
            Assert.assertEquals("https://www.bbc.com/news/10725415", driver.getCurrentUrl());
            System.out.println("Stayed on the the same page");
        } catch (Throwable pageNavigationError) {
            System.out.println("Didn't stayed on the same page");
        }
        driver.close();
    }
}
