package page.object.practice;

import org.junit.Test;
import page.object.pages.ButtonsPage;

import static org.junit.Assert.assertTrue;

public class ButtonsPageTest extends FunctionalTest {

    @Test
    public void clickAllButtons() {
        FunctionalTest.driver.get("https://formy-project.herokuapp.com/buttons");
        ButtonsPage buttonsPage = new ButtonsPage(FunctionalTest.driver);

        assertTrue(buttonsPage.isInitialized());

        buttonsPage.clickFirstButton();
        buttonsPage.clickSecondButton();
        buttonsPage.clickThirdButton();
        buttonsPage.clickFourthButton();
        buttonsPage.clickFifthButton();
        buttonsPage.clickSixthButton();
        buttonsPage.clickSeventhButton();
        buttonsPage.clickEightButton();
        buttonsPage.clickNinthButton();
        buttonsPage.clickTenthButton();
        buttonsPage.clickEleventhButton();
        buttonsPage.clickDropdownLink1();
        buttonsPage.clickDropdownLink2();
    }
}
