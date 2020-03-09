package page.object.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import page.object.practice.PageObject;

public class ReceiptPageFromWebForm extends PageObject {

    public ReceiptPageFromWebForm(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h1[contains(text(), 'Thanks for submitting your form')]")
    private WebElement header;

    public boolean isInitialized() {
        return header.isDisplayed();
    }

    public String confirmationHeader() {
        return header.getText();
    }
}
