package com.telran.remindly.test;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainScreenTest extends TestBase{

    @Test
    public void appLaunchTest() {
        Assert.assertTrue(app.getMainScreen().isNoReminderTextPresent());
    }

    @Test
    public void appLicensesTest() {
     app.getMainScreen().tapOnMoreOption();
     app.getMainScreen().tapOnLicenses();
     Assert.assertTrue(app.getMainScreen().isNoReminderLicensesPresent());
    }
}