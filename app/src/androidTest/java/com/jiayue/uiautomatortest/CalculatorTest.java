package com.jiayue.uiautomatortest;

import android.support.test.uiautomator.UiAutomatorTestCase;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiScrollable;
import android.support.test.uiautomator.UiSelector;

public class CalculatorTest extends UiAutomatorTestCase {
    public void testDemo() throws UiObjectNotFoundException {
//        getUiDevice().pressHome();
//        UiObject Calculator = new UiObject(new UiSelector().description("计算器"));
//
//        Calculator.clickAndWaitForNewWindow();
//        UiObject seven = new UiObject(new UiSelector().resourceId("com.android.calculator2:id/digit_7"));
//        seven.click();
//        UiObject plus = new UiObject(new UiSelector().resourceId("com.android.calculator2:id/op_add"));
//        plus.click();
//        UiObject one = new UiObject(new UiSelector().resourceId("com.android.calculator2:id/digit_1"));
//        one.click();
//        UiObject result = new UiObject(new UiSelector().resourceId("com.android.calculator2:id/eq"));
//        result.click();
//        getUiDevice().pressBack();
        // Initialize UiDevice instance
        UiDevice mDevice = UiDevice.getInstance(getInstrumentation());


        for (int i = 0; i < 100; i++) {
            mDevice.pressHome();

// Bring up the default launcher by searching for
// a UI component that matches the content-description for the launcher button
            UiObject allAppsButton = mDevice.findObject(new UiSelector().description("应用"));

// Perform a click on the button to bring up the launcher
            allAppsButton.clickAndWaitForNewWindow();

            // 进入设置菜单
            UiObject settingApp = mDevice.findObject(new UiSelector().description("设置"));
            settingApp.click();
            //休眠3秒
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            // 进入语言和输入法设置
            UiScrollable settingItems = new UiScrollable(new UiSelector().scrollable(true));

            UiObject languageAndInputItem = settingItems.getChildByText(
                    new UiSelector().text("语言和输入法"), "语言和输入法", true);
            languageAndInputItem.clickAndWaitForNewWindow();

        }


    }
}