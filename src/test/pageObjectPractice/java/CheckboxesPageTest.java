import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CheckboxesPageTest extends FunctionalTestNG {

    @DataProvider
    public static Object[][] dataForCSS() {
        return new Object[][]{
                {"#checkbox-1"},
                {"#checkbox-2"},
                {"#checkbox-3"}
        };
    }

    @DataProvider
    public static Object[][] dataForXPath() {
        return new Object[][]{
                {"//*[@id ='checkbox-1']"},
                {"//*[@id ='checkbox-2']"},
                {"//*[@id ='checkbox-3']"}
        };
    }

    @Test(dataProvider = "dataForCSS")
    public void clickAllCheckboxesByCss(String dataSCCSelector) {

        driver.get("https://formy-project.herokuapp.com/checkbox");
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
        checkboxesPage.clickAllCheckboxesByCSS(dataSCCSelector);

    }

    @Test(dataProvider = "dataForXPath")
    public void clickAllCheckboxesByXpath(String dataXPathSelector) {
        driver.get("https://formy-project.herokuapp.com/checkbox");
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
        checkboxesPage.clickAllCheckboxesByXPath(dataXPathSelector);
    }
}
