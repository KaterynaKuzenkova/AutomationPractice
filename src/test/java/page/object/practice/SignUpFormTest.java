package page.object.practice;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SignUpFormTest extends FunctionalTest {

    @Test
    public void signUp() {
        FunctionalTest.driver.get("http://www.kimschiller.com/page-object-pattern-tutorial/index.html");

        SignUpPage signUpPage = new SignUpPage(FunctionalTest.driver);
        assertTrue(signUpPage.isInitialized());

        signUpPage.enterName("First", "Last");
        signUpPage.enterAddress("123 Street", "12345");

        ReceiptPage receiptPage = signUpPage.submit();
        assertTrue(receiptPage.isInitialized());

        Assert.assertEquals("Thank you!", receiptPage.confirmationHeader());
    }
}