import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckEmailHappyPath {
    @Test(dataProvider = "DataForEmailHappyPath", dataProviderClass = DataProviderEmailsChecking.class)
    public void verifyEmailHappyPath(String email) {
        boolean actualResult = Email.isEmailCorrect(email);
        Assert.assertTrue(actualResult, "Happy path test failed");
    }
}
