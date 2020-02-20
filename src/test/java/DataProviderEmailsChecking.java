import org.testng.annotations.DataProvider;

public final class DataProviderEmailsChecking {
    @DataProvider(name = "AuthenticationHappyPath")
    public static Object[][] credentialsHappyPath() {
        return new Object[][] {
                {"iG!@mail.com"},
                {"qawseQWE_!ghyueo98wo@gmail.com"},
                {"test@mm.com"},
                {"qwery@gmail.com"},
                {"test@gmail.lo"},
                {"test@mail.commm"}
        };
    }

    @DataProvider(name = "AuthenticationUnHappyPath")
    public static Object[][] credentialsUnHappyPath() {
        return new Object[][] {
                {"we@gmail.com"},
                {"qwertyuio!_456JHnbert@mail.fr"},
                {"test@i.de"},
                {"test@qwerty.fr"},
                {"test@mail.L"},
                {"test@mail.france"},
                {"+=qY*@mail.com"},
                {"testmail.com"},
                {"test@mailcom"},
                {"  "}
        };
    }
}
