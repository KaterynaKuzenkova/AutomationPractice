import org.testng.annotations.DataProvider;

public class DataProviderCheckOtherArticleTitles {
        @DataProvider(name = "DataForArticleTitles")
        public static Object[][] articleTitles() {
            return new Object[][]{
                    {"//h3[@class='gs-c-promo-heading__title gel-pica-bold nw-o-link-split__text']", "Coronavirus in Europe: epidemic or 'infodemic'?"},
                    {"//h3[@class='gs-c-promo-heading__title gel-pica-bold nw-o-link-split__text']", "Coronavirus: Five countries, five responses"},
                    {"//h3[@class='gs-c-promo-heading__title gel-pica-bold nw-o-link-split__text']", "Dozens hurt as Greek island protests intensify"},
                    {"//h3[@class='gs-c-promo-heading__title gel-pica-bold nw-o-link-split__text']", "Five dead in Milwaukee beer company shooting"},
                    {"//h3[@class='gs-c-promo-heading__title gel-pica-bold nw-o-link-split__text']", "Australia's wild summer sees blast of snow"}
            };
        }
    }
