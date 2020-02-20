import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckEmailUnhappyPath {
    @Test(dataProvider = "AuthenticationUnHappyPath", dataProviderClass = DataProviderEmailsChecking.class)
    public void verifyEmail(String email) {
        boolean actualResult = Email.isEmailCorrect(email);
        Assert.assertTrue(actualResult, "Unhappy path test failed");
    }
}
