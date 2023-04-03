package com.MobileTesting.pages;

import com.MobileTesting.driver.DriverManager;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    AppiumDriver<MobileElement> driverManager = DriverManager.getDriver();
    public BasePage(){
        PageFactory.initElements(new AppiumFieldDecorator(driverManager), this);
    }
}
