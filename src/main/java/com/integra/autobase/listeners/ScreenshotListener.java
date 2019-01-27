package com.integra.autobase.listeners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class ScreenshotListener extends TestListenerAdapter {

    @Override
    public void onTestFailure(ITestResult result) {
        // TODO Auto-generated method stub
        super.onTestFailure(result);
    }
}
