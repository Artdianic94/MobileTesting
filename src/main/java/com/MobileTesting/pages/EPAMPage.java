package com.MobileTesting.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EPAMPage extends BasePage {
    @AndroidFindBy(xpath = "//*[@text='SKIP']")
    private MobileElement skipInform;
    @AndroidFindBy(xpath = "//*[@text='Log In']")
    private MobileElement logInButton;
    @AndroidFindBy(xpath = "//*[@resource-id='username'] ")
    private MobileElement emailInput;
    @AndroidFindBy(xpath = "//*[@resource-id='kc-login-next']")
    private MobileElement continueBtn;
    @AndroidFindBy(xpath = "//*[@resource-id='password']")
    private MobileElement passwordInput;
    @AndroidFindBy(xpath = "//*[@resource-id='kc-login']")
    private MobileElement signInBtn;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Check your credentials.\"]")
    private MobileElement messageError;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Verified Successfully\"]")
    private MobileElement verifiedSuccessful;
    WebDriverWait wait = new WebDriverWait(driverManager, 60);

    public EPAMPage clickSkip() {
        wait.until(ExpectedConditions.visibilityOf(skipInform));
        skipInform.click();
        return this;
    }

    public EPAMPage selectLogIn() {
        wait.until(ExpectedConditions.visibilityOf(logInButton));
        logInButton.click();
        return this;
    }

    public EPAMPage enterEmail() {
        wait.until(ExpectedConditions.visibilityOf(emailInput));
        emailInput.sendKeys("traineetestdiana@gmail.com");
        return this;
    }

    public EPAMPage clickContinue() {
        continueBtn.click();
        return this;
    }

    public EPAMPage enterPassword() {
        wait.until(ExpectedConditions.visibilityOf(passwordInput));
        passwordInput.sendKeys("9182");
        return this;
    }

    public void clickSignIn() {
        wait.until(ExpectedConditions.visibilityOf(verifiedSuccessful));
        signInBtn.click();
    }

    public String getErrorMessage() {
        wait.until(ExpectedConditions.visibilityOf(messageError));
        return messageError.getAttribute("content-desc");
    }
}
