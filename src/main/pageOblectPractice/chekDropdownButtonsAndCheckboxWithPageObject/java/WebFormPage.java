import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class WebFormPage extends PageObject {

    public WebFormPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "first-name")
    private WebElement firstName;

    @FindBy(id = "last-name")
    private WebElement lastName;

    @FindBy(id = "job-title")
    private WebElement jobTittle;

    @FindBy(id = "radio-button-1")
    private WebElement highSchoolButton;

    @FindBy(id = "checkbox-1")
    private WebElement manCheckbox;

    @FindBy(id="select-menu")
    private WebElement selector;

    @FindBy(id = "datepicker")
    private  WebElement calendar;

    @FindBy(xpath = "//*[@role='button']")

    private WebElement submitButton;
    public boolean isInitialized() {
        return firstName.isDisplayed();
    }

    public void enterName(String firstName, String lastName) {
        this.firstName.clear();
        this.firstName.sendKeys(firstName);

        this.lastName.clear();
        this.lastName.sendKeys(lastName);
    }
    public void enterJobTittle(String jobTittle){
        this.jobTittle.clear();
        this.jobTittle.sendKeys(jobTittle);
    }
    public void selectLevelOfEducation(){
       this.highSchoolButton.click();
    }
    public void chooseSex(){
        this.manCheckbox.click();
    }
    public void choseYearsOfExperience(){
        WebElement selector = this.selector;
        Select dropdown = new Select(selector);
        dropdown.selectByValue("2");
    }
    public void enterDate(String date){
        this.calendar.sendKeys(date);
    }
    public ReceiptPageFromWebForm submit() {
        submitButton.click();
        return new ReceiptPageFromWebForm(driver);
    }

}
