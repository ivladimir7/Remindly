package com.telran.remindly.fw;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppManager {

    AppiumDriver driver;

    DesiredCapabilities capabilities;

    MainScreenHelper mainScreen;
    RemindersHelper reminders;

    public MainScreenHelper getMainScreen() {
        return mainScreen;
    }

    public RemindersHelper getReminders() {
        return reminders;
    }

    public void init() throws MalformedURLException {
        capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability( "platformVersion", "8.0.0");
        capabilities.setCapability( "deviceName", "qa_mob");
        capabilities.setCapability( "automationName", "Appium");
        capabilities.setCapability( "appPackage", "com.blanyal.remindly");
        capabilities.setCapability("appActivity", "com.blanyal.remindme.MainActivity");
        capabilities.setCapability("app", "Users/ipaparazzi/Qa_tools/com.blanyal.remindly_2_apps.evozi.com.apk");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

      mainScreen = new MainScreenHelper(driver);
      reminders = new RemindersHelper(driver);

    }
    public void stop() {
        driver.quit();
    }
}
