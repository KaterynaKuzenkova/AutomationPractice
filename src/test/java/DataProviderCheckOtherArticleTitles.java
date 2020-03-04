import org.testng.annotations.DataProvider;

public class DataProviderCheckOtherArticleTitles {
    @DataProvider(name = "DataForArticleTitles")
    public Object[][] articleTitles() {
        return new Object[][]{
                {"//h3[contains(text(), 'Winners and losers on Super Tuesday')]", "Winners and losers on Super Tuesday"},
                {"//h3[contains(text(), 'What unites these two bitter rivals?')]", "What unites these two bitter rivals?"},
                {"//h3[contains(text(), 'US election 2020 : All you need to know')]", "US election 2020 : All you need to know"},
                {"//h3[contains(text(), 'World Bank pledges $12bn coronavirus aid package')]", "World Bank pledges $12bn coronavirus aid package"}
        };
    }
}
