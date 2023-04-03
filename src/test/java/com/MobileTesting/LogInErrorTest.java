package com.MobileTesting;

import com.MobileTesting.pages.EPAMPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LogInErrorTest extends BaseTest {

    public static final String ERROR_MESSAGE = "Check your credentials.";

    @Test
    public void logInWithErrorTest() {
        EPAMPage epamPage = new EPAMPage();
        epamPage
                .clickSkip()
                .selectLogIn()
                .enterEmail()
                .clickContinue()
                .enterPassword()
                .clickSignIn();
        assertEquals(epamPage.getErrorMessage(), ERROR_MESSAGE, "User didn't receive error message");
    }
}
