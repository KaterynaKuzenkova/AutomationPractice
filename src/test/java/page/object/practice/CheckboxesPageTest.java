package page.object.practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import page.object.pages.CheckboxesPage;

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

        FunctionalTestNG.driver.get("https://formy-project.herokuapp.com/checkbox");
        CheckboxesPage checkboxesPage = new CheckboxesPage(FunctionalTestNG.driver);
        checkboxesPage.clickAllCheckboxesByCSS(dataSCCSelector);

    }

    @Test(dataProvider = "dataForXPath")
    public void clickAllCheckboxesByXpath(String dataXPathSelector) {
        FunctionalTestNG.driver.get("https://formy-project.herokuapp.com/checkbox");
        CheckboxesPage checkboxesPage = new CheckboxesPage(FunctionalTestNG.driver);
        checkboxesPage.clickAllCheckboxesByXPath(dataXPathSelector);
    }
}
