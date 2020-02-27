import org.testng.annotations.DataProvider;


public class DataProviderCheckboxesPageChecking {

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
}
