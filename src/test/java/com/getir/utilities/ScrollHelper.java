package com.getir.utilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import com.getir.step_definitions.Initialize;
public class ScrollHelper {
    private AndroidDriver driver=Initialize.driver;

    public void scrollVerticalHelper(String text){
        driver.findElement(MobileBy.AndroidUIAutomator(
               "new UiScrollable(new UiSelector().scrollable(true))"+
              ".scrollTextIntoView(\""+text+"\")"));
    }
    public void scrollHorizontalHelper(String text){
        driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))"+
                        ".setAsHorizontalList(\""+text+"\")"));
    }
}
