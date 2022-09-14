package com.telran.remindly.fw;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MainScreenHelper extends HelperBase{


        public MainScreenHelper(AppiumDriver driver) {
            super(driver);
        }

        public boolean isNoReminderTextPresent() {
            return isElementPresent(By.xpath("//*[@resource-id='com.blanyal.remindly:id/no_reminder_text']"));
            // return isElementPresent(By.id("no_reminder_text"));
        }
        public void tapOnMoreOption() {
        tap(By.className("android.widget.ImageView"));
    }
        public void tapOnLicenses() {
            tap(By.id("com.blanyal.remindly:id/title"));
        }
        public int getTotalReminders() {
            List<WebElement> id = driver.findElements(By.id("thumbnail_image"));
            int idCount = id.size();
            System.out.println("Total reminders quantity: " + idCount);
            return idCount;
        }

    public boolean isNoReminderLicensesPresent() {
        return isElementPresent(By.id("com.blanyal.remindly:id/licenses_text_view"));
    }
}
