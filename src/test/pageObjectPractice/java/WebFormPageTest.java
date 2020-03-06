import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class WebFormPageTest extends FunctionalTest {
    @Test
    public void fillTheForm() {
       driver.get("https://formy-project.herokuapp.com/form");
      WebFormPage webFormPage = new WebFormPage(driver);
        assertTrue(webFormPage.isInitialized());
        webFormPage.enterName("John", "Johnson");
        webFormPage.enterJobTittle("Software Engineer");
        webFormPage.selectLevelOfEducation();
        webFormPage.chooseSex();
        webFormPage.choseYearsOfExperience();
        webFormPage.enterDate("05/03/2020");

        ReceiptPageFromWebForm receiptPageFromWebForm = webFormPage.submit();
        assertTrue(receiptPageFromWebForm.isInitialized());
        String actualResult = receiptPageFromWebForm.confirmationHeader();
        assertEquals("Thanks for submitting your form", actualResult);
    }
}
