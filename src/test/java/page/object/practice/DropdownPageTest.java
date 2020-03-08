package page.object.practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DropdownPageTest extends FunctionalTestNGDropdownPage {

    @DataProvider
    public static Object[][] dataProviderForDropdownXpath() {
        return new Object[][]{
                {"1", "autocomplete"},
                {"2", "buttons"},
                {"3", "checkbox"},
                {"4", "datepicker"},
                {"5", "dragdrop"},
                {"6", "dropdown"},
                {"7", "enabled"},
                {"8", "fileupload"},
                {"9", "filedownload"},
                {"10", "keypress"},
                {"11", "modal"},
                {"12", "scroll"},
                {"13", "radiobutton"},
                {"14", "switch-window"},
                {"15", "form"}
        };
    }

    @Test(dataProvider  = "dataProviderForDropdownXpath")
    public void checkAllDropdownLinks(String i, String urlName ){
        DropdownPage dropdownPage = new DropdownPage(FunctionalTestNGDropdownPage.driver);
        dropdownPage.checkAllDropdownLinks(i, urlName);
    }
}
