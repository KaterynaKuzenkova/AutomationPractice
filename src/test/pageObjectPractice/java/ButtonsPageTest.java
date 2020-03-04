import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ButtonsPageTest extends FunctionalTest{
    @Test
    public void clickAllButtons(){
       driver.get("https://formy-project.herokuapp.com/buttons");
       ButtonsPage buttonsPage = new ButtonsPage(driver);
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
