import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CheckboxesPageTest extends FunctionalTest{
    @DataProvider(name = "DataForCSSCheckboxPage")
    public static Object[][] dataForCSS() {
        return new Object[][]{
                {"#checkbox-1"},
                {"#checkbox-2"},
                {"#checkbox-3"}
        };
    }

    @DataProvider(name = "DataForXpathCheckboxPage")
    public static Object[][] dataForXPath() {
        return new Object[][]{
                {"//*[@id ='checkbox-1']"},
                {"//*[@id ='checkbox-2']"},
                {"//*[@id ='checkbox-3']"}
        };
    }
    @Test(dataProvider = "DataForCSSCheckboxPage")
    public void clickAllCheckboxesByCss(String dataSCCSelector){
        driver.get("https://formy-project.herokuapp.com/checkbox");
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
        checkboxesPage.clickAllCheckboxesByCSS(dataSCCSelector);

    }
    @Test(dataProvider = "DataForXpathCheckboxPage")
    public void clickAllCheckboxesByXpath(String dataXPathSelector){
        driver.get("https://formy-project.herokuapp.com/checkbox");
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
        checkboxesPage.clickAllCheckboxesByXPath(dataXPathSelector);
    }
}
