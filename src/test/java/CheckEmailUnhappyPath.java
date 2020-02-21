import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckEmailUnhappyPath {
    @Test(dataProvider = "DataForEmailUnhappyPath", dataProviderClass = DataProviderEmailsChecking.class)
    public void verifyEmailUnhappyPath(String email) {
        boolean actualResult = Email.isEmailCorrect(email);
        Assert.assertFalse(actualResult, "Unhappy path test failed");
    }
}
