package page.object.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import page.object.practice.PageObject;

public class ButtonsPage extends PageObject {
    @FindBy(xpath = "/html/body/div/form/div[1]/div/div/button[1]")
    private WebElement firstButton;

    @FindBy(xpath = "//*[@class='btn btn-lg btn-success']")
    private WebElement secondButton;

    @FindBy(xpath = "//*[@class='btn btn-lg btn-info']")
    private WebElement thirdButton;

    @FindBy(xpath = "//*[@class='btn btn-lg btn-warning']")
    private WebElement fourthButton;

    @FindBy(xpath = "//*[@class='btn btn-lg btn-danger']")
    private WebElement fifthButton;

    @FindBy(xpath = "//*[@class='btn btn-lg btn-link']")
    private WebElement sixthButton;

    @FindBy(xpath = "//button[contains(text(),'Left')] ")
    private WebElement seventhButton;

    @FindBy(xpath = "//button[contains(text(),'Middle')]")
    private WebElement eightButton;

    @FindBy(xpath = "//button[contains(text(),'Right')]")
    private WebElement ninthButton;

    @FindBy(xpath = "//button[contains(text(),'1')]")
    private WebElement tenthButton;

    @FindBy(xpath = "//button[contains(text(),'2')]")
    private WebElement eleventhButton;

    @FindBy(id = "btnGroupDrop1")
    private WebElement dropdown;

    @FindBy(xpath = "//*[contains(text(), 'Dropdown link 1')]")
    private WebElement dropdownLink1;

    @FindBy(xpath = "//*[contains(text(), 'Dropdown link 2')]")
    private WebElement dropdownLink2;

    public ButtonsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isInitialized() {
        return firstButton.isDisplayed() &&
                secondButton.isDisplayed() &&
                thirdButton.isDisplayed() &&
                fourthButton.isDisplayed() &&
                fifthButton.isDisplayed() &&
                sixthButton.isDisplayed() &&
                seventhButton.isDisplayed() &&
                eightButton.isDisplayed() &&
                ninthButton.isDisplayed() &&
                tenthButton.isDisplayed() &&
                eleventhButton.isDisplayed() &&
                dropdown.isDisplayed();
    }

    public void clickFirstButton() {
        this.firstButton.click();
    }

    public void clickSecondButton() {
        this.secondButton.click();
    }

    public void clickThirdButton() {
        this.thirdButton.click();
    }

    public void clickFourthButton() {
        this.fourthButton.click();
    }

    public void clickFifthButton() {
        this.fifthButton.click();
    }

    public void clickSixthButton() {
        this.sixthButton.click();
    }

    public void clickSeventhButton() {
        this.seventhButton.click();
    }

    public void clickEightButton() {
        this.eightButton.click();
    }

    public void clickNinthButton() {
        this.ninthButton.click();
    }

    public void clickTenthButton() {
        this.tenthButton.click();
    }

    public void clickEleventhButton() {
        this.eleventhButton.click();
    }

    public void clickDropdownLink1() {
        this.dropdown.click();
        this.dropdownLink1.click();
    }

    public void clickDropdownLink2() {
        this.dropdown.click();
        this.dropdownLink2.click();
    }
}
